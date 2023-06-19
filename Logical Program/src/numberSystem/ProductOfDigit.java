package numberSystem;

public class ProductOfDigit {

	public static void main(String[] args) {
 int n=1234,pro=1;
 while(n!=0) {
	 pro*=n%10;
	 n=n/10;
 }
 System.out.println(pro);
	}

}
