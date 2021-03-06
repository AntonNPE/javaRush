package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        HashMap <String, Integer> year = new HashMap<>();
        year.put("January", 1);
        year.put("February", 2);
        year.put("March", 3);
        year.put("April", 4);
        year.put("May", 5);
        year.put("June", 6);
        year.put("July", 7);
        year.put("August", 8);
        year.put("September", 9);
        year.put("October", 10);
        year.put("November", 11);
        year.put("December", 12);
        String q  = reader.readLine();
        Iterator<Map.Entry<String, Integer>> iterator = year.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(q)){
                System.out.println(key + " is " + value + " month");
            }
        }
    }
}
