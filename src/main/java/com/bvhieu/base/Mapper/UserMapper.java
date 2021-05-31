package com.bvhieu.base.Mapper;

import com.bvhieu.base.Dto.UserDto;
import com.bvhieu.base.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setFullName(user.getFirstName() + " " + user.getLastName());
        userDto.setCreatedDate(user.getCreatedDate());
        return userDto;
    }

}
