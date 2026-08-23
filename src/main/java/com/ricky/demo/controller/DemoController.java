package com.ricky.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class DemoController {

    @GetMapping(value = "/demo")
    public Mono<String> demo() {
        return Mono.just("Hello,Spring Reactor");
    }
}
