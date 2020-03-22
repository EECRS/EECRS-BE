package com.eecrs.eecrsbe.contoroller;

import com.eecrs.eecrsbe.entity.enums.Role;
import com.eecrs.eecrsbe.model.RoleDto;
import com.eecrs.eecrsbe.model.UserDto;
import com.eecrs.eecrsbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @PreAuthorize("hasAnyRole(T(com.eecrs.eecrsbe.entity.enums.Role).ADMIN)")
//    @GetMapping()
//    public ResponseEntity<?> listUser() {
//        return ResponseEntity.ok(userService.findAll());
//    }

    @PostMapping("/signup")
    public ResponseEntity<?> create(@RequestBody UserDto user){
        userService.save(user, Role.HEALTH_OFFICER);
        return ResponseEntity.accepted().build();
    }

    @PreAuthorize("hasAnyRole(T(com.eecrs.eecrsbe.entity.enums.Role).ADMIN)")
    @PostMapping("/role")
    public ResponseEntity<?> createRole(@RequestBody RoleDto role){
        userService.saveRole(role);
        return ResponseEntity.accepted().build();
    }



}
