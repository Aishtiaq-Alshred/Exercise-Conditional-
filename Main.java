//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //sol-1
        System.out.println("  enter role of the user");
        String name= input.nextLine();
        switch(name){
            case "admen":
                System.out.println("welcome admin");
                break;
            case "superuser":
                System.out.println("welcome superuser");
                break;
            case "user":
                System.out.println("welcome user");
                break;

        }

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
            System.out.println("greatest number: "+ greatest);
        }
        else if(num2>num1 && num2>num3) {
            greatest =num2;
            System.out.println("greatest number: "+ greatest);}

        else if(num3>num1 && num3>num2 ){
            greatest =num3;
            System.out.println("greatest number: "+ greatest);}



        //sol-3
        System.out.println("Enter the day");
        int number = input.nextInt();
        switch (number){
            case 1:
                System.out.println("the day Sunday");
                break;
            case 2:
                System.out.println("the dat Monday");
                break;
            case 3:
                System.out.println("the day Tuesday");
                break;
            case 4:
                System.out.println("the day Wednesday ");
                break;
            case 5:
                System.out.println("the day Thursday");
                break;
            case 6:
                System.out.println("the day Friday");
                break;
            case 7:
                System.out.println("the day Saturday" );
                break;}



        //sol-4
        System.out.println("Enter your numeric score: ");
        int score = input.nextInt();
        if(score>=90){
            System.out.println("Numeric Score: " + score +"\n Letter Grade: A ");
        } else if(score>=80){
            System.out.println("Numeric Score: " + score +"\n Letter Grade: B ");
        }else if(score>=70){
            System.out.println("Numeric Score: " + score +"\n Letter Grade: C ");
        }else if(score>=60){
            System.out.println("Numeric Score: " + score  +"\n Letter Grade: D");
        } else System.out.println("Numeric Score: " + score +"\n Letter Grade: F");




        //sol-5
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        if(age<=13){
            System.out.println(" You are an Child.");
        }else if(age>=19){
            System.out.println(" You are anTeenager");
        }else System.out.println("You are an Adult.");
        }

    }
