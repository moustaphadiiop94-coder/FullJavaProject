import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //How to write a file using java (4 popular options)
        //FileWriter = Good for small or medium size text files
        //BufferedWriter = Better performance for large amounts of text
        //PrintWriter = Best for structured data , like reports or logs
        //FileOutputStream = Best for binary files (e.g images , audio files)

        //FileWriter fw = new FileWriter("test.txt");

       /* try (FileWriter fw = new FileWriter("test.txt")){
            fw.write("I like Java");
            System.out.println("file written");

        }catch (IOException e){
            e.printStackTrace();
            System.out.println(" Could not write a file "+e.getMessage());

        }*/
        String filePath="/Users/moustaphadiop/Desktop/testDEVBis.txt";
        //String textContent = "I like Java  \n its very good";
        String textContent = """
                Roses are red 
                Violet are blue
                Orange is a new black
                hello boy 
                """;
        try (FileWriter fw = new FileWriter(filePath)){
            fw.write(textContent);
            System.out.println("file written");

        }
        catch (FileNotFoundException e){
            System.out.println("File path not found");
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(" Could not write a file "+e.getMessage());

        }


    }
}
