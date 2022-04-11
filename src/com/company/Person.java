package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    public Person() {
    }

    String surname_ETMAN_57120;
    String firstname_ETMAN_57120;
    String street_ETMAN_57120;
    String zip_code_ETMAN_57120;
    String city_ETMAN_57120;



    public void initialize_ETMAN_57120 () throws IOException {

        BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter surname:");
        surname_ETMAN_57120 = hm.readLine();
        System.out.println("Enter your first name:");
        firstname_ETMAN_57120 = hm.readLine();
        System.out.println("Enter your street:");
        street_ETMAN_57120 = hm.readLine();
        System.out.println("Enter your zip code:");
        zip_code_ETMAN_57120 = hm.readLine();
        System.out.println("Enter your city:");
        city_ETMAN_57120 = hm.readLine();

    }


    public void print_ETMAN_57120 (){

        System.out.println("Surname: "+ surname_ETMAN_57120);
        System.out.println("firstname: "+ firstname_ETMAN_57120);
        System.out.println("street: "+ street_ETMAN_57120);
        System.out.println("zip code: "+ zip_code_ETMAN_57120);
        System.out.println("city: "+ city_ETMAN_57120);

    }

}