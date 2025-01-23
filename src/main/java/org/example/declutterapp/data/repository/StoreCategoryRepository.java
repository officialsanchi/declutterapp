package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreCategoryRepository extends MongoRepository<StoreCategory, String> {
}
