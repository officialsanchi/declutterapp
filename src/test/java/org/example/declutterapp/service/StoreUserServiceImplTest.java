package org.example.declutterapp.service;

import org.example.declutterapp.data.repository.StoreUserRepository;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserRegisterRequest;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserRegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StoreUserServiceImplTest {
    @Autowired
    private StoreUserServiceImpl storeUserServiceImpl;
    @Autowired
    private StoreUserRepository storeUserRepository;

    @Test
    void registerUser() {
        StoreUserRegisterRequest storeUserRegisterRequest = new StoreUserRegisterRequest();
        storeUserRegisterRequest.setName( storeUserRegisterRequest.getName() );
        storeUserRegisterRequest.setEmail( storeUserRegisterRequest.getEmail() );
        storeUserRegisterRequest.setPassword( storeUserRegisterRequest.getPassword() );
        storeUserRegisterRequest.setAddress( storeUserRegisterRequest.getAddress() );
        storeUserRegisterRequest.setPhoneNumber( storeUserRegisterRequest.getPhoneNumber() );
        storeUserRegisterRequest.setCreatedAt( storeUserRegisterRequest.getCreatedAt() );
        StoreUserRegisterResponse storeUserRegisterResponse =  storeUserServiceImpl.registerUser( storeUserRegisterRequest );
        assertEquals(storeUserRegisterResponse.getMessage(), "Account created Successfully");
    }

    @Test
    void deleteUser() {
    }

    @Test
    void login() {
    }

    @Test
    void logout() {
    }

    @Test
    void updateUser() {
    }
}