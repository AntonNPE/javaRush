package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String q = reader.readLine();
        String w = reader.readLine();
        int n = Integer.parseInt(q);
        int m = Integer.parseInt(w);
        for (int i = 0; i < n; i++){
            String r = reader.readLine();
            list.add(r);

        }
        int k = 0;
        for (int i = 0; k<m; i++){

            list.add(list.get(i));
            list.remove(i);
            i--;
            k++;

        }

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));

    }

    }
}
