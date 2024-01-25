package com.iflak;

class bas {
    bas(){
        System.out.println("bat ka grip nikal k na seedhs bat tere gaand mai daal dunga");
    }
    bas(int a){

        System.out.println("i am a constructor");
    }
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derive extends bas {
    derive(){

        System.out.println(" chutia kutla haha hah hah  haahaa");
    }
    derive(int x,int y){
        super(94);
        System.out.println("oye bsdk sun");
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childofderived extends derive{
    childofderived(int t){
        System.out.println("hahahhahahhahhaah");
    }
    childofderived(){
        super(34,34);
        System.out.println("beech raaste mai tere kapde nikal k teri gaand mai helicopter short marunga");
    }

}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        childofderived d=new childofderived(9);


    }
}
