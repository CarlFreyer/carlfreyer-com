package com.example.carlfreyercom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class CarlFreyerCom {

  @Value("${NAME:World}")
  String name;
  
  @CrossOrigin(origins = "${frontend.url}")
  @RestController
  class CarlFreyerComController {
    @GetMapping("/")
    String hello() {
      return "Hello " + name + "!";
    }
    @PostMapping("/")
    String helloPutTest() {
      return "Hello " + name + "!";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(CarlFreyerCom.class, args);
  }
}