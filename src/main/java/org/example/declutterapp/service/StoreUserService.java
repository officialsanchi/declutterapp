package org.example.declutterapp.service;

import org.example.declutterapp.dtos.storeUserRequest.*;
import org.example.declutterapp.dtos.storeUserResponse.*;
import org.springframework.stereotype.Service;

@Service
public interface StoreUserService {
    StoreUserRegisterResponse registerUser(StoreUserRegisterRequest storeUserRegisterRequest);
   StoreUserDeleteResponse deleteUser(StoreUserDeleteRequest storeUserDeleteRequest);
   StoreUserLoginResponse login(StoreUserLoginRequest storeUserLoginRequest);
   StoreUserLogoutResponse logout( StoreUserLogoutRequest storeUserLogoutRequest);
   StoreUserUpdateResponse updateUser(StoreUserUpdateRequest storeUserUpdateRequest);
}
