package com.company;

public interface Salary {
    int salaryToPay_ETMAN_57120(int hours, int rate);

    default int salaryForOvertime_ETMAN_57120(int overHours, int overRate){
        return overHours*overRate;
    }

    static boolean bonus_ETMAN_57120(int yearsOfExperience){
        boolean bonus = false;
        if (yearsOfExperience >= 3) { bonus = true;
        }
        return bonus;
    }
}
