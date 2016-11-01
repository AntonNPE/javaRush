package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        boolean q = false;
        int sum = 0;
        while (!q){
            String sAge = bufferedReader.readLine();
            int w = Integer.parseInt(sAge);
            if (w==-1) {
                q = true;
            }
            sum = sum+w;

        }
        System.out.println(sum);
    }

}
