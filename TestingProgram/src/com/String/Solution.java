package com.String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int index=0;
       
        String tempB=B;
        
        int count01=0;
        int count10=0;
        while(true)
        {
            index=B.indexOf("010",index);
            B=B.replaceFirst("010","001");
            if(index==-1)
                break;
             count01++;
            
        }
        
        index=0;
        while(true)
        {
            
            index=tempB.indexOf("010",index);
            tempB=tempB.replaceFirst("010","100");
            
            if(index==-1)
                break;
             count10++;
            
        }
        if(count10<count01)
            System.out.println(count10);
        else
            System.out.println(count01);
    }
}

