package pack1;

public class A {
	{
		System.out.println("block of class A");
	}
	A(){
		System.out.println("constructor of class A");
	}
	public static void main(String[] args) {
		
	}
}
class B extends A{
	{
		System.out.println("block of class B");
	}
	B(){
		System.out.println("constructor of class B");
	}
}
