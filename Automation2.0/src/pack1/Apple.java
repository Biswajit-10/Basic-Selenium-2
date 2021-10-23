package pack1;

class Apple implements fruit,vegetable{
	@Override
	public void taste() {
		System.out.println("it taste fruity");
	}	
	public static void main(String[] args) {		
	}
	@Override
	public void eat() {
		System.out.println("eat well");
	}
}
class Orange extends Apple{	
}
class grapes extends Orange{	
}
class Main{
	public static void main(String[] args) {
		fruit f=new grapes();
		f.taste();
		System.out.println(f);
	}
}

