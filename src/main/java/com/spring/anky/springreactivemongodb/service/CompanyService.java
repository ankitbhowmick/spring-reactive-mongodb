package com.spring.anky.springreactivemongodb.service;

import com.spring.anky.springreactivemongodb.model.Company;
import com.spring.anky.springreactivemongodb.repository.CompanyReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public
class CompanyService {

    private final CompanyReactiveRepository companyReactiveRepository;

    public CompanyService(CompanyReactiveRepository companyReactiveRepository) {
        this.companyReactiveRepository = companyReactiveRepository;
    }

    public Flux<Company> findAll() {
        return companyReactiveRepository.findAll();
    }

    public Flux<Company> findAllByName(final String name) {
        return companyReactiveRepository.findAllByName(name);
    }
}
