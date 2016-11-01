package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String t = bufferedReader.readLine();
        String y = bufferedReader.readLine();
        int m = Integer.parseInt(t);
        int n = Integer.parseInt(y);
        int e,r;

        for (r=0;r<m;r++){
            for (e=0;e<n;e++){
                System.out.print("8");

            }
            System.out.println();
        }
    }
}
