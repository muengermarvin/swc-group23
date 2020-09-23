import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Output statement
        System.out.println("Hello User");


        /*Für eine Eingabe in der Console...
        neues Scanner Object erstellen*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgramm: Summer zweier Zahlen \nGeben Sie die erste Zahl ein: ");

        //Variable die das Scannerobjekt nutzt und nach dem nächsten Int Objekt in der Konsole sucht
        int num1 = scanner.nextInt();

        System.out.println(num1 + "\nGeben Sie die zweite Zahl ein: ");

        int num2 = scanner.nextInt();

        System.out.println(num2);

        System.out.println("Sum of "+ num1 +" + "+ num2 +" is "+ sum(num1,num2));

    }


    //function
    public static int sum (int x, int y){
        int sum = x+y;

        return sum;
    }
}