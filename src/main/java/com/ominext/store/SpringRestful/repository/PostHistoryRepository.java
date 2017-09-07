package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.PostHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostHistoryRepository extends CrudRepository<PostHistory,Long>{
    List<PostHistory>  findAllByAccId(long accId);

}
