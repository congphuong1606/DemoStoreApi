package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.IsLike;
import com.ominext.store.SpringRestful.repository.IsLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("islike")
public class IsLikeControler {
    @Autowired
    IsLikeRepository isLikeRepository;

    @RequestMapping(path = "/{likeId}", method = RequestMethod.GET)
    @ResponseBody
    public Integer isLikePost(@PathVariable("likeId") long likeId) {
        Integer check;
        if (isLikeRepository.findOne(likeId) != null) {
            check = 1;
        } else check = 0;
        return check;
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Integer likePost(@RequestBody IsLike isLike) {
        int check;
        if (isLikeRepository.save(isLike) != null) {
            check = 1;
        } else check = 0;
        return check;
    }
    //delete
    @RequestMapping(path = "/{likeId}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteIsLike(@PathVariable("likeId") long likeId) {
       isLikeRepository.delete(likeId);
        return 0;
    }




}
