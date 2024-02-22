package javaprograms;

public class CountNumberofDigitsinNumber {

	public static void main(String[] args) {
		int a=3214557;
		int count=0;
		
		while(a!=0)
		{
			
			a=a/10;  
			count++;
			}
		System.out.println(count);
	}
}
