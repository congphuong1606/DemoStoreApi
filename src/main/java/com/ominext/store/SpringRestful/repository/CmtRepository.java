package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Cmt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CmtRepository extends CrudRepository<Cmt,Long> {
//    @Query("SELECT u FROM Cmt u WHERE u.cmtPostId=:id")
    List<Cmt> findAllByCmtPostId(long id);
}