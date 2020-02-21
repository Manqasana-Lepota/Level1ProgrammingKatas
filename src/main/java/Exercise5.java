import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        int number;
        char repeat = 0;
        String input;

        Scanner kb = new Scanner(System.in);

        do{
        System.out.println("Drawing an isosceles triangle");
        System.out.println("How many layers do you want: ");
        number = kb.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<(i*2); k++)
            {
                    System.out.print("#");

                }
            System.out.print("\n");
            }
            System.out.println();


        System.out.println("Would you like to print isosceles again ?");
        System.out.println("Enter Y for yes or N for no :");
        input = kb.next();
        repeat = input.charAt(0);


    } while (repeat == 'Y' || repeat == 'y');
}
    }

