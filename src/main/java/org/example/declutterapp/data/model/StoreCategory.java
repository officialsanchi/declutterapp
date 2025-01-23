package org.example.declutterapp.data.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Data
public class StoreCategory {
    @Id
    private String id;
    private String name;
    private String description;

}
