package com.madfat.polls.Repository;

import com.madfat.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String userName);
    Optional<User> findByUsernameOrEmail(String userName, String email);
    List<User> findByIdIn(List<String> ids);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String userName);
}
