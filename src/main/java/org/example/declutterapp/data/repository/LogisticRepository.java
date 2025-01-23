package org.example.declutterapp.data.repository;

import org.example.declutterapp.data.model.Logistic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogisticRepository extends MongoRepository<Logistic, String> {
}
