package com.nadaproject.web;

import com.nadaproject.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ListPageController {

    private final PostsService postsService;

//    @GetMapping("/view/friend/{id}")
//    public String viewList(@PathVariable Long id) {
//
//    }

}
