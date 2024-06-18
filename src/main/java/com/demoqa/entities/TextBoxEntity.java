package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class TextBoxEntity {

    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
}
