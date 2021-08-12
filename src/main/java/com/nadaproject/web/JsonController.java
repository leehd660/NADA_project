package com.nadaproject.web;

import com.google.gson.Gson;
import com.nadaproject.config.auth.LoginUser;
import com.nadaproject.config.auth.dto.SessionUser;
import com.nadaproject.service.posts.PostsService;
import com.nadaproject.web.dto.UserListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JsonController {

    private final PostsService postsService;

    @GetMapping("/view/info")
    public String viewInfo(){
        String post_list = new Gson().toJson(postsService.findAllDesc());
        return post_list;
    }

    @GetMapping("/view/post/{id}")
    public String viewPost(@PathVariable Long id) {
        String id_post_list = new Gson().toJson(postsService.findById(id));
        return id_post_list;
    }

    @GetMapping("/now/user")
    public String viewNowUser(@LoginUser SessionUser user){
        String nowUserInfo = new Gson().toJson(user);
        return nowUserInfo;
    }

    @GetMapping("/user/login/google")
    public void saveUser (@RequestBody UserListDto userdto) {
        postsService.userSave(userdto);
    }
}
