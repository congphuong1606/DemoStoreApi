package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.entity.Post;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findAllByPostId(long postId);

    List<Post> findAllByPostStoreId(long postStoreId);
    @Query("SELECT c FROM Post c ORDER BY c.postId DESC")
    List<Post> allPost();
}
