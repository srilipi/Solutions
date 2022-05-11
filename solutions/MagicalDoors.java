import java.util.*;
import java.lang.*;
import java.io.*;

class MagicalDoors
{   
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in); //Scanner for taking input
        int t = in.nextInt(); //Variable t for no of test case 
        while(t>0)  //loop for every test case
        {
                
             StringBuilder str = new StringBuilder(in.next()); 
             long res = 0;  
             if(str.charAt(0) == '0')  
             res++;  
             for(int i = 1; i<str.length(); i++) //for loop starting from 2nd character
             {
                 if(str.charAt(i) != str.charAt(i-1)) 
                     res++; 
             }
             System.out.println(res); //printing the result
             t--; 
        }     
    }
}