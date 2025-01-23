package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreOrderRepository extends MongoRepository<StoreOrder, String> {
}
