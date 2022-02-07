package com.JavaProfessional.Lesson04.Task0402;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import static java.util.Spliterators.iterator;

public class Solution {
    //Задание 2
    //Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».
    public static void main(String[] args) throws IOException {
        String prepositions = new String();
        ArrayList<String> textSource = new ArrayList<>();
        ArrayList<String> textTarget = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();
        File fileSource = new File("src/com/JavaProfessional/Lesson04/Task0402/source.txt");
        File fileTarget = new File("src/com/JavaProfessional/Lesson04/Task0402/target.txt");
        File filePrepositions = new File("src/com/JavaProfessional/Lesson04/Task0402/prepositions.txt");

        prepositions = listToString(ReadInfo(filePrepositions));
        textSource = ReadInfo(fileSource);

        for (String temp:textSource) {
            textTarget.add(temp.replaceAll("(?<!\\S)"+prepositions+"(?!\\S)", "java")+"\n");
        }

        WriteInfo(fileTarget,textTarget);

        text = ReadInfo(fileTarget);

        for (String temp:text) {
            System.out.println(temp);;
        }

    }


    public static ArrayList ReadInfo (File file) throws IOException {
        ArrayList<String> list = new ArrayList();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            while (bufferedReader.ready()) {
                list.add(bufferedReader.readLine());
            }
        }
        return list;
    }

    public static void WriteInfo (File file, ArrayList<String> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String temp : list) {
                bufferedWriter.write(temp);
            }
        }
    }

    public static String listToString(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i!=list.size()-1)
                sb.append("|");
        }
        return sb.append(')').toString();

    }
}
