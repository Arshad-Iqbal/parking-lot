package com.beeserv.parking_lot.model;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Floor {
    private int floorNumber;
    private List<Spot> spots;
}
