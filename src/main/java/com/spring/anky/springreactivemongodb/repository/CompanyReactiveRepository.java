package com.spring.anky.springreactivemongodb.repository;

import com.spring.anky.springreactivemongodb.model.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CompanyReactiveRepository extends ReactiveMongoRepository<Company, String> {
    Flux<Company> findAllByName(String name);
}
