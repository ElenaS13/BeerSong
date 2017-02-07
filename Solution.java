class Solution{
    int result;
     int power(int n, int p){
        try{
            if(n>0 && p>0){
            result = (n *power(n, p-1));
                System.out.println(result);
                
            }} catch(IllegalArgumentException e){
            System.out.println("n and p should be non-negative");
        }
		return result;
        
    }
}