//package com.ominext.store.SpringRestful.controler;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import com.ominext.store.SpringRestful.SpringRestfulApplication;
//
//import model.Account;
//import model.Comment;
//import model.Pos;
//
//@RestController
//@RequestMapping("/data")
//public class RestControler {
//
//    @Autowired
//    SpringRestfulApplication mAplication;
//
//    @RequestMapping("/test")
//    public String test() {
//        return "hehe chạy ngon lành";
//    }
//    /// POST
//
//    @RequestMapping(value = "/posts", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public @ResponseBody List<Pos> getPosts() {
//        List<Pos> listPost = mAplication.getAllPost();
//        return listPost;
//    }
//
//    @RequestMapping(value = "/posts/{postStoreId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public @ResponseBody List<Pos> getPosts(@PathVariable("postStoreId") int postStoreId) {
//        List<Pos> storePosts = new ArrayList<Pos>();
//        List<Pos> posts = mAplication.getAllPost();
//        for (Pos post : posts) {
//            if (post.getPostStoreId() == postStoreId) {
//                storePosts.add(post);
//            }
//        }
//        return storePosts;
//    }
//
//    @RequestMapping(value = "/posts", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Pos addPost(@RequestBody Pos post) {
//        return mAplication.addPost(post);
//    }
//
//    @RequestMapping(value = "/posts", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Pos updatePost(@RequestBody Pos post) {
//        return mAplication.updatePost(post);
//    }
//
//    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public void deletePost(@PathVariable("postId") int postId) {
//        mAplication.deletePost(postId);
//    }
//
//    // COMMENT
//
//    @RequestMapping(value = "/cmts/{cmtPostId}", method = RequestMethod.GET, produces = {
//            MediaType.APPLICATION_JSON_VALUE})
//    public  @ResponseBody List<Comment> getCmts(@PathVariable("cmtPostId") int cmtPostId) {
//        List<Comment> cmtPosts = new ArrayList<Comment>();
//        List<Comment> cmts = mAplication.getAllCmt();
//        for (Comment cmt : cmts) {
//            if (cmt.getCmtPostId() == cmtPostId) {
//                cmtPosts.add(cmt);
//            }
//        }
//        return cmtPosts;
//    }
//
//    @RequestMapping(value = "/cmts", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Comment addCmt(@RequestBody Comment cmt) {
//        return mAplication.addCmt(cmt);
//    }
//
//    @RequestMapping(value = "/cmts", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Comment updateCmt(@RequestBody Comment cmt) {
//        return mAplication.updateCmt(cmt);
//    }
//
//    @RequestMapping(value = "/cmts/{cmtId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public void deleteCmt(@PathVariable("cmtId") int cmtId) {
//        mAplication.deleteCmt(cmtId);
//    }
//
//    // ACCOUNT
//    @RequestMapping(value = "/accs", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public @ResponseBody List<Account> getAccs() {
//        List<Account> accs = mAplication.getAllAcc();
//        return accs;
//    }
//
//    @RequestMapping(value = "/accs", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Account addAcc(@RequestBody Account acc) {
//        return mAplication.addAcc(acc);
//    }
//
//    @RequestMapping(value = "/accs", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public Account updateAcc(@RequestBody Account acc) {
//        return mAplication.updateAcc(acc);
//    }
//
//    @RequestMapping(value = "/accs/{accId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public void deleteAcc(@PathVariable("accId") int accId) {
//        mAplication.deleteAcc(accId);
//    }
//}
