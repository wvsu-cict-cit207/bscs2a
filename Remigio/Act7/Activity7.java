import java.util.Scanner;

public class Activity7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " integers.");
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

        System.out.println("Largest element: "+ greatest + " Smallest element: "+ smallest);
    }
}
