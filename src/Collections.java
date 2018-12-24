import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream stream = new FileInputStream("c:/moscow-buildings.csv");
        int length = stream.available();
        byte [] data = new byte [length];
        stream.read(data);

        String text = new String(data);

        //System.out.println(text);
        ArrayList<String []> lineWords = new ArrayList<>();

        String [] lines = text.split("\n");
        for(String line : lines){
            String [] words = line.split(",");
            lineWords.add(words);
        }

        for(String [] words : lineWords) {
            if(words[9].equals("1994")) {
                for (String word : words) {
                    System.out.print(word);
                    System.out.print("!");
                }
                System.out.println("__");
            }
        }

    }
}
