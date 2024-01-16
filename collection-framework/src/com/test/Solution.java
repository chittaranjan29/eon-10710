package com.test;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        HashMap<String,String> phonebook=new  HashMap<String,String> ();
        for(int i=0;i<n;i++)
        {
           String name=scanner.nextLine();
           String phone=scanner.nextLine(); 
           phonebook.put(name,phone);
           
        }
       
        while(scanner.hasNext())
        {
            String n1=scanner.nextLine();
            if(phonebook.containsKey(n1))
            {
                System.out.println(n1+"="+phonebook.get(n1));
            }
            else
            {
                System.out.println("Not found");
            }
            
        }
        
        
    }
}