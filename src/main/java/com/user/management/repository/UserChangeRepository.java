package com.user.management.repository;

import com.user.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserChangeRepository extends JpaRepository<User, String> {

    @Modifying
    @Query("UPDATE User u SET u.deleteFlag = true WHERE u.userId = :id")
    void softDeleteById(@Param("id") String id);
}
