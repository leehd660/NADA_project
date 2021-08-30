package com.nadaproject.domain.userinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<User_info, Long> {

    @Query("SELECT ui FROM User_info ui ORDER BY ui.id DESC")
    List<User_info> findAllDesc();

    @Query(value = "SELECT ui.id FROM User_info ui where ui.email = :email", nativeQuery = true)
    Long findIdByEmail(@Param("email") String email);
}
