package com.vg.areaservice.document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "charges")
@Data
public class Charges {
    @Id
    private String IdRol;
    private String TipRol;
}
