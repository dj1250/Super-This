package ex2;

public class this2 extends Super2 {
	public void me1() {
		super.name=30;
		super.m4(12, 65, 98);
		super.m2(45);
		this.me2();
		System.out.println("child default method");		
	}
	public void me2() {
		super.m1();
		super.m4(1, 6, 9);
		super.m2(90);
		System.out.println("child one parameterised method");
	}
	public static void main(String[] args) {
	   this2 obj =new this2();
	 obj.m3(23, 34);
	 obj.me1();
	 
      
	}

}
