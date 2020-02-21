import java.util.ArrayList;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int number;
        String name;

        ArrayList<String> list = new ArrayList<String>();

        System.out.println("How many names do you want to add to your array list:");
        number = kb.nextInt();

        System.out.println("Enter your names:");
        for(int x = 0; x < number; x++)
        {
            name = kb.next();
            list.add(name);
        }

        System.out.println("*************************");


        for (String obj : list) {
            System.out.println("*"+"\t " + obj + "\t\t\t"+"*");

        }
        System.out.println("*************************");
    }
}

