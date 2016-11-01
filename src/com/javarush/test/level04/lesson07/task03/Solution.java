package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        int q = Integer.parseInt(name);
        int w = Integer.parseInt(name1);
        int e = Integer.parseInt(name2);
        int i = 0;
        if(q>0)
            i++;
        if (w>0) i++;
        if (e>0) i++;
        System.out.println(i);

    }
}
