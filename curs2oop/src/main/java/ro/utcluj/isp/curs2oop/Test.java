package ro.utcluj.isp.curs2oop;

import ro.utcluj.isp.curs2oop.exemplul1.Robot;

public class Test {

    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        r1.moveLeft();//-1
        r2.moveRight();
        System.out.println(r1);
        System.out.println(r2);
        r1 = r2;
        r2.moveLeft();
        r1.moveLeft();//-2
        Robot r3;
        r3 = new Robot();
        r3.moveLeft();
        Robot r4;
        r4 = r2;
        r4.moveLeft();
        System.out.println("......................");
        Robot[] list = new Robot[4];
        System.out.println(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        list[0] = r1;
        list[1] = new Robot();
        list[3] = r3;
        System.out.println("......................");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
