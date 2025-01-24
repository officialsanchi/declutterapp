package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface StoreUserRepository extends MongoRepository<StoreUser, String> {
}
