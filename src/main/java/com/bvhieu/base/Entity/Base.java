package com.bvhieu.base.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Base {
    protected Date createdDate;
    protected Long createdBy;
}
