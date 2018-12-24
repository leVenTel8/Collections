import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Collections {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream stream = new FileInputStream("c:/moscow-buildings.csv");
        int length = stream.available();
        byte [] data = new byte [length];
        stream.read(data);

        String text = new String(data);

        System.out.println(text);


    }
}
