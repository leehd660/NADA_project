package com.nadaproject.web;

import com.google.gson.Gson;
import com.nadaproject.service.posts.PostsService;
import com.nadaproject.web.dto.CareerUploadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CareerPostsController {
    private final PostsService postsService;

    @PostMapping("/career/upload")
    public String careerUpload(@RequestBody CareerUploadDto cudto){
        Map<String, String> map = new HashMap();
        String a = postsService.careerSave(cudto);
        String b = String.valueOf(cudto.getUserId());
        map.put(b, a);
        String career_list = new Gson().toJson(map);
        return career_list;
    }

}
