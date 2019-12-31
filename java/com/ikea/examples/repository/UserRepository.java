package com.ikea.examples.repository;

import org.springframework.data.repository.CrudRepository;

import com.ikea.examples.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
