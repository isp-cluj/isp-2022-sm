/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.isp.curs2oop;

import ro.utcluj.isp.curs2oop.exemplu2.Robot2;

/**
 *
 * @author mihai.hulea
 */
public class Test2 {

    static void  compareRobots(Robot2 r1, Robot2 r2) {
//        if (r1 == r2) {
//            System.out.println("Roboti identici.");
//        } else {
//            System.out.println("Roboti diferiti,");
//        }

        if (r1.equals(r2)) {
            System.out.println("Roboti identici.");
        } else {
            System.out.println("Roboti diferiti.");
        }

    }

    public static void main(String[] args) {
        Robot2 r1 = new Robot2("ABC", 5);
        //r1.moveLeft();
        Robot2 r2 = new Robot2("ABC", 5);
//        r2.moveRight();
//        r2.moveRight();
//        System.out.println(r1);
//        System.out.println(r2);
//        r2.moveLeft();
//        System.out.println(r1);
        compareRobots(r1, r2);

//        Robot2 r3 = new Robot2("FGH");
//        r3.displayRobotData();
////        r3.x = -999;
////        r3.name = "RANDOM FAKE NAME";
//        r3.displayRobotData();
//        System.out.println(r3);
    }
}
