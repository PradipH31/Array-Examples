/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arrayex.util;

import java.util.Scanner;

/**
 *
 * @author HP B&O
 */
public class Marksheet {

    private String[] subjects;
    private int[] marks;
    private Scanner input;
    private int passMark;
    private double total;

    public Marksheet(String[] subjects, Scanner input) {
        this.subjects = subjects;
        marks = new int[subjects.length];
        this.input = input;
    }

    public void setPassMark(int passMark) {
        this.passMark = passMark;
    }

    public void entry() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter maeks for " + subjects[i]);
            marks[i] = input.nextInt();
            total += marks[i];

        }
    }

    public boolean isFail() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < passMark) {
                return true;
            }
        }
        return false;
    }

    public double getTotal() {
        return total;
    }

    public double getPercentage() {
        return (total / (subjects.length));
    }

}
