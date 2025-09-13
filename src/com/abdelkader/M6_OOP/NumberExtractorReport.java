package com.abdelkader.M6_OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport {

    // Regex pattern to capture numbers (integers or decimals)
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+(\\.\\d+)?");


    public String parse(String filePath) throws FileNotFoundException {
        String numbers = "";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Skip header line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }else {
                System.out.println("Empty File");
            }

            // Process each line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = NUMBER_PATTERN.matcher(line);

                boolean matches = matcher.matches();
                if (matches){
                    numbers += line + '\n';
                }
            }
        }

        return numbers;
    }
}
