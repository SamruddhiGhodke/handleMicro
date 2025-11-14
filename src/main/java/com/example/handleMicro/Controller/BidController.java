package com.example.handleMicro.Controller;

import com.example.handleMicro.Entity.Bid;
import com.example.handleMicro.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bid")
public class BidController {

    @Autowired
    private BidService service;

    @PostMapping("/add")
    public Bid addBid(@RequestBody Bid bid) {
        return service.saveBid(bid);
    }
}

