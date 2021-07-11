package ingjulianvega.ximic.msscasubodypart.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "body-part")
public class BodyPartParameters {

    private String api;
}
