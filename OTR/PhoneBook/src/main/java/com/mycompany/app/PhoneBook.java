package com.mycompany.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО. Например: Иванов И.И. ");
        String s1 = scanner.nextLine();
        if (map.containsKey(s1)) {
            ArrayList<String> numbers = map.get(s1);
            for (String number : numbers) {
                System.out.println(count + ". " + number);
                count++;
            }
        } else {
            System.out.println("Такого ФИО нет в PhoneBook");
        }
    }

    static HashMap<String, ArrayList<String>> map = new HashMap();

    static {
        map.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        map.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        map.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
    }
}
