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

    @RequestMapping(path = "/one/{islike_id}", method = RequestMethod.GET)
    @ResponseBody
    public Integer isLikePost(@PathVariable("islike_id") long isLikeId) {
        int check;
        IsLike isLike = isLikeRepository.findOne(isLikeId);
        if (isLike != null) {
            check = 1;
        } else check = 0;
        return check;
    }

    @RequestMapping(path = "/liked", method = RequestMethod.POST)
    @ResponseBody
    public Integer likePost(@RequestBody IsLike isLike) {
        int check;
       IsLike like=isLikeRepository.save(isLike);
        if (like != null) {
            check = 1;
        } else check = 0;
        return check;
    }
    //delete
    @RequestMapping(path = "/{islike_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteIsLike(@PathVariable("islike_id") long islikeId) {
       isLikeRepository.delete(islikeId);
        return 0;
    }
    //update
    @RequestMapping(path = "/{islikeId}/{i}", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public int deleteIsLike(@PathVariable("islike_id") long islikeId,@RequestBody IsLike isLike,@PathVariable("i") int i) {
        int check;
        if(i==1){
            isLikeRepository.save(isLike);
            check=1;
        }else {
            isLikeRepository.delete(islikeId);
            check=0;
        }
        return check;
    }
    //lấy tất cả like cùng acc
    //
    @RequestMapping(path = "/{islike_acc}", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<IsLike> getIsLikes(@PathVariable("islike_acc") long islikeAcc) {
        return isLikeRepository.findAllByIslikeAcc(islikeAcc);
    }




}
