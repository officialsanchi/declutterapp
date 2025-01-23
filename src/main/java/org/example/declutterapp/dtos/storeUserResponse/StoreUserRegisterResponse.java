package org.example.declutterapp.dtos.storeUserResponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class StoreUserRegisterResponse {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;


}
