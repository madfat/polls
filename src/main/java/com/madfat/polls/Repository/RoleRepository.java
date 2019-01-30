package com.madfat.polls.Repository;

import com.madfat.polls.model.Role;
import com.madfat.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,String> {
    Optional<Role> findByName(RoleName roleName);
}

