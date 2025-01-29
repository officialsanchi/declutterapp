package org.example.declutterapp.service;

import org.example.declutterapp.data.model.StoreUser;
import org.example.declutterapp.data.repository.StoreUserRepository;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserLoginRequest;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserLogoutRequest;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserRegisterRequest;
import org.example.declutterapp.dtos.storeUserRequest.StoreUserUpdateRequest;
import org.example.declutterapp.dtos.storeUserResponse.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import static org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties.UiService.LOGGER;

@Service
public class StoreUserServiceImpl implements StoreUserService {

    private final Map<String, StoreUser> storeUserMap = new HashMap<>();

    @Autowired
    private StoreUserRepository storeUserRepository;


    private static final Logger LOGGER = Logger.getLogger(StoreUserService.class.getName());
    @Override
    public StoreUserRegisterResponse registerUser(StoreUserRegisterRequest storeUserRegisterRequest) {
        StoreUser storeUser = new StoreUser();
        storeUser.setName( storeUserRegisterRequest.getName() );
        storeUser.setEmail( "nwangwudinma22@gmail.com");
        storeUser.setPassword( "12345" );
        storeUser.setUserAddress( storeUserRegisterRequest.getAddress() );
        storeUser.setPhoneNumber( storeUserRegisterRequest.getPhoneNumber() );
        storeUser.setCreatedAt( LocalDateTime.now() );
        storeUserRepository.save( storeUser );
        StoreUserRegisterResponse storeUserRegisterResponse = new StoreUserRegisterResponse();
        storeUserRegisterResponse.setMessage( "Account created Successfully" );
        return storeUserRegisterResponse;
    }

    @Override
    public StoreUserDeleteResponse deleteUser(String id) {

        Optional<StoreUser> storeUser = storeUserRepository.findById( id );
        if (storeUser.isPresent()) {
            storeUserRepository.deleteById( id );
        } else {
            throw new RuntimeException( "User not found" );
        }
        StoreUserDeleteResponse storeUserDeleteResponse = new StoreUserDeleteResponse();
        storeUserDeleteResponse.setMessage( "Account deleted Successfully" );
        return storeUserDeleteResponse;
    }

    @Override
    public boolean login(String email, String password) {
        if (email == null || password == null || email.isBlank() || password.isBlank()) {
            LOGGER.warning ("Email or password cannot be empty.");
            return false;

        }
        Optional<StoreUser> storeUser = storeUserRepository.findByEmail(email);

        if (storeUser.isPresent() && storeUser.get().getPassword().equals(password)) {
            LOGGER.info("Login successful for user: " + storeUser.get().getEmail());
            return true;
        }

        LOGGER.warning("Invalid email or password.");
        return false;


    }

    @Override
    public StoreUserLogoutResponse logout(StoreUserLogoutRequest storeUserLogoutRequest) {
        return null;
    }

    @Override
    public StoreUserUpdateResponse updateUser(String name, String password, String number) {

        StoreUserUpdateRequest storeUserUpdateRequest1 = new StoreUserUpdateRequest();
        return null;
    }


}



