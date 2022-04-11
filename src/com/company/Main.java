package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Staff person1 = new Staff();
        person1.initialize1_ETMAN_57120();
        person1.print1_ETMAN_57120();
        System.out.println(person1.salaryToPay_ETMAN_57120(40, 20));
        System.out.println(person1.salaryForOvertime_ETMAN_57120(10, 25));
        System.out.println(Salary.bonus_ETMAN_57120(6));
    }
}
