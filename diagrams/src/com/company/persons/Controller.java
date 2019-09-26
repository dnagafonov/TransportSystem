package com.company.persons;

import com.company.transport.Transport;
import com.company.persons.employeeEquipment.controllerEquipment.ControllerShaitanMachine;
import com.company.persons.employeeEquipment.controllerEquipment.CameraOfController;

public class Controller extends Employee {
    ControllerShaitanMachine shaitanMachine;
    CameraOfController camera;

    public Controller(String name, String surname, int age, int health, int salary) {
        super(name, surname, age, salary, health);
        shaitanMachine = new ControllerShaitanMachine();
        camera = new CameraOfController();
    }

    private void beatThePidor() {
        System.out.println("POLUCHAI PIDORAS");
    }

    public void checkPayment(Transport transport) {
        Passanger[] passangers = transport.getPassangers();
        for(int i = 0; i != passangers.length; ++i){
            shaitanMachine.beepOfShaitanMachine();
            if(!passangers[i].getIsPayed()){
                passangers[i].subHealth(10);
                beatThePidor();
            }
            System.out.println("Thank u");
        }
    }
}
