package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String zAge = bufferedReader.readLine();
        String aAge = bufferedReader.readLine();
        String mAge = bufferedReader.readLine();


        int y = Integer.parseInt(zAge);
        int m = Integer.parseInt(aAge);
        int d = Integer.parseInt(mAge);


        if (d > 0 & d <= 31 & m > 0 & m <= 12 & y > 0)
        {
            System.out.println("Меня зовут " + name);
            System.out.println("Я родился " + d + "." + m + "." + y);

        }
    }
}