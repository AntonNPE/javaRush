package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int c = Integer.parseInt(lAge);
        if (a>b & a>c) {
            if (b>c) System.out.println(a + " " + b +" " + c);
            else System.out.println(a + " " + c +" " + b);
        }
         if (b>a & b>c) {
             if (a>c)  System.out.println(b + " " + a + " " + c);
             else System.out.println(b + " " + c +" " + a);}

         if (c>b & c>a) {
        if (b>a)    System.out.println(c + " " + b + " " + a);
            else System.out.println(c + " " + a +" " + b);}


    }
}
