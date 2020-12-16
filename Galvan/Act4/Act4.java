import java.io.*; 
class Act4 
{ 
    public static void main(String args[]) 
                  throws IOException 
    { 
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 

        System.out.println("Convert Temperature\nOption\n1.Celsius to Farenheit\n2.Farenheit to Celsius\nEnter Choice: "); 
        int ch = Integer.parseInt(br.readLine());  
        switch(ch){
            case 1:
              System.out.printf("Celsius to Farenheit selected\nInput Celsius to be conver in to Farenheit:");
              double c = Integer.parseInt(br.readLine());
              double f = (9.0/5.0)*c + 32;
              System.out.println("Temperature in Farenheit is : "+f);
              break;
            case 2:
               System.out.printf("Farenheit to Celsius selected\nInput Farenheit to be conver in to Celsius:");
              f = Integer.parseInt(br.readLine());
              c = (double) ((5.0/9.0)*(f - 32));
              System.out.println("Temperature in Celsius is : "+c);
              break;
            default:
               System.out.printf("Invalid Option");
        }
    } 
} 