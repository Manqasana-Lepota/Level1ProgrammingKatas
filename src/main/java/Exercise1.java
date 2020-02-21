import java.util.Scanner;

public class Exercise1 {
    public static void hello(String name) {

        System.out.println("Hello " + name + " !");//displaying
    }

    
    public static void main(String[] args) {

        String name;//declaring
        Scanner kb = new Scanner(System.in);//creating scanner object
        System.out.println("Enter your name:");//prompt to enter the name
        name = kb.nextLine();//reading the input name
        hello(name);//calling the method


    }
}
