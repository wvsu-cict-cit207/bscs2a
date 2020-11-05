public class OutputFive {
    public static void main (String[] args) {
        int jSize = 11;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < jSize; j++) { 
                if (j <= Math.ceil(jSize/2) + i && j >= Math.ceil(jSize/2 - i)) { 
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}