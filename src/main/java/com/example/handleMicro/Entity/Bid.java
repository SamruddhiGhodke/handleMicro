package com.example.handleMicro.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bids")
public class Bid {
    @Id
    private String id;
    private String bidderName;
    private Double amount;
}

