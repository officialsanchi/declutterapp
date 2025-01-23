package org.example.declutterapp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class StoreProduct {
    @Id
    private String id;
    private String title;
    private String description;
    private String price;
    private LocalDateTime createdAt;
    private String categoryId;
    private String status;
    private  StoreCategory storeCategory;
    private StoreUser storeUser;




}
