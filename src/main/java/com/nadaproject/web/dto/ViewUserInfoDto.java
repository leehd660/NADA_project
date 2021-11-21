package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Getter;

@Getter
public class ViewUserInfoDto {
    private String name;
    private String email;
    private String phone_num;

    public ViewUserInfoDto(User_info entity){
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.phone_num = entity.getPhone_num();
    }
}
