import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int bajt;

        try {
            fis = new FileInputStream("test123.txt");
            do {
                bajt = fis.read();
                if (bajt != -1)
                    System.out.println((char) bajt);
            } while (bajt != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing file.");
                }
            }
        }
    }
}


