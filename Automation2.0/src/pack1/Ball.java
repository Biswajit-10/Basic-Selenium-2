package pack1;

import java.util.List;
import java.util.ArrayList;

public class Ball {
	public Ball() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GET LOST";
	}

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(new Ball());
		l.add(new Ball());
		l.add(new Ball());
		System.out.println(l.get(0));//SOP(b) IS SAME AS SOP(Ball@53a26t)
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l);  //SELECT STATEMNT AND GO TO SOURCE AND ADD TRY CATCH
		
	}

}
