package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<>();
        ArrayList<String> hitrec = new ArrayList<>();
        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();



            addresses.put(city,family);

            if(city.isEmpty()) break;
            else hitrec.add(city);

        }

        //read home number
        String yo = reader.readLine();
        Iterator <Map.Entry<String,String>> iterator = addresses.entrySet().iterator();
        if (hitrec.contains(yo))
        {
            while(iterator.hasNext()){

                Map.Entry<String, String> pair = iterator.next();
                if (yo.equals(pair.getKey())) System.out.println(pair.getValue());
            }

        }
    }
}
