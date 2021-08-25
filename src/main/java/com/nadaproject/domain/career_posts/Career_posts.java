package com.nadaproject.domain.career_posts;

import com.nadaproject.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Career_posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String careerCategory;

    @Column(length = 500, nullable = false)
    private String careerTitle;

    @Column(nullable = false)
    private String careerStartDate;

    @Column
    private String careerFinDate;

    @Column(length = 500, columnDefinition = "TEXT")
    private String careerContent;

    @Column
    private String careerPicture;

    @Column
    private Long careerFriend;

    @JoinColumn
    private Long userId;


    @Builder
    public Career_posts(String careerCategory, String careerTitle,String careerStartDate,String careerFinDate,String careerContent,String careerPicture, Long careerFriend, Long userId) {
        this.careerCategory=careerCategory;
        this.careerTitle=careerTitle;
        this.careerStartDate=careerStartDate;
        this.careerFinDate=careerFinDate;
        this.careerContent=careerContent;
        this.careerPicture=careerPicture;
        this.careerFriend=careerFriend;
        this.userId=userId;
    }

    public void update(String careerCategory, String careerTitle,String careerStartDate,String careerFinDate,String careerContent,String careerPicture, Long careerFriend) {
        this.careerCategory=careerCategory;
        this.careerTitle=careerTitle;
        this.careerStartDate=careerStartDate;
        this.careerFinDate=careerFinDate;
        this.careerContent=careerContent;
        this.careerPicture=careerPicture;
        this.careerFriend=careerFriend;
    }
}
