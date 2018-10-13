package student;

class c1{
	int a=6;
	c1(){
		
		System.out.println("Class C1 Construtor");
	}
	public void m1() {
		System.out.println("Classs c1");
	}
}
class c2 extends c1{
	//int a=15;
	c2()
	{
		System.out.println("Class c2 constructor");
		//System.out.println("class c1 variable "+ a);
	}
	public void m2() {
		System.out.println("Classe c2");
	}
}

class c3 extends c2{
	c3(){
		
		 System.out.println("class c3 constructor");
	}
	public void m3() {
		System.out.println("Classe c3  m3");
	}
}

class cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//c2 obj = new c2();
		c3 obj1 = new c3();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		int a=0,b=6;
		
		try {
			System.out.println(b/a);
		} catch (Exception e) {
			System.out.println("Cant DIvide With ZEro " + e);
		}
		
		finally {
			System.out.println("This is finally block");
		}
		System.out.println(obj1.a);
		System.out.println(); 
		
	}

}

