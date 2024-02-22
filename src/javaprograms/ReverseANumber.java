package javaprograms;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
	//1) using algorithm
	//2) using StringBuffer
    //3)using StringBuilder

//1)  using Algorithm	
		/*int a = 12345;
		
		int b=0;
		
		while(a!=0)
		{
			b = (b*10) + a%10;
			a= a/10;
		}
		System.out.println(b);
	}*/




// using StringBuffer

         /*  int a = 12345;
           StringBuffer sb = new StringBuffer(String.valueOf(a));
            StringBuffer rev = sb.reverse();

            System.err.println(rev);



}}*/
		
// Using StringBuilder
		
		int a = 1245;
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append(a);
        StringBuilder rev = append.reverse();

         System.err.println(rev);
	}}








