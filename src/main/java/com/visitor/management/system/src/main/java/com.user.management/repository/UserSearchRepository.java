package com.visitor.management.system.src.main.java.com.user.management.repository;

import com.visitor.management.system.src.main.java.com.user.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserSearchRepository extends JpaRepository<User, String> {

    Optional<List<User>> findByName(String username);

    Optional<User> findByEmail(String email);

    List<User> findAllByRole(String role);

    Optional<User> findByUsernameAndEmail(String username, String email);
}
