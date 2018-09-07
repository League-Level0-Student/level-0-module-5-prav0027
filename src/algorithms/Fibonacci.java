package algorithms;

public class Fibonacci {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	for(int i = 0; i<6; i++) {
		System.out.println(a);
		System.out.println(b);
		a = a+b;
		b = a+b;
	}
	System.out.println("144");
}
}
