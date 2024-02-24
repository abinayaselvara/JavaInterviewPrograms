package javaprograms;

public class CountNumberOfEvenAndOdd {

	public static void main(String[] args) {
// checking each digit in number is even or odd
int originalnumb= 123456;
int even =0;
int odd =0;

while(originalnumb>0)
{
	int b =originalnumb%10;
	if(b%2==0)
		{
			even++;
		}
	else
		{
			odd++;
		}
	originalnumb=originalnumb/10;
	
	
}
System.out.println(even);
System.out.println(odd);

	}

}
