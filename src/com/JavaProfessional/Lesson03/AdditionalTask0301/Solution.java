package com.JavaProfessional.Lesson03.AdditionalTask0301;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/JavaProfessional/Lesson03/AdditionalTask0301/info.txt");
        PrintFile(file);
    }

    public static void PrintFile (File file) throws IOException {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}
