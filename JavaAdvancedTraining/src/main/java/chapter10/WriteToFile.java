package chapter10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Kabelo Tlhape\\OneDrive - iLAB, LLC\\Desktop\\file write.txt";
        File objFile = new File(filepath);

        try{
            objFile.createNewFile();
            //write to a file
            PrintStream pen = new PrintStream(objFile);//opens the file for writing
            pen.println("Today");
            pen.println("is");
            pen.println("Thursday");
            System.out.println("File created");
            pen.close();//close the print stream
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
