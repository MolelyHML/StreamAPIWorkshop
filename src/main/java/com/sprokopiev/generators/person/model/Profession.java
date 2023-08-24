package com.sprokopiev.generators.person.model;

import java.util.Random;

public enum Profession {
    Software_Developer,
    Surgeon,
    Pilot,
    Lawyer,
    Dentist,
    Physician,
    Veterinarian,
    Web_Developer,
    QA_Engineer,
    Electrician;

    public static Profession getRandomProfession() {
        Random random = new Random();
        int randInt = random.nextInt(10);
        switch (randInt) {
            case 1 -> {
                return Software_Developer;
            }
            case 2 -> {
                return Surgeon;
            }
            case 3 -> {
                return Pilot;
            }
            case 4 -> {
                return Lawyer;
            }
            case 5 -> {
                return Dentist;
            }
            case 6 -> {
                return Physician;
            }
            case 7 -> {
                return Veterinarian;
            }
            case 8 -> {
                return Web_Developer;
            }
            case 9 -> {
                return QA_Engineer;
            }
            case 0 -> {
                return Electrician;
            }
         }
        return QA_Engineer;
    }
}
