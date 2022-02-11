package com.gridnine.testing.modul;

import com.gridnine.testing.Flight;
import com.gridnine.testing.filter.Filter;

import java.util.ArrayList;
import java.util.List;

public class FlightFilter {

    public FlightFilter() {
    }

    public List<Flight> check(List<Flight> flightList, Filter filter) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightList) {
            if (filter.check(flight)) {
                result.add(flight);
            }
        }
        return result;
    }

}
