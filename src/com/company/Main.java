package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter pass: ");
        String input = sn.nextLine();
        System.out.print("Enter order: ");
        String order = sn.nextLine();

        CheckEn checkEn = new CheckEn(input,order);
        System.out.println(checkEn.GetDePass());


    }
}
