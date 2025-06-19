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
@Document(collection = "ticket")
public class Ticket {
    @Id
    private String id;
    private String vehicleId;
    private String lotId;
    private int floorNumber;
    private String spotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String status; // ACTIVE, COMPLETED
    private Double feePaid;
}
