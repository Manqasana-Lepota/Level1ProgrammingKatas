import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public void combinedArrays()
    {
        int number;

        Scanner kb = new Scanner(System.in);

        System.out.println("How many numbers do you want in each Array ?");
        number = kb.nextInt();

        int[] FirstArray = new int[number];
        int[] SecondArray = new int[number];
        int[] firstSecondArray = new int[FirstArray.length + SecondArray.length];
        int count = 0;

        System.out.println("Enter your first array:");
        for(int x = 0; x < number; x++)
        {
            FirstArray[x] = kb.nextInt();
            firstSecondArray[count] = FirstArray[x];
            count++;
        }

        System.out.println("Enter your second array:");
        for(int y = 0; y < number; y++)
        {
            SecondArray[y] = kb.nextInt();
            firstSecondArray[count] = SecondArray[y];
            count++;
        }

        System.out.println("The first Array is : " + Arrays.toString(FirstArray));
        System.out.println();
        System.out.println("The second Array is : " + Arrays.toString(SecondArray));
        System.out.println();
        System.out.println("The Combined Array is : " + Arrays.toString(firstSecondArray));
    }
    public static void main(String[] args) {
        Exercise7 exc = new Exercise7();
        exc.combinedArrays();
    }

    }

