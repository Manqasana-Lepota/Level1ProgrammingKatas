import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args)
    {
        int num;//to hold integer number

        Scanner sc = new Scanner(System.in);//creating the object for Scanner class

        System.out.println("Enter the number of your choice:");//prompting

        num = sc.nextInt();//reading the input

        if(num%2 == 0)//checking
        {
            System.out.println("The number is Even");//displaying
        }
        else
        {
            System.out.println("The number is Odd");//displaying
        }

    }
}
