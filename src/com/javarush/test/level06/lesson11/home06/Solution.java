package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShineMetalAss b1 = new KissMyShineMetalAss();
        System.out.println(b1.toString());

    }

    public static class KissMyShineMetalAss
    {
        @Override
        public String toString()
        {
            return "b1{}";
        }
    }


}
