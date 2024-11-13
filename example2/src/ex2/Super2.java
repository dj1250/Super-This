package ex2;

public class Super2 {

	int name;
	public void m1() {
		System.out.println(" Parent Default method");
	}
	public void m2(int a) {
		System.out.println(" Parent one parameterized method");
	}
	public void m3(int a,int b) {
		System.out.println(" Parent two parameterized method");
		this.m1();
	}
	public void m4(int a,int b,int c) {
		System.out.println(" Parent three parameterized method");
		
	}
}
