package javaprograms;


public class NumberIsPalindrome {
	
	int a= 153422;
	int rev = 0;
	{
	while(a!=0)
	{
		
		rev= (rev*10) +a%10;
		a=a/10;
		
	}
if(rev==a)
	{
		System.out.println("The String is Palindrome");
	}
	else
		
	{
		System.out.println("The String is not Palindrome");
	}
}

}


