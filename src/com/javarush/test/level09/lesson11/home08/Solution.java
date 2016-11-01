package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<>();
        int [] arr1 = new int[5];
        int [] arr2 = new int[2];
        int [] arr3 = new int[4];
        int [] arr4 = new int[7];
        int [] arr5 = new int[0];

        for (int i  = 0; i < 7; i ++){

            if (i<arr1.length){

                arr1[i] = i;
            }
            if (i<arr2.length){

                arr2[i] = i;
            }

            if (i<arr3.length){

                arr3[i] = i;
            }

            if (i<arr4.length){

                arr4[i] = i;
            }

            if (i<=arr5.length){

                arr1[i] = i;
            }


        }
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
