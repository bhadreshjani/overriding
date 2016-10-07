package assignment;

class A
{
	 public void test()
	 {
		 System.out.println("Test From Class A");
	 }
		//public void invoke()
		//{
	//		C.test();
		//}
	 
}
class B extends A
{
	public void test()
	 {
		 System.out.println("Test From Class B");
	 }

}
class C extends B
{
	public void test()
	 {
		 System.out.println("Test From Class C");
	 }
}
public class classaccess {

	public static void main(String args[])
	{
		A a = new C();
				a.test();
		
	}
}

