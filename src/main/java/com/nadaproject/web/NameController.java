package com.nadaproject.web;

import com.nadaproject.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NameController {

    private final PostsService postsService;

//    @PutMapping("/add/friend/{id}")
//    public List<FindNearDto> addFriendId(@PathVariable Long id, @RequestBody GpsInfoDto gpsInfoDto) {
//        //id는 자기 자신의 id.
//        boolean answer = false;
////        long realTime = 0;
////        String time = gpsInfoDto.getGetTime();
////        String[] timeArr = time.split(":");
////        for (int i=0; i<3; i++){
////            realTime += (long) Math.pow(60,2-i) * Long.parseLong(timeArr[i]);
////        }
//        String myId = postsService.gpsAddUpdate(id, gpsInfoDto); //시간, gps데이터 저장
//        List<FindNearDto> nearFreindList = postsService.findNearId(id, gpsInfoDto.getGetTime(), gpsInfoDto.getLatitude(),gpsInfoDto.getLongitude());
//
//        return nearFreindList;
//    }

}
