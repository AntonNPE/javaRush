package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String q = "мама";
        String w = "мыла";
        String e = "раму";
        String r = "именно";
        ArrayList<String> list = new ArrayList<>();
        list.add(q);
        list.add(w);
        list.add(e);
        list.add(1,r);
        list.add(3,r);
        list.add(5,r);
        for (String x : list){

            System.out.println(x);

        }
    }
}
