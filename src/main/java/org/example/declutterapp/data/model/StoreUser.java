package org.example.declutterapp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
public class StoreUser {
    @Id
    private String name;
    private String password;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UserAddress userAddress;
    private List <Object> itemListed;
    private List <Object> ordersPlaced;
}
