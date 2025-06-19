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
@Document(collection = "vehicle")
public class Vehicle {
    @Id
    private String id;
    private String plateNumber;
    private String vehicleType;
    private String ownerName;
    private LocalDateTime createdAt = LocalDateTime.now();
}