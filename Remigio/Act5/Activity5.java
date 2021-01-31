public class Activity5
{
    //i//
    public static void main(String[] args)
    {
        System.out.print("i)");
        System.out.println();

        int rows = 5;

        for (int i = 1; i < rows; ++i )
        {
            for (int j = 1; j < 10; ++j)
            {
                System.out.print( "*" + "");

           }
            System.out.println("");
        }
        //ii//
        System.out.println();
        System.out.print("ii)");
        System.out.println();

        for (int i = 1; i <= rows; ++i )
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //iii//
        System.out.println();
        System.out.print("iv)");
        System.out.println();

        for (int i = 1; i <= rows; ++i )
        {
            for (int j = rows - i; j > 0; --j)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.print("iv)");
        System.out.println();

        for (int i = 1; i <= rows; ++i )
        {
            for (int j = rows - i; j > 0; --j)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            for (int j = 1; j < i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.print("v)");
        System.out.println();

        for (int i = 1; i <= rows; ++i )
        {
            for (int j = rows - i; j > 0; --j)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; ++j)
            {
                System.out.print(i);
            }
            for (int j = 1; j < i; ++j)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println();
        System.out.print("vi)");
        System.out.println();

        for (int i = 1; i <= rows; ++i )
        {
            for (int j = rows - i; j > 0; --j)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; ++j)
            {
                System.out.print(i-j + 1);
            }
            for (int j = 1; j < i; ++j)
            {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

}
