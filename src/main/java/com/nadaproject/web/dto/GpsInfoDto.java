package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GpsInfoDto {
    private long getTime;
    private double latitude;
    private double longitude;

    @Builder
    public GpsInfoDto(User_info entity) {
        this.getTime = entity.getGetTime();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
    }

    public User_info toEntity(){
        return User_info.builder().getTime(getTime).latitude(latitude).longitude(longitude).build();
    }
}
