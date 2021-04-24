package ingjulianvega.ximic.msscasubodypart.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyPart implements Serializable {

    static final long serialVersionUID = -7631655966456229170L;

    private String name;

}
