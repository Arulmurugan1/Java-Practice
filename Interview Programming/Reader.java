import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    public static void main(String[] args) {
        try {
            FileReader read = new FileReader("VectorClass.java");
            BufferedReader br = new BufferedReader(read);
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
