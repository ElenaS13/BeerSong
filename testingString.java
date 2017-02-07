
public class testingString {

	public static void main(String[] args) {
		
		String a= "hello";
		String b = "java";
		
		int sum = a.length() + b.length();
		System.out.println(sum);
		
		int compare = a.compareToIgnoreCase(b);
		
		if(compare >0){
			System.out.println("Yes");
			
		} else {
			System.out.println("No");
		}
		
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1) + " "+b.substring(0,1).toUpperCase()+b.substring(1));

	}

}
