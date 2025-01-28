package com.example.carlfreyercom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class CarlFreyerCom {

  @Value("${NAME:World}")
  String name;
  
  @CrossOrigin(origins = "https://carlfreyer-com-front-559135907071.us-east1.run.app")
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