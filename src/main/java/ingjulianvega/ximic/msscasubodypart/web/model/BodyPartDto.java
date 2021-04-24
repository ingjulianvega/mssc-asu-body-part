package ingjulianvega.ximic.msscasubodypart.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyPartDto implements Serializable {

    static final long serialVersionUID = -1471628753577675371L;

    private UUID id;
    private String name;

}
