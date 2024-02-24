package javaprograms;

import java.util.Scanner;

public class NumberIsPalindrome {
	
	
	public static void main(String[] args) {
		//getting input from user
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Number");
 int a = sc.nextInt();
 
 int b= a; // storing into another variable
 int rev = 0;
 // logic for reversing a number
 while(a!=0)
 {
	 rev = rev *10 +a%10;
	 a =a/10;
 }
 // without printing the reverse number, writing if else logic to check for palindrome or not
 if(b==rev)
 {
	 System.out.println(rev+ "Palindrome");
 }
 else
 {
	 
    System.out.println(rev+ " not a Paindrome");
 }}}


