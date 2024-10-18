package com.example.microservice_a.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

  @GetMapping("/hello-world")
  public String helloWorld() {
    return "Hello World from microservice A";
  }
}
