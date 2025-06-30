package chapter10;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        String filepath = "D:\\Java projects\\file read.txt";
        File objFile = new File(filepath);
        String text = null;
        try{
            //create a file reader object
            FileReader reader = new FileReader(objFile);
            BufferedReader read = new BufferedReader(reader);
            //read text from the
            text = read.readLine();
            while (text != null){
                System.out.println(text);
                text = read.readLine();
            }
        }catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }
}
