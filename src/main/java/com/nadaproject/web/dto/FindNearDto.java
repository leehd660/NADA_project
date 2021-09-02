package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Getter;

@Getter
public class FindNearDto {
    private Long id;
    private String name;

    public FindNearDto(User_info entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
