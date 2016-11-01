package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
     int max = -1000000;
     int y;

        for (int i = 0; i < array.length; ){

            for (int w = i; w < array.length; w++){
            if (array[w]>max) max = array[w];
            if (array[w]==max){
                y = array[w];
                array[w] = array[i];
                array[i] = y;

                }

            }
            i++;
            max = -1000000;
        }

    }
}
