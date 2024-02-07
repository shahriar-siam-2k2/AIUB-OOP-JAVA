import java.lang.*;

public class typecastingF2L {
	public static void main(String[] args) {
		float f = 5.46F;
		long l = 5678910L;
		System.out.println("\nTypecasting in JAVA");
		System.out.println("\nFloat to Long (Impicit)");
		System.out.println("Before implicit-");
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		l = f;
		System.out.println("After implicit-");
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		
		/*
		typecastingF2L.java:12: error: incompatible types: possible lossy conversion from float to long
                l = f;
                    ^
		1 error
		This is an exceptional case.
		*/
	}
}