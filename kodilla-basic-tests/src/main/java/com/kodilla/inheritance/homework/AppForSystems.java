package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Convertible;

public class AppForSystems {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2013);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayYearOfRelease();

        Linux linux = new Linux(2008);
        linux.turnOn();
        linux.turnOff();
        linux.displayYearOfRelease();

        Windows windows = new Windows(2015);
        windows.displayYearOfRelease();
    }
}
