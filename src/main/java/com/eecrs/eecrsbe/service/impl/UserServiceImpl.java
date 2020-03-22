package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.User;
import com.eecrs.eecrsbe.entity.Role;
import com.eecrs.eecrsbe.model.RoleDto;
import com.eecrs.eecrsbe.model.UserDto;
import com.eecrs.eecrsbe.repository.RoleRepository;
import com.eecrs.eecrsbe.repository.UserRepository;
import com.eecrs.eecrsbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
    }

    private Set getAuthority(User user) {
        Set authorities = new HashSet<>();
        user.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRole())));
        return authorities;
    }

    @Override
    public User save(UserDto user, com.eecrs.eecrsbe.entity.enums.Role userRole) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        newUser.setJobTitle(user.getJobTitle());
        newUser.setOrganization(user.getOrganization());
        newUser.setEmail(user.getEmail());
        Role role = roleRepository.findByRole(userRole);
        newUser.getRoles().add(role);
        return userRepository.save(newUser);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findOne(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Role saveRole(RoleDto role) {
        Role newRole = new Role();
        newRole.setRole(role.getRole());
        newRole.setDescription(role.getDescription());
        return roleRepository.save(newRole);
    }
}
