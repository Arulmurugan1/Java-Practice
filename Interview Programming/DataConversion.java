public class DataConversion {
    public static void main(String[] args) {
        Integer myInt = new Integer(5000);
        System.out.println("Integer value = " + ((Object) myInt).getClass().getSimpleName());
        // convert.
        int newInt = myInt;
        System.out.println("int value = " + ((Object) newInt).getClass().getSimpleName());
    }
}
