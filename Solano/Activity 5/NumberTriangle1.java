package numbertriangle1;
public class NumberTriangle1 {
public static void main(String[] args) {
    int rows=6, k=0;
for (int i=1; i<rows; i++, k=0){
for (int j=rows-i; j>1; j--){
    System.out.print(" ");
}         
    while (k !=2 *i-1){
        System.out.print(i);
        k++;
    }
System.out.println();
}                                                 
}
}