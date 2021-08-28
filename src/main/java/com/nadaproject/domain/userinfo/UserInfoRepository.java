package com.nadaproject.domain.userinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    @Query("SELECT ui FROM UserInfo ui ORDER BY ui.id DESC")
    List<UserInfo> findAllDesc();

    @Query(value = "SELECT ui.id FROM UserInfo ui where ui.email = :email", nativeQuery = true)
    Long findIdByEmail(@Param("email") String email);
}
