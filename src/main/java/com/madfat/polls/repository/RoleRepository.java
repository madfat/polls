package com.madfat.polls.repository;

import com.madfat.polls.model.Role;
import com.madfat.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Optional<Role> findByName(RoleName roleName);
}

