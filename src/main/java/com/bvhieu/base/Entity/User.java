package com.bvhieu.base.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User extends Base {
    @Id
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
}
