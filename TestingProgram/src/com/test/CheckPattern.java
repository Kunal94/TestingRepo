package com.test;

import java.util.regex.Pattern;

public class CheckPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k="batcatpat(nat";
		try
		{
		Pattern p = Pattern.compile("([0-1]?[0-9]?[0-9]|[2]?[0-4]?[0-9]|[2]?[5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[2]?[0-4]?[0-9]|[2]?[5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[2]?[0-4]?[0-9]|[2]?[5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[2]?[0-4]?[0-9]|[2]?[5]?[0-5])");
		System.out.println(p.matcher("255.255.245.255").matches());
		System.out.println("Valid");
		}catch(Exception e)
		{
			System.out.println("Invalid");
		}

	}

}
