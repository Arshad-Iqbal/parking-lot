package com.beeserv.parking_lot.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
import java.util.List;

// --- PARKING LOT ---

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "parking_lot")
public class ParkingLot {
    @Id
    private String id;
    private String name;
    private String location;
    private List<Floor> floors;
    private LocalDateTime createdAt = LocalDateTime.now();
}
