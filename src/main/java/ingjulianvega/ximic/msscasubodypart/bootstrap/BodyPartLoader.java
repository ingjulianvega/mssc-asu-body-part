package ingjulianvega.ximic.msscasubodypart.bootstrap;

import ingjulianvega.ximic.msscasubodypart.domain.BodyPartEntity;
import ingjulianvega.ximic.msscasubodypart.domain.repositories.BodyPartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class BodyPartLoader implements CommandLineRunner {

    private final BodyPartRepository bodyPartRepository;

    @Override
    public void run(String... args) throws Exception {
        if (bodyPartRepository.count() == 0) {
            loadBodyPartObjects();
        }
    }

    private void loadBodyPartObjects() {
        bodyPartRepository.saveAll(Arrays.asList(
                BodyPartEntity.builder().name("Cabeza").build(),
                BodyPartEntity.builder().name("Cuello").build(),
                BodyPartEntity.builder().name("Torax").build(),
                BodyPartEntity.builder().name("Abdomen").build(),
                BodyPartEntity.builder().name("Miembros superiores").build(),
                BodyPartEntity.builder().name("Miembros inferiores").build(),
                BodyPartEntity.builder().name("Columna").build(),
                BodyPartEntity.builder().name("Genital").build()
        ));
    }
}