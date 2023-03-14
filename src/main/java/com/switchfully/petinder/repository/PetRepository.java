package com.switchfully.petinder.repository;

import com.switchfully.petinder.domain.Pet;
import com.switchfully.petinder.domain.PetType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class PetRepository {
    private List<Pet> petList;

    public PetRepository() {
        petList = new ArrayList<>(List.of(
                new Pet(1L, "top", PetType.CATS, ""),
                new Pet(2L, "kek", PetType.CATS, ""))
        );
    }

    public List<Pet> getAllPets() {
        return petList;
    }
}
