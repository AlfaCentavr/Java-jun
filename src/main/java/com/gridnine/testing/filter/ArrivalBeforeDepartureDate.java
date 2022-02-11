package com.gridnine.testing.filter;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;

public class ArrivalBeforeDepartureDate implements Filter {

    @Override
    public boolean check(Flight flight) {
        for (Segment seg : flight.getSegments()) {
            if (seg.getArrivalDate().isBefore(seg.getDepartureDate())) {
                return true;
            }
        }
        return false;
    }
}
