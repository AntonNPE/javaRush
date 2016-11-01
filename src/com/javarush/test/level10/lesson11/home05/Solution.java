package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < alphabet.size(); i++){
            resultMap.put(alphabet.get(i), 0);
        }
        for (int i = 0; i < list.size(); i++){

            String s = list.get(i);
            char[] charAr = s.toCharArray();
            for (int j = 0; j < charAr.length; j++)
            {
                if (alphabet.contains(charAr[j]))
                {
                    int z = resultMap.get(charAr[j]);
                    z++;
                    resultMap.put(charAr[j], z);
                }
            }
        }

        for (Map.Entry entry : resultMap.entrySet()){

            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        //напишите тут ваш код
    }

}
