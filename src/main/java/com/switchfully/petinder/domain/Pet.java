package com.switchfully.petinder.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Pet {
    private Long id;
    private String name;
    private PetType type;
    private String profileText;
}
