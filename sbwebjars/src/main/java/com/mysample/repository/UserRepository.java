package com.mysample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mysample.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findAllByOrderByUserIdAsc();
}