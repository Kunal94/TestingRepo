package com.test;
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int hour=Integer.parseInt(time.substring(0,2));
        String checkForPA=time.substring(8);
       
        String finalString="";
       
        if(hour!=12 && checkForPA.equals("PM"))
            {
            hour=hour+12;
         
            finalString=String.valueOf(hour)+time.substring(2,8);  
        }
        else if(hour==12 && checkForPA.equals("AM"))
            {
            finalString="00"+time.substring(2,8);  
        }
        else
        {
        	finalString=time.substring(0,8);
        }
            
        
         
        System.out.println(finalString);
    }
}*/
import java.io.*;


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*public class Solution
{
	
	

	    static String[] missingWords(String s, String t) {
	        
	        String strS[]=s.split(" ");
	        int len=strS.length;
	        System.out.println(len);
	        
	      
	        String strT[]=t.split(" ");
	        System.out.println(strT.length);
	        Set strSet =new HashSet();
	        String resTemp[]=new String[len];
	        int count=0;
	        for(int i=0;i<strT.length;i++)
	           {
	            strSet.add(strT[i]);
	           
	          } 
	        System.out.println("Size "+strSet.size());
	        for(int i=0;i<strS.length;i++)
	         {
	            System.out.println("yes");
	          if(!strSet.contains(strS[i]))  
	          {
	              resTemp[count]=strS[i];
	              count++;
	          }
	        }
	        String res[]=new String[count];
	        for(int i=0;i<count;i++)
	         {
	            res[i]=resTemp[i];   
	        }
	        
	        return res;

	    }
	    public static void main(String args[])
	    {
	    	String str[]=missingWords("I am using hackerrank to improve programming","am hackerrank to improve");
	    	System.out.println("*********");
	    	for(String s:str)
	    		System.out.println(s);
	    	System.out.println("*********");
	    	
	    }


}*/

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arrStr[]=new String[n];
        int count=0;
        int tmpCount=1;
       
        Set s=new HashSet();
       
        for(int i=0;i<n;i++)
            arrStr[i]=sc.next();
        List l=new ArrayList();
        for(int i=0;i<arrStr[0].length();i++)
        {	
        		if(s.add(arrStr[0].charAt(i)))
        			l.add(arrStr[0].charAt(i));
        }
       
      
      for(int i=0;i<l.size();i++)
      {
    	  tmpCount=1;
        for(int j=1;j<n;j++)
        {
        	
        	for(int k=0;k<arrStr[j].length();k++)
        	{
        		
        		if((char)l.get(i)==arrStr[j].charAt(k))
        		{
        			tmpCount++;
        			break;
        		}
        	}
        	
        }
        if(tmpCount==n)
            count++;
      }
        	
        System.out.println(count);
                    
           
    

       
    }
}
