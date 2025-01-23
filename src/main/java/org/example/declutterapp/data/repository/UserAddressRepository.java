package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.UserAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAddressRepository extends MongoRepository<UserAddress, String> {
}
