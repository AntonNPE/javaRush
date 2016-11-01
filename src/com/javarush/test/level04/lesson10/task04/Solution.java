package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
int q =0;
        int w = 0;
        while (q<10){

            q++;
            while (w<10){
                System.out.print ("S");
                w++;
        }
            System.out.println();
            w=0;
        }

    }
}
