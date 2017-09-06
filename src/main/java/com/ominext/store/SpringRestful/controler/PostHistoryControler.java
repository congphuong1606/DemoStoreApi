package com.ominext.store.SpringRestful.controler;


import com.ominext.store.SpringRestful.entity.PostHistory;
import com.ominext.store.SpringRestful.entity.form.PostDTO;
import com.ominext.store.SpringRestful.repository.PostHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts/history")
public class PostHistoryControler {
    @Autowired
    PostHistoryRepository postHistoryRepository;

    @RequestMapping(path = "/add",method = RequestMethod.POST,produces ={MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public PostHistory addNewPostHistory(@RequestBody PostHistory postHistory ) {
       postHistoryRepository.save(postHistory);
        return postHistory;
    }
    @RequestMapping(path = "/{accId}",method = RequestMethod.GET,produces ={MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public List<PostDTO> getListPosts(@PathVariable("accId") long accId  ) {
       List<PostHistory>  list = postHistoryRepository.findAllByAccMyId(accId);
       List<PostDTO> dtoList=new ArrayList<>();
       for(PostHistory p:list){
           PostDTO postDTO=new PostDTO(
                   p.getPostId(),
                   p.getPostContent(),
                   p.getPostTime(),
                   p.getPostCountComment(),
                   p.getPostCountLike(),
                   p.getPostStoreId(),
                   p.getPostStoreName(),
                   p.getPostStoreAvatar(),
                   p.getPostImage(),
                   p.getIsLike());
           dtoList.add(postDTO);
       }
        return dtoList;
    }
    @RequestMapping(path = "/{postId}",method = RequestMethod.DELETE,produces ={MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public Integer deletePostHistory(@PathVariable("postId") long postId  ) {
        int check;
        try{
            postHistoryRepository.delete(postId);
            check=1;
        }catch (Exception e){
          check=0;
        }
        return check;
    }
}
