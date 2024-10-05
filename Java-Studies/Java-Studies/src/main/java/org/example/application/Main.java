package org.example.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        Integer couseANumber = sc.nextInt();

        for (int i = 0; i < couseANumber; i++){
            Integer number = sc.nextInt();
            set.add(number);
        }

        System.out.print("How many students for course B? ");
        Integer couseBNumber = sc.nextInt();

        for (int i = 0; i < couseBNumber; i++){
            Integer number = sc.nextInt();
            set.add(number);
        }

        System.out.print("How many students for course C? ");
        Integer couseCNumber = sc.nextInt();

        for (int i = 0; i < couseCNumber; i++){
            Integer number = sc.nextInt();
            set.add(number);
        }

        System.out.println("Total Students: " + set.size());


    }
}