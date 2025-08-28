package com.abdelkader.M5_Files;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;

public class WorkingWithFiles {

    public static void main(String[] args) {
        File file = createFile("src/data.txt");
        writeInFile(file,"Hello, Java try-with-resources!" ,true);
        readFile(file);
    }


    public static File createFile(String path){
        try {
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            return file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException();
        }
    }

    public static void readFile(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeInFile(File file , String text , Boolean append){
        try {
            FileWriter writer = new FileWriter(file , append);
            writer.write(text);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
