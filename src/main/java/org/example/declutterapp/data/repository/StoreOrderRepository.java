package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreOrderRepository extends MongoRepository<StoreOrder, String> {
}
