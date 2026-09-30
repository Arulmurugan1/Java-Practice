class PracticeQuestion1 {
    public static void main(String[] args) {
        
        int a=3;
        int b=4;

        int result = a++ > 3 ? ++b : a + b++;

        result += a > 4 ? b++ : ++a;

        System.out.print(result);
        System.out.print(" "+a);
        System.out.print(" "+b);

    }
}