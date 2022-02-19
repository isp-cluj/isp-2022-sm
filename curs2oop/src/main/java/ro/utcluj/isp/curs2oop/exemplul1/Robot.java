package ro.utcluj.isp.curs2oop.exemplul1;

public class Robot {

    public int x;

    public void moveLeft() {
        x--;
        System.out.println("Move robot to left:" + x);
    }

    public void moveRight() {
        x++;
        System.out.println("Move robot to right:" + x);
    }


}
