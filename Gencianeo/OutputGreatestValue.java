/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputgreatestvalue;

/**
 *
 * @author Shaina Gencianeo
 */
public class OutputGreatestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int no1=10, no2=23, no3=5;
        if(no1>=no2 && no1>=no3)
        System.out.println("The highest number is " + no1);
        else if(no2>=no1 && no2>=no3)
        System.out.println("The highest number is " + no2);
        else
        System.out.println("The highest number is " + no3);
        
        
        // TODO code application logic here
    }
    
}
