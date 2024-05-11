package com.bracket.pro;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        
        String str=sc.next();
        String ori= str;
        String reverse=" ";
        /* Enter your code here. Print output to STDOUT. */
        //char a[] =A.toCharArray();
        int len= str.length();
        for(int i =len-1; i>=0; i-- ) {
            reverse= reverse + str.charAt(i);
        }
        System.out.println("Reverse array is : "+ori);
        System.out.println("Reverse array is : "+reverse);

        if(ori.equals(reverse)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");

        }
    }
}



