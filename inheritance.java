package com.iflak;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class derived extends bas {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        bas b=new bas();
        b.setX(67);
        System.out.println(b.getX());
        derive d=new derive();
        d.setX(45);
        System.out.println(d.getX());
    }

}
