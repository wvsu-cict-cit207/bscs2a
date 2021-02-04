public class Act8
{
    public static void main(String []args)
    {
        //1.
        String str = "Hello";
        System.out.println("1.");
        System.out.print("a.");
        System.out.println( str.endsWith( "lo" ) );
        System.out.print("b.");
        System.out.println( str.endsWith( "alp" ) );
        System.out.println();
        
        //2
        System.out.println("2.");
        System.out.println( Character.forDigit(15, 16) );
        System.out.println();

        //4.
        System.out.println("4.");
        System.out.println( Math.floor(3.13));
        System.out.println( );

        //5.
        System.out.println("5.");
        System.out.println( "3=" + Character.isDigit('3'));
        System.out.println( );

        //3.
        System.out.println("3. program will terminate after this");
        System.exit(1);
        System.out.println("Test if exit is working");
    }
 }
