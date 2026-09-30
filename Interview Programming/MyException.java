class PException extends Exception {
    public PException() {
    }

    public PException(String s) {
        System.out.println("Invalid Product Weight " + s);
    }

    public void check(int w) throws PException {
        if (w < 100) {
            throw new PException("Weight == " + w);
        }
    }
}

public class MyException {
    public static void main(String... args) {
        int weight = 80;
        PException p = new PException();
        try {
            p.check(weight);
            System.out.println("Product more than 100 kg");
        } catch (PException e) {
            e.printStackTrace();
        }
    }
}
