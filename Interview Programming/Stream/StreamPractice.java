import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice 
{
    public static void main(String[] args) {

        List<Integer> sortList = List.of(10,5,6,3,4,9,7);

        //stream.sorted() Simple sorting (natural order)
        sortList = sortList.stream().sorted().collect(Collectors.toList());

        System.out.println("stream.Sorted List :"+sortList);

        //Intstream's sorted Simple sorting (reverse order)
        //sortList = sortList.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("reverse stream.Sorted List :"+sortList);

        //int maxNo = sortList.stream().mapToInt(Integer::intValue).min().orElse(0);

        //int maxNo = sortList.stream().min(Integer::compare).get();

        int maxNo = sortList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(maxNo);

    }   
}
