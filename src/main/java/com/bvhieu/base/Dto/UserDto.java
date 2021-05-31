package com.bvhieu.base.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto {

    private String username;
    private String fullName;
    private Date createdDate;
}
