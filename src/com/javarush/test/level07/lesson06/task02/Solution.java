package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
       // ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i<5; i++ ){
           String s = reader.readLine();
            list.add(s);
        }



        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length()>max)
                max = list.get(i).length();

        }

        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).length()==max){
                System.out.println(list.get(i));
            }
        }


        /*for (int i  = 0 ; i < list.size(); i++){

            int s = list.get(i).length();

            if (s==max.length()){
            max = list.get(i);
             list2.add(list.get(i)); }

            if (s>max.length()){
            max = list.get(i);
            for (int w = 0; w < list2.size(); w++){
                list2.remove(w);
            }
                list2.add(list.get(i));
            }
        }

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }*/
    }
}
