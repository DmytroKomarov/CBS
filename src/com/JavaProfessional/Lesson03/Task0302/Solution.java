package com.JavaProfessional.Lesson03.Task0302;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//        Задание 2
//        Создайте файл, запишите в него произвольные данные и закройте файл.
//        Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> info = new ArrayList();
        ArrayList<String> infoRead = new ArrayList();
        info.add("Какой либо текст\n");
        info.add("совершенно без содержания\n");
        info.add("просто спонтанный текст\n");

        File file = new File("src/com/JavaProfessional/Lesson03/Task0302/info.txt");

        WriteInfo(file,info);

        infoRead = ReadInfo(file);

        for (String temp:infoRead) {
            System.out.println(temp);
        }

    }
    public static void WriteInfo (File file, ArrayList<String> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String temp : list) {
                bufferedWriter.write(temp);
            }
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
}
