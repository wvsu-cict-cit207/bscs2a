public class OutputSix{
    public static void main (String[] args) {
        int jSize = 7;
        int iSize = 4;
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) { 
                if (j <= Math.ceil(jSize/2) + i && j >= Math.ceil(jSize/2 - i)) {
                    System.out.print(Math.abs(j-(iSize-1)));
                }
                else {
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
}