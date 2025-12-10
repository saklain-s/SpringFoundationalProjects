package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class _5EH {
    void readFile() throws IOException{
        FileReader fr = new FileReader("test.txt");
        fr.read();
        fr.close();
    }

    public static void main(String[] args) {
        // must catch the exception in order to use obj of the class
        _5EH obj = new _5EH();
        try {
            obj.readFile();
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
