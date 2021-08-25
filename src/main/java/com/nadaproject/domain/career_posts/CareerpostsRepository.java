package com.nadaproject.domain.career_posts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CareerpostsRepository extends JpaRepository<Career_posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Career_posts> findAllDesc();
}
