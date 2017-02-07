//This was NFL interview question


public class largestElementArray {

	public static void main(String[] args) {
		//Method 1
		
		
		int[] array = {20,70,60,10,2};
		int temp = array[0];
		
		
		for(int i =1; i<array.length; i++){
			if(temp<array[i]){
				temp=array[i];
				//System.out.println(temp);
			}
		}
		System.out.println(temp);
}
	
}


