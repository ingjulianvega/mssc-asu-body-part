package ingjulianvega.ximic.msscasubodypart.web.controller;


import ingjulianvega.ximic.msscasubodypart.services.BodyPartService;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPart;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartDto;
import ingjulianvega.ximic.msscasubodypart.web.model.BodyPartList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BodyPartController implements BodyPartI {

    private final BodyPartService bodyPartService;

    @Override
    public ResponseEntity<BodyPartList> get() {
        return new ResponseEntity<>(bodyPartService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BodyPartDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(bodyPartService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid BodyPart bodyPart) {
        bodyPartService.create(bodyPart);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid BodyPart bodyPart) {
        bodyPartService.updateById(id, bodyPart);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        bodyPartService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
