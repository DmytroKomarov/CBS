package com.JavaProfessional.Lesson02.Task0202;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        ArrayList<String> wordsDouble = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String newWord = scanner.nextLine();
            words.add(newWord);
        }

        wordsDouble = doubleValues(words);

        for (int i = 0; i < wordsDouble.size(); i++) {
            System.out.println(wordsDouble.get(i));
        }
    }

    public static ArrayList doubleValues(ArrayList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            iterator.add(iterator.next());
        }
        return list;
    }
}
