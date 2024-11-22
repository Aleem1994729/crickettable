package com.cricket.repo;

import com.cricket.model.Cricket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketRepository extends JpaRepository<Cricket, Integer> {


}



