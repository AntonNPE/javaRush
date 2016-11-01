package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] listBig = new int [20];
        int [] listSmall1 = new int [10];
        int [] listSmall2 = new int [10];

        for (int i = 0; i < listBig.length; i++){
            String q = reader.readLine();
            listBig[i] = Integer.parseInt(q);
        }
        for (int i = 0; i < 10; i ++){
            listSmall1[i] = listBig[i];
        }
        for ( int i = 10; i < listBig.length; i++ ){
            listSmall2[i-10] = listBig[i];
        }
        for (int i = 0; i < listSmall2.length; i++){
            System.out.println(listSmall2[i]);
        }
    }
}
