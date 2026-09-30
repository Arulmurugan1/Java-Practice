import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {

    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Java");
        lhs.add("T");
        lhs.add("Point");
        lhs.add("Good");
        lhs.add("Website");
        System.out.println("The hash set is: " + lhs);
        System.out.println(lhs.remove("Good"));
        System.out.println("After removing the element, the hash set is: " + lhs);
        System.out.println(lhs.remove("For"));
        Object[] lhs1 = lhs.toArray();

        for (Object i : lhs1) {
            System.out.print(i + " ");
        }
    }
}
