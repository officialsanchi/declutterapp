package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductRepository extends MongoRepository<StoreProduct, String> {
}
