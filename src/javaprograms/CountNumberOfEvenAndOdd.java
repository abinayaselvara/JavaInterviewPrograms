package javaprograms;

public class CountNumberOfEvenAndOdd {

	public static void main(String[] args) {

int a= 123456;
int even =0;
int odd =0;

while(a>0)
{
	int b =a%10;
	if(b%2==0)
		{
			even++;
		}
	else
		{
			odd++;
		}
	a=a/10;
	
	
}
System.out.println(even);
System.out.println(odd);

	}

}
