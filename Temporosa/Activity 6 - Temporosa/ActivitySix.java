import java.util.Scanner; 

public class ActivitySix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter elements: ");
        for (int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < 10; i++){
            if (arr[i] < min){
                min = arr[i];
            }

            if (arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
