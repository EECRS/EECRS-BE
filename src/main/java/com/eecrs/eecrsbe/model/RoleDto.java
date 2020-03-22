package com.eecrs.eecrsbe.model;

import com.eecrs.eecrsbe.entity.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RoleDto {

    private Role role;
    private String description;

}
