/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arrayex;

import com.leapfrog.arrayex.entity.Television;
import com.leapfrog.arrayex.util.Algorithm;
import com.leapfrog.arrayex.util.Marksheet;
import java.util.Scanner;

/**
 *
 * @author HP B&O
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] subjects = {"English", "Math", "Science", "Computer"};
        System.out.println("Enter Marksheet Operator's Name:");
        String name = input.next();
        System.out.println("Hello" + name + "\r\nWelcome to ECO");

        Marksheet ms = new Marksheet(subjects, input);

        ms.entry();
        System.out.println("Set pass mark");
        ms.setPassMark(input.nextInt());
        System.out.println(ms.getTotal());
        if (ms.isFail()) {
            System.out.println("You have failed");
        } else {
            System.out.println("You have scored " + ms.getPercentage() + " %");
        }
    }
}
