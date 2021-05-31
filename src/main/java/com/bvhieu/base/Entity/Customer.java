package com.bvhieu.base.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

import static java.util.Optional.ofNullable;

@Getter
@Setter
public class Customer {
    public MemberCard memberCard;

    public Customer() {
    }

    public Customer(MemberCard profile) {
        this.memberCard = profile;
    }

    public Optional<MemberCard> getMemberCard() {
        return ofNullable(memberCard);
    }

}
