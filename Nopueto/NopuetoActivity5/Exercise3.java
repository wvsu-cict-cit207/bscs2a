 
public class Exercise3
{
	public static void main(String args[])
    {
        int c, j, k=8;
        for(c=0; c<5; c++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 2;
            for(j=0; j<=c; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}