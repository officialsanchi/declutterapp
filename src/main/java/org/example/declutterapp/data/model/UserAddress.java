package org.example.declutterapp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UserAddress {
    @Id
    private String  id;
    private String  street;
    private String  zip;
    private String  country;
    private String  state;
    private String  city;

}
