import java.util.*;

class TreeSetExample {
    public static void main(String args[]) {
        // Creating and adding elements
        TreeSet<Integer> al = new TreeSet<>();
        al.add(100);
        al.add(120);
        al.add(50);
        al.add(10);
        // Traversing elements
        for (int i : al) {
            System.out.println(i);
        }
    }
}