package com.bvhieu.base.Repo;

import com.bvhieu.base.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findAll();



}
