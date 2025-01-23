package org.example.declutterapp.service;

import org.example.declutterapp.data.model.StoreUser;
import org.example.declutterapp.data.repository.StoreUserRepository;
import org.example.declutterapp.dtos.storeUserRequest.*;
import org.example.declutterapp.dtos.storeUserResponse.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StoreUserServiceImpl implements StoreUserService {
    @Autowired
    private StoreUserRepository storeUserRepository;
    @Override
    public StoreUserRegisterResponse registerUser(StoreUserRegisterRequest storeUserRegisterRequest) {
        StoreUser storeUser = new StoreUser();
        storeUser.setName(  storeUserRegisterRequest.getName());
        storeUser.setEmail( storeUserRegisterRequest.getEmail());
        storeUser.setPassword( storeUserRegisterRequest.getPassword());
        storeUser.setUserAddress( storeUserRegisterRequest.getAddress());
        storeUser.setPhoneNumber( storeUserRegisterRequest.getPhoneNumber());
        storeUser.setCreatedAt( LocalDateTime.now());
        storeUserRepository.save( storeUser );
        StoreUserRegisterResponse storeUserRegisterResponse = new StoreUserRegisterResponse();
        storeUserRegisterResponse.setMessage( "Account created Successfully");
        return storeUserRegisterResponse;
    }

    @Override
    public StoreUserDeleteResponse deleteUser(StoreUserDeleteRequest storeUserDeleteRequest) {
        return null;
    }

    @Override
    public StoreUserLoginResponse login(StoreUserLoginRequest storeUserLoginRequest) {
        return null;
    }

    @Override
    public StoreUserLogoutResponse logout(StoreUserLogoutRequest storeUserLogoutRequest) {
        return null;
    }

    @Override
    public StoreUserUpdateResponse updateUser(StoreUserUpdateRequest storeUserUpdateRequest) {
        return null;
    }
}
