package com.switchfully.petinder.mapper;

import com.switchfully.petinder.domain.Pet;
import com.switchfully.petinder.dto.PetDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetMapper {
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    Pet toPet(PetDto petDto);

    PetDto toDto(Pet pet);

    List<PetDto> toDto(List<Pet> petList);
}
