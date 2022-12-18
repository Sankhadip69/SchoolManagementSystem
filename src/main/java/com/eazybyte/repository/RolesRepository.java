package com.eazybyte.repository;

import com.eazybyte.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles,Integer> {

    Roles getByRoleName(String roleName);
}
