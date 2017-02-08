import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.stream.IntStream;

public class RollDice6MilTimes {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		//roll a die 6000000 times and summarize the results
		
		System.out.printf("%-6s%s%n", "Face", "Frequency");
		random.ints(6_000_000, 1, 7)
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(),
					Collectors.counting()))
			.forEach((face, frequency)-> 
				System.out.printf("%-6d%d%n", face, frequency));
			
		
		
	}

}
