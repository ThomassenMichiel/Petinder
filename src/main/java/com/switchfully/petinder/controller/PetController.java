package com.switchfully.petinder.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.switchfully.petinder.dto.PetDto;
import com.switchfully.petinder.mapper.PetMapper;
import com.switchfully.petinder.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pets")
@RestController
public class PetController {

    private final PetRepository repository;
    private final PetMapper mapper;

    @Autowired
    PetController(PetRepository repository, PetMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @GetMapping("/hello")
    public String helloPets()  {
        return "Hello Pets!";
    }

    @GetMapping(value = "", produces = "application/json")
    public List<PetDto> pets() {
        return mapper.toDto(repository.getAllPets());
    }

}
