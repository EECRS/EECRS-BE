package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.Role;
import com.eecrs.eecrsbe.entity.User;
import com.eecrs.eecrsbe.model.RoleDto;
import com.eecrs.eecrsbe.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user, com.eecrs.eecrsbe.entity.enums.Role userRole);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);

    Role saveRole(RoleDto role);
}
