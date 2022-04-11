package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person implements Salary{

    String education_ETMAN_57120;
    String position_ETMAN_57120;


    public void initialize1_ETMAN_57120() throws IOException {

        BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        initialize_ETMAN_57120();
        System.out.println("Enter your education:");
        education_ETMAN_57120 = hm.readLine();
        System.out.println("Enter your position");
        position_ETMAN_57120 = hm.readLine();

    }

    public void print1_ETMAN_57120(){

        print_ETMAN_57120();
        System.out.println("education: " + education_ETMAN_57120);
        System.out.println("position: " + position_ETMAN_57120);
    }

    @Override
    public int salaryToPay_ETMAN_57120(int hours, int rate) {
        return hours*rate;
    }
    public int salaryForOvertime_ETMAN_57120(int overHours, int overRate) {
        return overHours*overRate;
    }
}