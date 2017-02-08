import java.util.stream.IntStream;

public class IntStreamPractice {
    public static void main(String[] args) {
        

        int[] values = {0,1,4,6,6,2,4};

        System.out.print("Original Values ");
        IntStream.of(values)
                  .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
   
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
        
        //sum of values with reduce method
        
        System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) ->x+y));
        //sum of squares of values with reduce method
        
        System.out.printf("Sum of squares via reduce metod: %d%n", IntStream.of(values).reduce(0, (x,y)->x+y*y));
        
        //product of values with reduce method
        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x,y)->x*y));
        
        System.out.println(IntStream.of(values).summaryStatistics());
    }
}
