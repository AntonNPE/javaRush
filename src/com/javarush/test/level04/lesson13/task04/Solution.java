package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        for (int q=0; q<11; q++){

                for (int w = 0; w<10; w++){
                    {

                    if (q==0 || w ==0)   {
                        System.out.print("8");
                    }
                   }
                }
            System.out.println();
        }

    }
}
