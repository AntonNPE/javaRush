package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> grammar = new HashMap<>();
        grammar.put("Evra","Patrice");
        grammar.put("Ferdinand","Rio");
        grammar.put("Vidic","Nemanja");
        grammar.put("daSilva","Rafael");
        grammar.put("Giggs","Ryan");
        grammar.put("Scholes","Paul");
        grammar.put("Fletcher","Daren");
        grammar.put("Ronaldo","Cristiano");
        grammar.put("Berbatov","Dimitar");
        grammar.put("Rooney","Wayne");

        return grammar;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){

            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name)){
                i++;
            }

        }

        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){

            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(lastName)){
                i++;
            }

        }
        return i;
    }
}
