package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AddFriendIdDto {
    private Long id;

    @Builder
    public AddFriendIdDto(User_info entity) {
        this.id = entity.getId();
    }

    public User_info toEntity(){
        return User_info.builder().friendId(String.valueOf(id)).build();
    }
}
