import java.lang.*;

public class typecastingF2L {
	public static void main(String[] args) {
		float f = 5.46F;
		long l = 5678910L;
		float f1 = 5.46F;
		long l1 = 5678910L;
		
		System.out.println("\nTypecasting in JAVA");
		System.out.println("\nLong to Float (Explicit)");
		System.out.println("Before implicit-");
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		f = l;
		System.out.println("After implicit-");
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		
		System.out.println("\nLong to Float (Explicit)");
		System.out.println("Before Explicit-");
		System.out.println("f = " + f1);
		System.out.println("l = " + l1);
		f = l;
		System.out.println("After Explicit-");
		System.out.println("f = " + f1);
		System.out.println("l = " + l1);
	}
}