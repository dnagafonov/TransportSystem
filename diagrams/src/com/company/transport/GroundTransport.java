package com.company.transport;

import com.company.route.Route;
import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Controller;

public class GroundTransport extends Transport {

    private Controller controller;

    GroundTransport(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Controller controller, Types typeOfFuel) {
        super(number, timetable, fuel, route, passangers, driver, typeOfFuel);
        setController(controller);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
