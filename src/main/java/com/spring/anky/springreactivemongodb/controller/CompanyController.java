package com.spring.anky.springreactivemongodb.controller;

import com.spring.anky.springreactivemongodb.model.Company;
import com.spring.anky.springreactivemongodb.service.CompanyService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * Produces a Streaming API
     * at an interval of 1 second
     **/
    @GetMapping(value = "/company/stream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Company> findAllStreamVersion() {
        return companyService.findAll()
                .delayElements(Duration.ofSeconds(1)).log();
    }

    @GetMapping(value = "/company/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Company> findAllSSEVersion() {
        return companyService.findAll()
                .delayElements(Duration.ofSeconds(1)).log();
    }

    @GetMapping("/company")
    public Flux<Company> allPseudoPagination(@RequestParam(value = "q", required = false) String q,
                                             @RequestParam(value = "page", defaultValue = "0") long page,
                                             @RequestParam(value = "size", defaultValue = "10") long size) {
        return companyService.findAll()
                .skip(page * size).take(size)
                .log();
    }
}
