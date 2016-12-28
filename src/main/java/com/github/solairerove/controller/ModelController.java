package com.github.solairerove.controller;

import com.github.solairerove.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/models", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ModelController {

    private final ModelService service;

    @Autowired
    public ModelController(ModelService service) {
        this.service = service;
    }

    @RequestMapping
    public ResponseEntity getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
