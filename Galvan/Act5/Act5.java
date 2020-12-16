public class Act5 {

   public static void main(String[] args) {
        int rows = 5;
        System.out.print("i)");  
        System.out.println();
        for(int i = 1; i < rows; ++i) {
            System.out.print("**********");
            System.out.println();
        }
        System.out.println();
        System.out.print("ii)");  
        System.out.println();
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("iii)");
        System.out.println();
            for(int i = 5; i >= rows-5; --i) {
            for(int j = 1; j <= i-1; ++j) {
                System.out.print(" ");
            }
            for(int j = 5; j >= i; --j) {
                System.out.print("*");
            }   
            System.out.println();
        }
        System.out.println();
        System.out.print("iv)");
        System.out.println();
        int k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
        System.out.println();
        System.out.print("v)");
        System.out.println();

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print(i);
                ++k;
            }

            System.out.println();
        }
        System.out.println();
        System.out.print("vi)");
        System.out.println();
        int n = 1;
	for (int i = rows; i > 0; i--)
	{
	for (int j = 1; j <= i; j++)
	{
            System.out.print(" ");
	}

	for (int j = n; j > 1; j--)
	{ 				
            System.out.print(j); 			
	} 			 			
		
	for (int j = 1; j <= n; j++) 			
	{
	System.out.print(j);
	}
	
        System.out.println();

	n++;
	}
    }
}
