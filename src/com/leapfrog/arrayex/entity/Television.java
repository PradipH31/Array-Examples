/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arrayex.entity;

/**
 *
 * @author HP B&O
 */
public class Television {

    //Singleton Method
    private Television() {

    }

    public static Television getInstance() {
        return new Television();
    }

    public void play() {
        System.out.println("playing tv");
    }

}
