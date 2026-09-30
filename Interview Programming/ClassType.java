public class ClassType {
    public static void main(String args[]) {
        double x = 5;
        String type = ((Object) x).getClass().getSimpleName();
        System.out.println(type);

    }
}