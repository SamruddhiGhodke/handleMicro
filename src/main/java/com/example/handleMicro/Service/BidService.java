package com.example.handleMicro.Service;

import com.example.handleMicro.Entity.Bid;
import com.example.handleMicro.Repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
    @Autowired
    private BidRepository repo;

    public Bid saveBid(Bid bid) {

        return repo.save(bid);
    }
}

