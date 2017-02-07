
public class ConstuctorTutorial {

	public static void main(String[] args) {
		Dog woof1 = new Dog("LAb", "Black");
		woof1.bark();
		System.out.println(woof1.breed);

	}

}

class Dog {
	
	String breed;
	String color;
	
	Dog(String b, String c){
		breed = b;
		color=c;
	}
	
	
	
	void bark(){
		System.out.println("Woof");
		
	}
	
	void run(){
		System.out.println("Woosh");
	}
}
