/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Divide_str_into_equal_parts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str=val.next();//to get input string 
        System.out.println("To divide the string into n equal parts ... enter the value of n:");
        int n=val.nextInt();
        int len;
        if(str.length()%n!=0)
            System.out.println("String can't be divided into equal parts!!");
        else
        {
             len=str.length()/n;
             System.out.println("The string divided into "+n+" parts and they are:");
             for(int i=0;i<str.length();i++)
             {
                 if(i%len==0)
                     System.out.print(" ");
                 System.out.print(str.charAt(i));    
             }
        }
       
        
    }
    
}
