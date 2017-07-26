package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Pass: ");
        String input = sn.nextLine();
        Encrypt in = new En1(input);
        System.out.println(in.GenPass());


    }
}
