package com.switchfully.petinder.dto;

import com.switchfully.petinder.domain.PetType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class PetDto {
    private Long id;
    private String name;
    private PetType type;
    private String profileText;
}
