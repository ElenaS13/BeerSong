
public class GoodDogTestDrive {

	public static void main(String[] args) {
		
		GoodDog one = new GoodDog();
		one.setSize(78);
		GoodDog two = new GoodDog();
		two.setSize(567);
		System.out.println("Dog one: "+ one.getSize());
		System.out.println("Dog one: "+ two.getSize());
		one.bark();
		two.bark();
		
		

	}

}
