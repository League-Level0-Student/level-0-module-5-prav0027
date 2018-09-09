package nested_loops;

public class ForLoopGauntlet {
public static void main(String[] args) {
	// Single For Loops
	for(int i=0; i<11; i++) {
		System.out.println(i);
	}
	System.out.println(" ");
	for(int a=100; a>-1; a--) {
		System.out.println(a);
	}
	System.out.println(" ");
	for(int b = 2; b<101; b++) {
		System.out.println(b);
	}
	System.out.println(" ");
	for(int c=1; c<100; c++) {
		System.out.println(c);
	}
	System.out.println(" ");
	for(int d = 1; d<501; d++) {
		if(d%2==0) {
			System.out.println(d+ " is even");
		}
		else {
			System.out.println(d+ " is odd");
		}
	}
	System.out.println(" ");
	for(int e = 0; e<778; e++) {
		if(e%7==0) {
			System.out.println(e);
		}
	}
	System.out.println(" ");
	for(int f = 2003; f<2019; f++) {
		System.out.println("In "+f+ ", I was "+ (f-2003)+" years old.");
	}
	System.out.println(" ");
	// Nested for-Loops
	System.out.println("Nested For-Loops");
	for(int g = 0; g<3; g++) {
		for (int h=0; h<3; h++) {
		System.out.println(g+ " "+ h);	
		}
		
	}
	System.out.println(" ");
	for(int k = 0; k<3; k++) {
	for(int j = 1; j<4; j++) {
		System.out.print(j+k*3);
		System.out.print(" ");
		}
	System.out.println();
	}
	System.out.println(" ");
	for(int l = 0; l<10; l++) {
		for(int m = 1; m<11; m++) {
			System.out.print(m+l*10);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int n=0; n<7; n++) {
		for(int o = 0; o<n; o++) {
		System.out.print("*");
		
		}
		System.out.println();
	}
}
}

