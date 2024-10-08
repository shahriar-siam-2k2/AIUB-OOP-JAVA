import java.lang.*;

public class StringDemo
{
	public static void main(String args[])
	{
		String s1="HELLO java";
		String s2= new String();
		String s3 = new String("Hello");
		String s4 = "Hello";
		String s5 = new String("Hello");
		String s6 = "Hello";
		String s8 = new String("JaVaClaSs");
			
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s1.length());
		System.out.println(s3.charAt(1));
		System.out.println(s3.indexOf('o'));
		
		System.out.println(s1.concat(s3));//concatenate
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if(s3 == s5)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		if(s3.equals(s5))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		String s7 = s1.substring(2,7);//begin index is inclusive end index is exclusive
		System.out.println(s7);
		System.out.println(s1);
		s1 = s1.substring(3,7);
		System.out.println(s1); 
		s8=s8.toLowerCase();
		System.out.println(s1.compareTo(s8));
		System.out.println(s3.compareTo(s5));
		System.out.println(s8 + "\n");

		System.out.println(11);
		System.out.println('1'+'1');
		System.out.println(1+1);
		System.out.println("Siam"+1+1);
		System.out.println("Siam" + (1+1));
		System.out.println(1+1+"Siam\n");
	}
}

/*
OUTPUT:
	false
	true
	10
	e
	HELLO javaHello
	HELLO java

	Hello
	No
	yes
	LLO j
	HELLO java
	LO j
	-30
	0
	javaclass

	11
	98
	2
	Siam11
	Siam2
	2Siam

*/