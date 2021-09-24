package com.nadaproject.domain.userinfo;

import com.nadaproject.web.dto.FindNearDto;
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

    @Query(value = "SELECT ui.id, ui.name FROM User_info ui " +
            "WHERE ui.getTime <= :upgettime AND ui.getTime >= :downgettime " +
            "AND (ui.latitude BETWEEN :dolatitude AND :uplatitude)" +
            "AND (ui.longitude BETWEEN :dolongitude AND :uplongitude)", nativeQuery = true)
    List<FindNearDto> findNearIdByCname(@Param("upgettime") long upgettime, @Param("downgettime") long downgettime, @Param("uplatitude") double uplatitude, @Param("dolatitude") double dolatitude, @Param("uplongitude") double uplongitude, @Param("dolongitude") double dolongitude);

}
