package javaprograms;

public class FibonaciiSeries {
	
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21 34
		
		int a=0;
		int b=1;
		int sum = 0;
		System.out.println(a+ " " +b);  // 0 1 
		
		for(int i=2 ;i<10; i++)
		{
			
        sum =a+b;               // 1 2  3  5 8
        System.out.print(" " +sum);  // 1 
        a=b; // 1 1  2 3
        b=sum; // 1  2 3  5
        
		}
		
		
	}

}
