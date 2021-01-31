import java.util.Scanner;

public class Activity6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = 10;

        System.out.println("Enter " + size + " integers:");

        int[] array = new int[size];
        for (int i = 0; i < size; ++i)
        {
            array[i] = sc.nextInt();
        }
        // smallest//
        int smallest = array[0];

        for (int i = 0; i < size; ++i)
        {
            if (smallest > array[i])
            {
                smallest = array[i];
            }
        }

        // greatest//
        int greatest = array[0];

        for (int i = 0; i < size; ++i)
        {
            if (greatest < array[i])
            {
                greatest = array[i];
            }
        }

        System.out.println("Maximum: "+ greatest + " Minimum: "+ smallest);
    }
}
