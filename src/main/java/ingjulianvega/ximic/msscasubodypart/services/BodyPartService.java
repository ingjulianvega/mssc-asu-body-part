package ingjulianvega.ximic.msscasubodypart.services;


import ingjulianvega.ximic.msscasubodypart.web.model.BodyPart;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartDto;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartList;

import java.util.UUID;

public interface BodyPartService {
    BodyPartList get();

    BodyPartDto getById(UUID id);

    void create(BodyPart bodyPart);

    void updateById(UUID id, BodyPart bodyPart);

    void deleteById(UUID id);
}
