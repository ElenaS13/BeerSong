import java.util.Arrays;

mport java.util.Comparator;

 import java.util.List;
  
import java.util.stream.Collectors;
  
 public class ArraysAndStreams 9{
public static void main(String[] args)
 {
 Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6}; 13
 // display original values
System.out.printf("Original values: %s%n", Arrays.asList(values));
 System.out.printf("Sorted values: %s%n",
		 19
		 29
		 Arrays.stream(values)
		    20
		 .sorted()
		    .collect(Collectors.toList())
		 21   ); 22
		   23 // values greater than 4
		 24
		  25
		 List<Integer> greaterThan4 =
		   Arrays.stream(values)
		 
		 .filter(value -> value > 4)
		    .collect(Collectors.toList());
		  System.out.printf("Values greater than 4: %s%n", greaterThan4);
		 // filter values greater than 4 then sort the results
		  System.out.printf("Sorted values greater than 4: %s%n",
		
		 Arrays.stream(values)
		
		 .filter(value -> value > 4)
		 
		 .sorted()
		    .collect(Collectors.toList())
		 );
		   
		// greaterThan4 List sorted with streams
		  System.out.printf(
		 "Values greater than 4 (ascending with streams): %s%n",
		
		 greaterThan4.stream()
		    41
		 .sorted()
		    .collect(Collectors.toList())
		 42 ); 43 }
		 44 } // end class Arrays