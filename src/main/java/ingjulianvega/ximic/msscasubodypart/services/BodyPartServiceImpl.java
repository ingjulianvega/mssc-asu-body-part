package ingjulianvega.ximic.msscasubodypart.services;

import ingjulianvega.ximic.msscasubodypart.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasubodypart.domain.BodyPartEntity;
import ingjulianvega.ximic.msscasubodypart.domain.repositories.BodyPartRepository;
import ingjulianvega.ximic.msscasubodypart.exception.BodyPartException;
import ingjulianvega.ximic.msscasubodypart.web.Mappers.BodyPartMapper;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPart;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartDto;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class BodyPartServiceImpl implements BodyPartService {

    private final BodyPartRepository bodyPartRepository;
    private final BodyPartMapper bodyPartMapper;

    @Cacheable(cacheNames = "bodyPartListCache", condition = "#usingCache == false")
    @Override
    public BodyPartList get(Boolean usingCache) {
        log.debug("get()...");
        return BodyPartList
                .builder()
                .bodyPartList(bodyPartMapper.bodyPartEntityListToBodyPartDtoList(bodyPartRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "bodyPartCache")
    @Override
    public BodyPartDto getById(UUID id) {
        log.debug("getById()...");
        return bodyPartMapper.bodyPartEntityToBodyPartDto(
                bodyPartRepository.findById(id)
                        .orElseThrow(() -> new BodyPartException(ErrorCodeMessages.BODY_PART_NOT_FOUND, "")));
    }

    @Override
    public void create(BodyPart bodyPart) {
        log.debug("create()...");
        bodyPartMapper.bodyPartEntityToBodyPartDto(
                bodyPartRepository.save(
                        bodyPartMapper.bodyPartDtoToBodyPartEntity(
                                BodyPartDto
                                        .builder()
                                        .name(bodyPart.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, BodyPart bodyPart) {
        log.debug("updateById...");
        BodyPartEntity evidenceEntity = bodyPartRepository.findById(id)
                .orElseThrow(() -> new BodyPartException(ErrorCodeMessages.BODY_PART_NOT_FOUND, ""));

        evidenceEntity.setName(bodyPart.getName());

        bodyPartRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        bodyPartRepository.deleteById(id);
    }
}
