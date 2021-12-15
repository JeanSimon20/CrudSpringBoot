package com.vg.areaservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "subarea")
@Data
public class Subarea {
    @Id
    private String IdSubArea;
    private String Tipos;
    private String NombreSubArea;
}
