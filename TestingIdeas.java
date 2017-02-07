
public class TestingIdeas {

	public static void main(String[] args) {
		Programmer Elena = new Programmer();
		Elena.employeeBehavior();
		Elena.humanBeavior();
   
		

	}

}


interface Human {
	
	void humanBeavior();
}

interface Employee{
	void employeeBehavior();
}

class Programmer implements Human, Employee{

	@Override
	public void employeeBehavior() {
		System.out.println("I am an employee!");
		
	}

	@Override
	public void humanBeavior() {
		System.out.println("I am a human!");
		
	}
	
}