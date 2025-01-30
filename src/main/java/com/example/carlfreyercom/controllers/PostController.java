package com.example.carlfreyercom.controllers;

import com.example.carlfreyercom.models.GenericStringModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "${frontend.url}")
public class PostController {

    @GetMapping(path="/post/{postId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public GenericStringModel getPost(@PathVariable("postId") UUID postId) {
        return new GenericStringModel("This is a fake post: " + postId.toString());
    }
}
