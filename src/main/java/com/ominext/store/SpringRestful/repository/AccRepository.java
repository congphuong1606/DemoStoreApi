package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Acc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccRepository extends CrudRepository<Acc, Long> {

}
