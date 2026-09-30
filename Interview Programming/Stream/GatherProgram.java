import java.util.*;
import java.util.stream.*;

public class  GatherProgram
{
    public static void main(String[] args) 
    {
        List<List<Integer>> result = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .gather(Gatherers.mapConcurrent(10, i->i))
                .toList();

        System.out.println(result);



    }

}