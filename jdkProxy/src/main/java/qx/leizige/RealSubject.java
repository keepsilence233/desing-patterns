package qx.leizige;

public class RealSubject implements Subject {


	@Override
	public String rent() {
		System.out.println("I want to rent my house");
		return "rent method";
	}

	@Override
	public void hello(String str) {
		System.out.println("hello: " + str);
	}
}
