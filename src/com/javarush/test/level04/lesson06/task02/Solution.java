package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String qAge = bufferedReader.readLine();
        int q = Integer.parseInt(sAge);
        int w = Integer.parseInt(pAge);
        int e = Integer.parseInt(lAge);
        int r = Integer.parseInt(qAge);
        if (q>w & q>e& q>r) System.out.println(q);
        else if (w>q & w>e& w>r) System.out.println(w);
        else if (e>q & e>w & e>r) System.out.println(e);
        else if (r>q & r>w & r>e) System.out.println(r);

    }
}
