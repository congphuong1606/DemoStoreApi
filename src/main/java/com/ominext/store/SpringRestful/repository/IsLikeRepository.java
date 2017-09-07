package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.entity.IsLike;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IsLikeRepository extends CrudRepository<IsLike,Long> {
}
