import java.util.Scanner;

public class Exercise3 {

    public static void square(int num)
    {
        int number;//to hold integer number
        char repeat = 0;//declare and initialize
        String input;//to hold string

        Scanner kb = new Scanner(System.in);//creating the object

        do {

            System.out.println("Drawing a Square");//displaying

            System.out.println("How many layers do you want: ");//prompting
            number = kb.nextInt();//read the input
            System.out.println();//next line

            //nested for loop
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {

                    System.out.print("#");//printing inline
                }
                System.out.println();//next line
            }
            System.out.println();//new line
            System.out.println("Would you like to print your square again ?");//prompting
            System.out.println("Enter Y for yes or N for no :");//prompting
            input = kb.next();//reading the input
            repeat = input.charAt(0);


        } while (repeat == 'Y' || repeat == 'y');
    }
    public static void main(String[] args) {
        int number = 0;
        square(number);

    }
}
