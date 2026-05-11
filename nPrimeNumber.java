package com.kjs.Prime;
import java.util.*;
public class nPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n  = sc.nextInt();
		ifprime(n);
		}
	static void ifprime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(isprime(i))
				System.out.println(i);
		}
	}
	static boolean isprime (int c)
	{
		for(int i=2;i*i<=c;i++)
		{
			if(c%i==0)
				return false;
			
		}
		return true;
	}

}
//this is the nth prime problem 