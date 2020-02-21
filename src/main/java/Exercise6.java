import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static ArrayList<String> longestString(String[] names) {
        
        ArrayList<String> ls = new ArrayList<String>();
        int longestName = 0;
        for (String name : names) {
            int length = name.length();
            if (length > longestName) {
                longestName = length;
                ls.clear();
            }
            if (length == longestName) {
                ls.add(name);
            }
        }
        return ls;
    }


    public static void main(String[] args){

        int number;
        Scanner c = new Scanner(System.in);

        System.out.println("How many names do you want to store in an Array ?");
        number = c.nextInt();

        String[] names = new String[number];

        System.out.println("Enter the elements in an array:");

        for(int count = 0 ; count < number; count++)
        {
            names[count] = c.next();
        }

        System.out.println("The longest String is : " + longestString(names));

    }
}
