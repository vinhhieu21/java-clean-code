package com.bvhieu.base.Service;

import com.bvhieu.base.Entity.Customer;
import com.bvhieu.base.Entity.MemberCard;

import java.util.Optional;

public class DiscountService {
    public String getDiscountLine(Customer customer) {
        return customer.getMemberCard()
                .flatMap(this::getDiscountPercentage)
                .map(d -> "Discount: " + d)
                .orElse("");

    }

    private Optional<Integer> getDiscountPercentage(MemberCard memberCard) {
        if (memberCard.getFidelityPoints() >= 100)
            return Optional.of(5);
        if (memberCard.getFidelityPoints() >= 50)
            return Optional.of(3);
        return Optional.empty();
    }

}
