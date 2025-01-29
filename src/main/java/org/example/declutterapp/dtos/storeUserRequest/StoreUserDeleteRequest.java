package org.example.declutterapp.dtos.storeUserRequest;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class StoreUserDeleteRequest {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;
}
