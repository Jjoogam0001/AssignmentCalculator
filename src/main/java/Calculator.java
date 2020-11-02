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

        menu();
        choice = input.nextInt();


        switch (choice){

            case 1:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                addition(number,number2);
                break;

            case 2:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                multiplication(number,number2);

                break;
            case 3:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();
                division(number,number2);

                break;
            case 4:
                System.out.println("Enter 1 number");
                number = input.nextInt();
                System.out.println("Enter 2 number");
                number2 = input.nextInt();

                subtration(number,number2);
                break;
            case 5:
                System.out.println("Goodbye");
                break;
        }



    }while (choice <= 4);








    }

    public static int addition(int a , int b){
        int total = a + b;
        System.out.println("Answer: "+total);
        return  total;

    }
    public static int multiplication(int a , int b){
        int total = a * b;
        System.out.println("Answer: "+total);

        return  total;


    }
    public static int division(int a, int b){
        int result = 0;
        if(a < b ){
            System.out.println("Sorry you cant divuide a smaller number to a bigger number ");
        }else {
            result = a/b ;
        }
        System.out.println("Answer: "+result);


        return  result;
    }
    public static int subtration(int a , int b){
        int result = a - b;
        System.out.println("Answer: "+result);

        return result;

    }
    public static  void menu(){
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
