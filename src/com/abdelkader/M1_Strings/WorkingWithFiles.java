package com.abdelkader.M1_Strings;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFiles {

    public static void main(String[] args) {
        File file = createFile("src/abdelkader.txt");
        writeToFile(file , true);

    }


    private static File createFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            return  file;
        } catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException();
        }
    }


    private static void writeToFile(File file , boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file , append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello ");
            writer.println("World ");

            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    private static void readFile(File file){
        try {
            // bufferReader with fileReader
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                scanner.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
