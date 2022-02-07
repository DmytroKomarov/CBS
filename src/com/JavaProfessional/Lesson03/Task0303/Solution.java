package com.JavaProfessional.Lesson03.Task0303;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<String> info = new ArrayList();
        String text = new String("Необходимо создать строку с текстом (текст взять любой из интернета). Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.");
        File file = new File("src/com/JavaProfessional/Lesson03/Task0303/temp.txt");

        //Разбить эту строку на 2 подстроки равной длине
        int lineNum = 2;
        for (int i = 0; i < lineNum; i++) {
            info.add(text.substring(i*text.length()/lineNum,i*text.length()/lineNum+text.length()/lineNum));
        }

        //вывести на экран каждое предложения с новой строки
        WriteInfo(file,info);
        try (InputStream inputStream = new FileInputStream(file);
             InputStreamReader reader = new InputStreamReader(inputStream)) {
            boolean newLine = false;
            for (int i = reader.read(); i!=-1; i = reader.read()) {
                if ((char)i=='.') {
                    System.out.print((char) i + "\n");
                    newLine = true;
                } else if (newLine == true) {
                    newLine = false;
                    if ((char)i!=' ') {
                        System.out.print((char) i);
                    }
                } else {
                    System.out.print((char) i);
                }
            }
        }

        //Более оптимально замену выполнить регуляркой
        System.out.println();
        System.out.println(text.replaceAll("(\\. )|\\.","\\.\n"));

    }
    public static void WriteInfo (File file, ArrayList<String> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String temp : list) {
                bufferedWriter.write(temp);
            }
        }
    }
}
