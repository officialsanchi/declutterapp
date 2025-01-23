package org.example.declutterapp.data.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum Review {
    PENDING,
    APPROVED,
    REJECTED


}
