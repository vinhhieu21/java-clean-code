package com.bvhieu.base.Facade;

import com.bvhieu.base.Dto.UserDto;
import com.bvhieu.base.Entity.User;
import com.bvhieu.base.Mapper.UserMapper;
import com.bvhieu.base.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserFacade {

    private UserRepo userRepo;

    @Autowired
    UserMapper userMapper;

    public List<UserDto> getAllUsers() {
        return userRepo.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }
}
