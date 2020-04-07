package com.cai.security;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository  extends Repository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
    User findOneByLogin(String name);
}
