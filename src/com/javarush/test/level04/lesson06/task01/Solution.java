package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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
        String pAge = bufferedReader.readLine();
        String lAge = bufferedReader.readLine();
        int a = Integer.parseInt(sAge);
        int b = Integer.parseInt(pAge);
        if (a<b) System.out.println(a);
        else System.out.println(b);

    }
}