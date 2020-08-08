package com.spring.anky.springreactivemongodb.repository;

import com.spring.anky.springreactivemongodb.model.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CompanyReactiveRepository extends ReactiveMongoRepository<Company, String> {
}
