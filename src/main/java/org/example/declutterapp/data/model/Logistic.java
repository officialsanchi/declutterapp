package org.example.declutterapp.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum Logistic {

    PICKUP,
    DROP

}
