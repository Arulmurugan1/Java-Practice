import java.util.HashMap;
import java.util.Map;

class HasMapEx {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<>();
        int j = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            hm.put(j++, i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            hm.put(j++, i);
        }

        // for (Map.Entry m : hm.entrySet()) {
        // System.out.println(m.getKey() + " " + m.getValue());
        // }
        System.out.println(" Hm Values " + hm);
        System.out.println(" Hm Values " + hm.size());
        // System.out.println(" 12 th value " + hm.get(12));
    }
}