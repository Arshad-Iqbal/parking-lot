package com.beeserv.parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Spot {
    private String spotNumber;
    private String spotType;  // COMPACT, LARGE, EV, etc.
    private boolean isEvEnabled;
    private boolean isReserved;
    private boolean isOccupied;
}
