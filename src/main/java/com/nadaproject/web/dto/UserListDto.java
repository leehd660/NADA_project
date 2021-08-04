package com.nadaproject.web.dto;

import com.nadaproject.domain.user.Role;
import com.nadaproject.domain.user.User;
import lombok.Getter;

@Getter
public class UserListDto {
    private Long id;
    private String email;
    private Role role;

    public UserListDto(User entity){
        this.id= entity.getId();
        this.email = entity.getEmail();
        this.role = entity.getRole();
    }

}
