package com.user.management.repository;

import com.user.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GetUserRepository extends JpaRepository<User, String> {

//    List<User> findAllUsers();
//
//    Optional<List<User>> findByName(String username);
//
//    Optional<User> findByDeleteFlag(boolean deleteFlag);
//
//    Optional<User> findByEmail(String email);
//
//    Optional<List<User>> findAdmin(boolean isAdmin);

//    Optional<User> findByUserIdAndNameAndEmailAndRoleAndDeleteFlag(String username, String email);
}
