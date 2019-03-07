import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) {
        InputStream in = MainClass.class.getResourceAsStream("Monfichier.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String sCurrentLine;
        try {
            while ((sCurrentLine = reader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


