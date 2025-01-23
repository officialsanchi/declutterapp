package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.StoreCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreCategoryRepository extends MongoRepository<StoreCategory, String> {
}
