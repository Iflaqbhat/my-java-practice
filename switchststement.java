package com.iflak;
import java.util.Scanner;
public class switchststement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //       String fruit = sc.next();
//        if(fruit.equals("mango")){
//            System.out.println("king of fruits");
//
//        }
//        if(fruit.equals("apple")){
//            System.out.println("kashmir ka apple hain");
//        }
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("kashmir ka apple hai");
//            case "peach" -> System.out.println("bohaT HI MAzedaar hain");
//            case "grapes" -> System.out.println("kya hi mazedaAR cheex hain");
//            default -> System.out.println("ye konsa fruit hai lovede");
//        }
//
//        int day=sc.nextInt();
//        if (day == 1) {
//            System.out.println("sunday");
//        } else if (day == 2) {
//            System.out.println("monday");
//        } else if (day == 3) {
//            System.out.println("tuesday");
//        } else if (day == 4) {
//            System.out.println("wednesday");
//        } else if (day == 5) {
//            System.out.println("thursday");
//        } else if (day == 6) {
//            System.out.println("friday");
//        } else if (day == 7) {
//            System.out.println("saturday");
//        } else {
//            System.out.println("ye konsa day hai bey tera maran day hai ya re havle");
  //  }
        //NESTED SWITCH CASES
       int empid = sc.nextInt();

       switch(empid){
           case 1:
               System.out.println("iflak ahmad bhat");
               break;
           case 2:
               System.out.println("khurshid ahmad bhat");
               break;
           case 3:
               System.out.println("javid ahmaD BHAT");
               break;

           case 4:
               String dept = sc.next();
               switch(dept){
                   case "it":
                       System.out.println("hooo");
                       break;
                   case "cs":
                       System.out.println("engineer hai saala");
                       break;
                   case "cve":
                       System.out.println("ashleel hai ye londa");
                       break;
               }
           default:
               System.out.println("ye kya haai");


       }

    }
}
