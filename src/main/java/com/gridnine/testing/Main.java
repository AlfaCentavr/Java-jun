package com.gridnine.testing;

import com.gridnine.testing.filter.ArrivalBeforeDepartureDate;
import com.gridnine.testing.filter.DeparturePointInTime;
import com.gridnine.testing.filter.MoreTwoHoursGroundTime;
import com.gridnine.testing.modul.FlightFilter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = FlightBuilder.createFlights();
        flightList.forEach(flight -> System.out.println(flight.toString()));
        FlightFilter flightFilter = new FlightFilter();

        DeparturePointInTime departure = new DeparturePointInTime();
        ArrivalBeforeDepartureDate arrival = new ArrivalBeforeDepartureDate();
        MoreTwoHoursGroundTime moreTwoHoursGroundTime = new MoreTwoHoursGroundTime();

        System.out.println("\n1. Вылет до текущего момента времени\n");
        List<Flight> listNumber1 = flightFilter.check(flightList, departure);
        System.out.println(listNumber1);

        System.out.println("\n2. Cегменты с датой прилёта раньше даты вылета\n");
        List<Flight> listNumber2 = flightFilter.check(flightList, arrival);
        System.out.println(listNumber2);

        System.out.println("\n3. Общее время, проведённое на земле превышает два часа \n");
        List<Flight> listNUmber3 = flightFilter.check(flightList, moreTwoHoursGroundTime);
        listNUmber3.forEach(flight -> System.out.println(flight.toString()));
    }

}
