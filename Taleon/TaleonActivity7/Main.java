import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		//Input for size
		System.out.print("Enter the size of the ArrayList: ");
        int size = sc.nextInt();
		
		//Input for Elements
		System.out.println("Enter " + size + " integers:");
		for (int i = 0; i < size; i++) {
		    values.add(sc.nextInt());
    	}
    	
    	//Sorting
    	Collections.sort(values);
    	
    	//Output
    	System.out.println("Largest Element: " + values.get(0));
    	System.out.println("Smallest Element: " + values.get(values.size()-1));
	}
}