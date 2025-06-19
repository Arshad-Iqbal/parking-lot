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
@Document(collection = "charging_session")
public class ChargingSession {
    @Id
    private String id;
    private String ticketId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double energyConsumedKWh;
    private Double chargingFee;
}