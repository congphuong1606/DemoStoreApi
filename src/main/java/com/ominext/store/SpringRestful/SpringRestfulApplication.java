package com.ominext.store.SpringRestful;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import model.Account;
//import model.Comment;
//import model.Pos;

@SpringBootApplication
public class SpringRestfulApplication {
//    private static final Map<Long, Pos> postMap = new HashMap<Long, Pos>();
//    private static final Map<Long, Comment> cmtMap = new HashMap<Long, Comment>();
//    private static final Map<Long, Account> accMap = new HashMap<Long, Account>();

    public static void main(String[] args) {
//        onPutPost();
//        onPutCmt();
//        onPutAccount();
        SpringApplication.run(SpringRestfulApplication.class, args);
    }
//
//    //ACCOUNT
//    private static void onPutAccount() {
//        Account accOne = new Account(100, "store", 965100635, "cokhicongphuong", "Cơ kHí công Phượng",
//                "coldboy69", "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
//        accMap.put(accOne.getAccId(), accOne);
//    }
//
//    public Account addAcc(Account acc) {
//        accMap.put(acc.getAccId(), acc);
//        return acc;
//
//    }
//
//    public Account updateAcc(Account acc) {
//        Account accOne = acc;
//        accMap.put(accOne.getAccId(), accOne);
//        return accOne;
//    }
//
//    @SuppressWarnings("unlikely-arg-type")
//	public void deleteAcc(long accId) {
//        accMap.remove(accId);
//    }
//
//    public List<Account> getAllAcc() {
//        Collection<Account> accAll = accMap.values();
//        List<Account> accs = new ArrayList<Account>();
//        accs.addAll(accAll);
//        return accs;
//    }
//
//
//    //POST
//
//    private static void onPutPost() {
//        Pos one = new Pos(1, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 200, "Cơ khí Minh Ái",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
//        Pos two = new Pos(2, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 123, "Cơ khí Minh Ái",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
//        Pos three = new Pos(3, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 200, "Cơ khí Minh Ái",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
//        Pos four = new Pos(4, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 100, "Cơ Khí Phượng công",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
//        Pos five = new Pos(5, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 123, "Cơ khí Minh Ái",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
//        Pos six = new Pos(6, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
//                "10:03", 10, 200, 100, "Cơ Khí Phuongj Công",
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
//        // TODO Auto-generated method stub
//        postMap.put(one.getPostId(), one);
//        postMap.put(two.getPostId(), two);
//        postMap.put(three.getPostId(), three);
//        postMap.put(four.getPostId(), four);
//        postMap.put(five.getPostId(), five);
//        postMap.put(six.getPostId(), six);
//    }
//
//
//    public Pos addPost(Pos post) {
//        postMap.put(post.getPostId(), post);
//        return post;
//    }
//
//    public Pos updatePost(Pos post) {
//        postMap.put(post.getPostId(), post);
//        return post;
//    }
//
//    @SuppressWarnings("unlikely-arg-type")
//	public void deletePost(long postId) {
//        postMap.remove(postId);
//    }
//
//    public List<Pos> getAllPost() {
//        Collection<Pos> c = postMap.values();
//        List<Pos> listPost = new ArrayList<Pos>();
//        listPost.addAll(c);
//        return listPost;
//    }
//
//    public List<Pos> getPosts(long postStoreId) {
//        Collection<Pos> all = postMap.values();
//        List<Pos> listPost = new ArrayList<Pos>();
//        for (Pos post : all) {
//            if (post.getPostId() == postStoreId) {
//                listPost.add(post);
//            }
//        }
//        return listPost;
//
//    }
//
//
//    ///COMMENT
//
//    private static void onPutCmt() {
//
//        Comment cmtone = new Comment(1, 200,
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg",
//                1, "rất tốt tôi sẽ liên lạc cho cử hàng của bạn", "10:22");
//        Comment cmtTwo = new Comment(2, 10,
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-3.jpg",
//                2, "thật tồi tệ", "10:23");
//        Comment cmtThree = new Comment(3, 10,
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-3.jpg",
//                2, "không sao", "10:24");
//        Comment cmtfour = new Comment(4, 100,
//                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg",
//                1, "hahah", "10:25");
//
//        cmtMap.put(cmtone.getCmtId(), cmtone);
//        cmtMap.put(cmtTwo.getCmtId(), cmtTwo);
//        cmtMap.put(cmtThree.getCmtId(), cmtThree);
//        cmtMap.put(cmtfour.getCmtId(), cmtfour);
//    }
//
//    public Comment addCmt(Comment cmt) {
//        cmtMap.put(cmt.getCmtId(), cmt);
//        return cmt;
//    }
//
//    public Comment updateCmt(Comment cmt) {
//        cmtMap.put(cmt.getCmtId(), cmt);
//        return cmt;
//    }
//
//
//	@SuppressWarnings("unlikely-arg-type")
//	public void deleteCmt(long cmtId) {
//        cmtMap.remove(cmtId);
//    }
//
//    public List<Comment> getAllCmt() {
//        Collection<Comment> cmtall = cmtMap.values();
//        List<Comment> cmts = new ArrayList<Comment>();
//        cmts.addAll(cmtall);
//        return cmts;
//    }

}
