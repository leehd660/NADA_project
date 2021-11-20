package com.nadaproject.domain.career_posts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CareerpostsRepository extends JpaRepository<Career_posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Career_posts> findAllDesc();

    @Query(value = "SELECT cp.id FROM career_posts cp where cp.user_id =:userId", nativeQuery = true)
    Long findByUserId(@Param("userId") Long userId);

}
