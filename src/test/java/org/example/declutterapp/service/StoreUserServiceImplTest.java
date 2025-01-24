package org.example.declutterapp.service;

import org.example.declutterapp.data.repository.StoreUserRepository;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserRegisterRequest;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserRegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class StoreUserServiceImplTest {
    @Autowired
    private StoreUserService storeUserService;
    @Autowired
    private StoreUserRepository storeUserRepository;

    @Test
   public  void registerUserTest() {
        StoreUserRegisterRequest storeUserRegisterRequest = new StoreUserRegisterRequest();
        storeUserRegisterRequest.setName( storeUserRegisterRequest.getName() );
        storeUserRegisterRequest.setEmail( storeUserRegisterRequest.getEmail() );
        storeUserRegisterRequest.setPassword( storeUserRegisterRequest.getPassword() );
        storeUserRegisterRequest.setAddress( storeUserRegisterRequest.getAddress() );
        storeUserRegisterRequest.setPhoneNumber( storeUserRegisterRequest.getPhoneNumber() );
        storeUserRegisterRequest.setCreatedAt( storeUserRegisterRequest.getCreatedAt() );
        StoreUserRegisterResponse storeUserRegisterResponse =  storeUserService.registerUser( storeUserRegisterRequest );
        assertNotNull(storeUserRegisterResponse);
        assertEquals( storeUserRegisterResponse.getMessage(), "Account created Successfully" );
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