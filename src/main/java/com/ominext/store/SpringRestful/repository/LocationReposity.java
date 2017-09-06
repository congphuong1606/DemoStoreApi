package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Acc;
import com.ominext.store.SpringRestful.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationReposity extends CrudRepository<Location, Long> {
}
