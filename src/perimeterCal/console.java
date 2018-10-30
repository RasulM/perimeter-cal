/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterCal;


import java.util.Scanner;

/**
 *
 * @author Raz
 */
public class console {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner sc;
        double area;
        double peri;
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        System.out.println("Welcome to the area perimeter calcultor");
        sc = new Scanner(System.in);
        double length = helper.getDoubleWithinRange(sc,"Enter length:\t",0,1000000);
        double width =  helper.getDoubleWithinRange(sc,"Enter width:\t",0,1000000);
        area = length * width;
        peri = (2*length)+(2*width);
        System.out.println("Area:\t"+ area);
        System.out.println("Perimeter:\t"+ peri);
         choice = helper.choiceContinue(sc,"continue y/n","y","n");    
        }
        
        
        
        
    }
      
    
}
 