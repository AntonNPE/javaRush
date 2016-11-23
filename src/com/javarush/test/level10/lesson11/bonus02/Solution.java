package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        Map<String, Integer> map = new HashMap<>();
        int id;
        while (true)
        {
             String st = reader.readLine();
             if (st.isEmpty()) break;
             id = Integer.parseInt(st);
             name = reader.readLine();
            map.put(name,id);
        }
        Iterator  iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) iterator.next();
            System.out.println(entry.getValue() +" "+ entry.getKey());
        }

    }
}
