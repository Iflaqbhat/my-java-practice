
package com.iflak;
import java.util.Scanner;
public class rjjd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
//        if(fruit.equals("mango")){
//            System.out.println("king of fruits");
//
//        }
//        if(fruit.equals("apple")){
//            System.out.println("kashmir ka apple hain");
//        }
        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("kashmir ka apple hai");
                break;
            case "peach":
                System.out.println("bohaT HI MAzedaar hain");
                break;
            case "grapes":
                System.out.println("kya hi mazedaAR cheex hain");
                break;
            default:
                System.out.println("ye konsa fruit hai lovede");
        }

    }
}
