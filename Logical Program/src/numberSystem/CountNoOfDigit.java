package numberSystem;

public class CountNoOfDigit {

	public static void main(String[] args) {
	int n=2345678,c=0;
	while(n!=0) {
		c++;
		n=n/10;
	}
	System.out.println(c);

	}

}
