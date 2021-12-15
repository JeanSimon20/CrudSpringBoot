package com.vg.areaservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "area")
@Data
public class Area {
    @Id
    private String IdArea;
    private String IdSubArea;
}
