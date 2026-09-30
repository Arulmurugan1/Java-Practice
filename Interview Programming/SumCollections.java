import java.util.*;

public class SumCollections {
    
    public static void main(String[] args) 
    {
        /*List<Double> intList = List.of(10.0,20.0,30.0,40.0,50.0);

        Object processedList = intList.stream().mapToDouble(Double::doubleValue).sum();*/

        int[] intArray = {1,2,3,4,5,6};

        Object arrSum = Arrays.stream(intArray).sum();

        System.out.println("Final Result ..." + arrSum);

    }    
}
