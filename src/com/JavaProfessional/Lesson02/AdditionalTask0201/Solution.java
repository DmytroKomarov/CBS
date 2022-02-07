package com.JavaProfessional.Lesson02.AdditionalTask0201;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list = getList();
        printList(list);
    }

    public static ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String tempScanner = scanner.nextLine();
            if (tempScanner.equals("end")) {
                break;
            }
            list.add(tempScanner);
        }
        return list;
    }

    public static void printList(ArrayList<String> list) {
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}


