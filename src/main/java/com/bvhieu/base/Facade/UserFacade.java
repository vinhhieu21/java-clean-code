package com.bvhieu.base.Facade;

import com.bvhieu.base.Dto.UserDto;
import com.bvhieu.base.Mapper.UserMapper;
import com.bvhieu.base.Repo.UserRepo;

import java.util.List;
import java.util.stream.Collectors;

public class UserFacade {

    private UserRepo userRepo;

//    @Autowired
//    UserMapper userMapper;


    public List<UserDto> getAllUsers() {
        return userRepo.findAll().stream().map(UserMapper::toDto).collect(Collectors.toList());
    }
}
