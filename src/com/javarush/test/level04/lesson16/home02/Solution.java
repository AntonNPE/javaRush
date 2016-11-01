package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.lang.*;
/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String mAge = bufferedReader.readLine();
        String nAge = bufferedReader.readLine();
        int q = Integer.parseInt(sAge);
        int w = Integer.parseInt(mAge);
        int e = Integer.parseInt(nAge);
        if (q>w & w>e) System.out.println(w);
        else if (w>q & q>e) System.out.println(q);
        else if (e>q & q>w) System.out.println(q);
        else if (q>e & e>w) System.out.println(e);
        else if (w>e & e>q) System.out.println(e);
        else if (e>w & w>q) System.out.println(w);
    }


}

