package com.example.carlfreyercom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class CarlFreyerCom {

  @Value("${NAME:World}")
  String name;
  
  @CrossOrigin(origins = "https://www.carlfreyer.com")
  @RestController
  class CarlFreyerComController {
    @GetMapping("/")
    String hello() {
      return "Hello " + name + "!";
    }
    @PutMapping("/")
    String helloPutTest() {
      return "Hello " + name + "!";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(CarlFreyerCom.class, args);
  }
}