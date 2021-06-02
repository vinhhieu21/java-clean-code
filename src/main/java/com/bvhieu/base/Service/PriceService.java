package com.bvhieu.base.Service;

import com.bvhieu.base.Entity.Movie;
import com.bvhieu.base.Repo.PriceRepo;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    private final PriceRepo priceRepo;

    public PriceService(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
    }

    public int computeNewReleasePrice(int days) {
        return (int) (days * priceRepo.getFactor());
    }

    public int computeRegularPrice(int days) {
        return days + 1;
    }

    public int computeChildrenPrice(int days) {
        return 5;
    }

    public int computePrice(Movie.Type type, int days) {
        return type.priceAlgo.apply(this, days);
    }


}
