import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAndMaxSubstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           
    	
    	  
    	    Scanner sc = new Scanner(System.in);
    	 
    	    System.out.println("Enter the String:-");
    	    
    	    
    	     
           String str = sc.nextLine();   //get the string from scanner   ElenaSidyakina -14
           System.out.println(str.length());
           
           System.out.println("Enter the length");    
           int count = sc.nextInt();                 //get the length of substrings and save to count 3
           
           ArrayList<String> list = new ArrayList<String>();  
           
           for (int i = 0; i < str.length(); i = i + 1) {
        	              
                if (str.length() - i >= count) { 
                
                     list.add(str.substring(i, count+i));  
                                      
                  
                }  
           }  
           Collections.sort(list);  
           System.out.println(list.get(0));  
           System.out.println(list.get(list.size() - 1));  
      }  
 }