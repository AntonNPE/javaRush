package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        String name1 = bufferedReader.readLine();

        int q = Integer.parseInt(sAge);
        int w = Integer.parseInt(name);
        int e = Integer.parseInt(name1);
        if (q==w & q!=e) System.out.println("3");
        else if (q==e & q!=w) System.out.println("2");
        else if (e==w & e!=q) System.out.println("1");

    }
}
