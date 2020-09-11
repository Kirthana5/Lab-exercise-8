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
public class String_palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str=val.next();//to get string input from user
        String str1=str.toLowerCase();//to convert string to lowercase(to avoid confusion when comparing strings to check whether it is palindrome or not)
        char c[]=str1.toCharArray();
        boolean flag=true;
        for(int i=0;i<c.length/2;i++)
        {
            if(c[i]!=c[c.length-1-i])
            {
                flag=false;
                break;
            }
          
        }
        if(flag)
            System.out.println(str+" is a palindrome!!");
        else
            System.out.println(str+" is not a palindrome!!");
    }
    
}
