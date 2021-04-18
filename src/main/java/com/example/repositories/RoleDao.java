package com.example.repositories;

import com.example.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findRoleByName(String name);
}