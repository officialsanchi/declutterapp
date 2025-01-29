package org.example.declutterapp.service;

import org.example.declutterapp.data.repository.StoreUserRepository;
import org.example.declutterapp.dtos.storeUserRequest.*;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserDeleteResponse;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserLoginResponse;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserRegisterResponse;
import org.example.declutterapp.dtos.storeUserResponse.StoreUserUpdateResponse;
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
        storeUserRegisterRequest.setEmail( "nwangwudinma22@gmail.com");
        storeUserRegisterRequest.setPassword( "password" );
        storeUserRegisterRequest.setAddress( storeUserRegisterRequest.getAddress() );
        storeUserRegisterRequest.setPhoneNumber( storeUserRegisterRequest.getPhoneNumber() );
        storeUserRegisterRequest.setCreatedAt( storeUserRegisterRequest.getCreatedAt() );
        StoreUserRegisterResponse storeUserRegisterResponse =  storeUserService.registerUser( storeUserRegisterRequest );
        assertNotNull(storeUserRegisterResponse);
        assertEquals( storeUserRegisterResponse.getMessage(), "Account created Successfully" );
    }

    @Test
    void deleteUserTest() {
        StoreUserDeleteRequest storeUserDeleteRequest = new StoreUserDeleteRequest();
        storeUserDeleteRequest.setId( storeUserDeleteRequest.getId() );
        StoreUserDeleteResponse storeUserDeleteResponse = storeUserService.deleteUser( "679a114ef38e5d38d0c5c210" );
         assertEquals( storeUserDeleteResponse.getMessage(), "Account deleted Successfully"    );

    }

    @Test
    void loginTest() {
        StoreUserLoginRequest storeUserLoginRequest = new StoreUserLoginRequest();
        storeUserLoginRequest.setEmail( "nwangwudinma22@gmail.com" );
        storeUserLoginRequest.setPassword( "password" );
        boolean storeUserLoginResponse = storeUserService.login( "nwangwudinma22@gmail.com","password" );
        assertFalse( storeUserLoginResponse,"Login successful for user:" );
    }

    @Test
    void logoutTest() {
        StoreUserLogoutRequest storeUserLogoutRequest = new StoreUserLogoutRequest();

    }

    @Test
    void updateUserTest() {
        StoreUserUpdateRequest storeUserUpdateRequest = new StoreUserUpdateRequest();
        storeUserUpdateRequest.
    }
}