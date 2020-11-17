package javaapplication.Activity1;

public class Min_And_MAx_In_Array {
    public int Max(int [] array){
        int max = 0;
        
        for(int i = 0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    public int Min(int [] array){
        int min = array[0];
        
        for(int i =0; i< array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
       int NumArray[] = {100,20,30,40,50,60,70,80,90,10};
       Min_And_MAx_In_Array m = new Min_And_MAx_In_Array();
       System.out.println("Maximum value is = " + m.Max(NumArray));
       System.out.println("Minimum value is = " + m.Min(NumArray));
   }
   
}
