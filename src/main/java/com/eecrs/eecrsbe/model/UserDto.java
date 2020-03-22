package com.eecrs.eecrsbe.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {

    private String username;
    private String password;
    private String jobTitle;
    private String organization;
    private String email;
}
