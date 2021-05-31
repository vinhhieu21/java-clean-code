package com.bvhieu.base.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCard {
    private final int fidelityPoints;

    public MemberCard(int fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }
}
