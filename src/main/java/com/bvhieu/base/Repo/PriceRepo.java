package com.bvhieu.base.Repo;

import com.bvhieu.base.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Movie, Long> {

    double getFactor();
}
