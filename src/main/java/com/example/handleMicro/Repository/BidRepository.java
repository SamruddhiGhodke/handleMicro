package com.example.handleMicro.Repository;

import com.example.handleMicro.Entity.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends MongoRepository<Bid, String> { }

