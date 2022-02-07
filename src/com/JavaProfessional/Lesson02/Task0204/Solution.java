package com.JavaProfessional.Lesson02.Task0204;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashMap<String,String> familyList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Последовательно введите название города, затем фамилию (3 пыры):");
        for (int i = 0; i < 3; i++) {
            String city = new String(scanner.nextLine());
            String family = new String(scanner.nextLine());
            familyList.put(city,family);
        }

        System.out.println("Введите название города:");
        String city = new String(scanner.nextLine());
        System.out.println(familyList.get(city)!= null ? familyList.get(city) : "Такой город отсутствует.");

    }

}
