import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        // how to read a file using java
        //BufferedReader + FileReader : Best for reading text files line-by-line
        //fileInputstream : Best for binary files (e.g images , audio files)
        //RandomAccessFile : best for read/write specific portions of a large file

        String filePath = "/Users/moustaphadiop/Desktop/testDEVBis.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){

            System.out.println("that file exists");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("I/O exception");
        }



    }
}
