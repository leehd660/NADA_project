package com.nadaproject.web.dto;

import com.nadaproject.domain.career_posts.Career_posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CareerUploadDto {
    private String careerCategory;
    private String careerTitle;
    private String careerStartDate;
    private String careerFinDate;
    private String careerContent;
    private String careerPicture;
    private Long userId;

    @Builder
    public CareerUploadDto(Career_posts entity){
        this.careerCategory = entity.getCareerCategory();
        this.careerTitle = entity.getCareerTitle();
        this.careerStartDate = entity.getCareerStartDate();
        this.careerFinDate = entity.getCareerFinDate();
        this.careerContent = entity.getCareerContent();
        this.careerPicture = entity.getCareerPicture();
        this.userId = entity.getUserId();
    }

    public Career_posts toEntity(){
        return Career_posts.builder().careerCategory(careerCategory).careerTitle(careerTitle).
                careerStartDate(careerStartDate).careerFinDate(careerFinDate).careerContent(careerContent).
                careerPicture(careerPicture).userId(userId).build();
    }

}
