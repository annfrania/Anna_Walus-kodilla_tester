package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolList = new HashMap<>();
         Principal albus = new Principal("Albus","Dumbledore","Hogwart");
         Principal agata = new Principal("Agata", "Trunchbull","Primary");
         Principal pan = new Principal("pan", "Kleks","Akademia Pana Kleksa");

         School albusSchool = new School(112,108,98,120);
         School agataSchool = new School(22,23,20,18,17,26);
         School panSchool = new School(4,3,5,4,3);

         schoolList.put(albus, albusSchool);
         schoolList.put(agata, agataSchool);
         schoolList.put(pan,panSchool);


        for(Map.Entry<Principal, School> principalEntry : schoolList.entrySet())
            System.out.println(principalEntry.getKey() + ", has got " + principalEntry.getValue().getSum() + " students.");
    }

}
