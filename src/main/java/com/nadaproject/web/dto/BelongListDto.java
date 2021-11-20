package com.nadaproject.web.dto;

import com.nadaproject.domain.belonginfo.Belong_info;
import lombok.Getter;

@Getter
public class BelongListDto {
    private Long id;
//    private String name;
    private String belong_data;
    private String position_data;

    public BelongListDto(Belong_info entity) {
        this.id = entity.getUser_id();
        this.belong_data = entity.getBelong_data();
        this.position_data = entity.getPosition_data();
    }

}
