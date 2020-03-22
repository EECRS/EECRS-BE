package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(com.eecrs.eecrsbe.entity.enums.Role role);
}
