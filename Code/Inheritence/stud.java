package av;

class human {

	human(){
		System.out.println("Human Constructor");
	}
	
	public void walk () {
		System.out.println("humans can walk");
		
	}
	
}
class stud extends human {
	public void study() {
		System.out.println("student is studing");
	}
	public static void main(String [] args) {
	Professor	s1 = new Professor();
	s1.walk();
	s1.study();
	s1.teaching();
		
	}
	
}
class Professor extends stud{
	
	public void teaching() {
		System.out.println("teacher is teaching");
	}
}
