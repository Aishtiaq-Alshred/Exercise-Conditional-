//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //sol-1
   Scanner input=new Scanner(System.in);
        System.out.println("Enter the name");
        String name= input.nextLine();
        switch (name){
            case " admen ":
                System.out.println("welcome admin");
                break;
            case " superuser ":
                System.out.println("welcome superuser");
                break;
        }
        if(name ==" admen "){
            System.out.println("welcome admin");
        } else if(name ==" superuser "){
            System.out.println("welcome superuser");
        }else if(name ==" user "){
            System.out.println("welcome user");}


        //sol-2
        int greatest;
        System.out.println("plase enter frist number");
        int num1=input.nextInt();

        System.out.println("plase enter 2 number");
        int num2=input.nextInt();

        System.out.println("plase enter 3 number");
        int num3=input.nextInt();

        if(num1>num2 && num1>num3){
            greatest =num1;;
            System.out.println("min number: "+ greatest);
        }
        else if(num2>num1 && num2>num3) {
            greatest =num2;
            System.out.println("min number: "+ greatest);}

        else if(num3>num1 && num3>num2 ){
            greatest =num3;
            System.out.println("greatest number: "+ greatest);}
    }
}