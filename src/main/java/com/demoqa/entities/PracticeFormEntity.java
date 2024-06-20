package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class PracticeFormEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobileNumber;
    private String dateOfBirth;
    private String subjects;
    private String hobbies;
    private String upLoadPicture;
    private String currentAddress;
    private String state;
    private String city;
}
