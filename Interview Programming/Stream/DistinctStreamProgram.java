
import java.util.Collections;
import java.util.List;

public class DistinctStreamProgram 
{
    public static void main(String[] args) 
    {
        List<String> names = List.of("A1","A2","A1","A3","A1","A1","A4");

        /*System.out.println("Listed Unique names below");
        names.stream().distinct().forEach(System.out::println);*/

        System.out.println("Listed repeated Names Alone");

        //printRepeatedByFunctionIdentity()

        /*names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet()
        .stream()
        .filter( entrySet1 -> entrySet1.getValue() > 1)
        .forEach(System.out::println);*/

        //PrintRepeatedByFrequency

        names.stream().filter(name -> Collections.frequency(names, name) > 1).distinct().forEach(System.out::println);
    }
}
