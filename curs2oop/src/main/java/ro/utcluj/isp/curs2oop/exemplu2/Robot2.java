/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.isp.curs2oop.exemplu2;

public class Robot2 {

    public final static int MIN_X = -10;
    public final static int MAX_X = 10;

    private int x; //Atribute de instanta
    private String name;

    public Robot2(String name, int x) {
        this.x = x;
        this.name = name;
    }

    public Robot2(String name) {
        this.name = name;
    }

    public void moveLeft() {
        if (x > MIN_X) {
            x--;
        }
        System.out.println("Move robot to left:" + x);
    }

    public void moveRight() {
        if (x < MAX_X) {
            x++;
        }
        System.out.println("Move robot to right:" + x);
    }

    public void displayRobotData() {
        System.out.println("name=" + name + " x=" + x);
    }

    public String toString() {
        return "*name=" + name + " x=" + x;
    }

    public boolean equals(Object o) {
        Robot2 r = (Robot2) o;
//    System.out.println(r);
//    System.out.println(this);
        return r.x == this.x && r.name.equals(this.name);
    }

}
