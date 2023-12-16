package test.domain.domain;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("");
        File file1 = new File("");
        try {
            file1.createNewFile();
        }
        catch (I0Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (I0Exception e) {
            e.printStackTrace();
        }
    }
}
