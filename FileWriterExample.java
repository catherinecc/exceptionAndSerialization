import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        tryAndFinally();
        tryWithResourcesDemo();
    }

    private static void tryWithResourcesDemo() {

        try(FileWriter writer =  new FileWriter("addressFile.txt")) {
            writer.write("Hello there Catherine");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryAndFinally() {
        FileWriter writer = null;
        try {
             writer = new FileWriter("addresFile.txt");
       writer.write("Catherine - Puthenveettil");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
