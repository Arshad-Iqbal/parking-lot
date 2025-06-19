package com.beeserv.parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "payment")
public class Payment {
    @Id
    private String id;
    private String ticketId;
    private Double amount;
    private String method; // UPI, CASH, CARD
    private String status; // PENDING, SUCCESS, FAILED
    private LocalDateTime paymentTime = LocalDateTime.now();
}
