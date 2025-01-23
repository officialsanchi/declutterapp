package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
