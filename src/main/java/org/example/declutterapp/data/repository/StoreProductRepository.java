package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreProductRepository extends MongoRepository<StoreProduct, String> {
}
