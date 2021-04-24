package ingjulianvega.ximic.msscasubodypart.web.Mappers;


import ingjulianvega.ximic.msscasubodypart.domain.BodyPartEntity;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface BodyPartMapper {
    BodyPartDto bodyPartEntityToBodyPartDto(BodyPartEntity intensityEntity);

    BodyPartEntity bodyPartDtoToBodyPartEntity(BodyPartDto intensityDto);

    ArrayList<BodyPartDto> bodyPartEntityListToBodyPartDtoList(List<BodyPartEntity> intensityEntityList);
}
