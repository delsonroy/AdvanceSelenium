package day03;

public class Demo3b {

	public static void m1(int a)
	{
		System.out.println("m1");
	}
	public static void m2(int a, String b)
	{
		System.out.println("m2");
	}
	
	
	
	public static void main(String[] args) throws Exception, Exception {

		Demo3b obj = new Demo3b();
		Demo3b.class.getMethod("m1", int.class);
		

	}

}
