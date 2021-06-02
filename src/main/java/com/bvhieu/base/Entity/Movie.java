package com.bvhieu.base.Entity;

import com.bvhieu.base.Service.PriceService;

import java.util.function.BiFunction;

public class Movie {
    public Movie(Type type) {
        this.type = type;
    }

    public enum Type {
        REGULAR (PriceService::computeRegularPrice),
        NEW_RELEASE (PriceService::computeNewReleasePrice),
        CHILDREN (PriceService::computeChildrenPrice),
//        ELDER (PriceService::computeRegularPrice),
        ;

        public final BiFunction<PriceService, Integer, Integer> priceAlgo;

        private Type(BiFunction<PriceService, Integer, Integer> priceAlgo) {
            this.priceAlgo = priceAlgo;
        }

        }

    private final Type type;
}

