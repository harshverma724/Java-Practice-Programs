import java.util.*;
//1. Write a Program to Swap Two Numbers
public class Main{

    public static void swapNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. 1 here: ");
        int a = sc.nextInt();
        System.out.print("Enter no. 2 here: ");
        int b = sc.nextInt();
        System.out.println("Number Before swap: a = "+a+" , "+" b = "+b);
         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println("Number After swap: a = "+a+" , "+" b = "+b);


    }


    public static void main(String[] args){
        //operation.
        swapNumbers();
    }
}
