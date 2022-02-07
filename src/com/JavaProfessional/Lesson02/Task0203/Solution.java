package com.JavaProfessional.Lesson02.Task0203;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        number = getIntegerList(scanner.nextInt());
        System.out.println(getMinimum(number));

    }

    public static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        return Collections.min(list);
    }
}


