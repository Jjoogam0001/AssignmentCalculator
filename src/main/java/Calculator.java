import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {



        System.out.println();
        Scanner input = new Scanner(System.in);

        int number;
        int number2;
        int choice;


    do {
        // used a do while loop,so as to run over again the menu until the user exits the application

        Menu();
        choice = input.nextInt();


        switch (choice){

            case 1:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                Addition(number,number2);
                break;

            case 2:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                Multiplication(number,number2);

                break;
            case 3:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();
                Division(number,number2);

                break;
            case 4:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                Subtration(number,number2);
                break;
            case 5:
                System.out.println("Goodbye");
                break;
        }



    }while (choice <= 4);








    }

    public static int Addition(int a , int b){
        int total = a + b;
        System.out.println("Answer: "+total);
        return  total;

    }
    public static int Multiplication(int a , int b){
        int total = a * b;
        System.out.println("Answer: "+total);

        return  total;


    }
    public static int Division(int a, int b){
        int result = 0;
        if(a < b ){
            System.out.println("Sorry you cant divuide a smaller number to a bigger number ");
        }else {
            result = a/b ;
        }
        System.out.println("Answer: "+result);


        return  result;
    }
    public static int Subtration(int a , int b){
        int result = a - b;
        System.out.println("Answer: "+result);

        return result;

    }
    public static  void Menu(){
        System.out.println("Hello Welcome to my first Lexicon Asignment(Calculator)");
        System.out.println();
        System.out.println("-------------------");
        System.out.println("(1) Addition");
        System.out.println("(2) Multiplication");
        System.out.println("(3) Division");
        System.out.println("(4) Subtration");
        System.out.println("(5)---EXIT----------");

    }

}
