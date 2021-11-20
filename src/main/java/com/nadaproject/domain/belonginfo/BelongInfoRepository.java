package com.nadaproject.domain.belonginfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BelongInfoRepository extends JpaRepository<Belong_info,Long> {

    @Query("SELECT bi FROM belong_info bi ORDER BY bi.user_id DESC")
    List<Belong_info> findAllDesc();

    @Query(value = "SELECT * FROM belong_info bi where bi.user_id = :userid", nativeQuery = true)
    Belong_info findInfoByID(@Param("userid") Long userid);
}
