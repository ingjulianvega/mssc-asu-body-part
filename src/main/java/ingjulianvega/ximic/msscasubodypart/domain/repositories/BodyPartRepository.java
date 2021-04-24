package ingjulianvega.ximic.msscasubodypart.domain.repositories;

import ingjulianvega.ximic.msscasubodypart.domain.BodyPartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface BodyPartRepository extends JpaRepository<BodyPartEntity, UUID>, JpaSpecificationExecutor<BodyPartEntity> {
}
