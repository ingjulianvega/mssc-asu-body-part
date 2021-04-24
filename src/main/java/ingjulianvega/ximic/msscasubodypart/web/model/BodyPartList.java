package ingjulianvega.ximic.msscasubodypart.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyPartList implements Serializable {

    static final long serialVersionUID = 1701935536916972775L;

    public ArrayList<BodyPartDto> bodyPartList;
}
