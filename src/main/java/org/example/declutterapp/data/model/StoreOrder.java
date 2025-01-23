package org.example.declutterapp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;

@Data
@Document
public class StoreOrder {
    @Id
    private String id;
    private String numberOfQuantity;
    private String price;
    private LocalDateTime orderDate;
    private String totalPrice;
    private Object item ;
    private Object buyer;

}
