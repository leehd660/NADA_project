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

    @Query(value = "SELECT * FROM User_info ui where ui.id = :id", nativeQuery = true)
    User_info findInfoByID(@Param("id") Long id);

//    @Query(value = "SELECT ui.id, ui.name FROM User_info ui " +
//            "WHERE (ui.get_time BETWEEN :get_time -10 AND :get_time +10 ) " +
//            "AND ui.latitude BETWEEN :latitude -0.0002 AND :latitude", nativeQuery = true)
//    User_info findNearIdByCname(@Param("id") Long id, @Param("get_time") String get_time,@Param("latitude") double latitude, @Param("longitude") double longitude);

}
