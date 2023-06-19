package numberSystem;

import java.lang.reflect.Array;

public class Palindrome{

	public static void main(String[] args) {
    int n=121,n1=n,rev=0;
    while(n!=0) {
    	rev=(rev*10)+n%10;
    	n=n/10;
    }
    System.out.println(n1+"  "+rev);
    if(rev==n1)
    System.out.println("Palindrome");
    else {
    	System.out.println("Not a palindrome");
    }
		
	
	}

}
