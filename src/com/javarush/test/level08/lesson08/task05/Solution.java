package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String > map = new HashMap<>();
        map.put("Ivanov","Ivan");
        map.put("Petrov","Maksim");
        map.put("Sidorov","Kirill");
        map.put("Molodoi","Evgen");
        map.put("Starui","Ivan");
        map.put("Lusui","Evgen");
        map.put("Ytkin","Olga");
        map.put("Gysev","Stas");
        map.put("Vorob'ev","Ivan");
        map.put("Saranchov","Olga");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for(Map.Entry<String, String>pair:copy.entrySet())
        {
            String value = pair.getValue();
            removeItemFromMapByValue(map, value);
            value = null;
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        String key =null;
        int count = 0;

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value)&& count==0)
            {
                count++;
                key = pair.getKey();
            }
        else if (pair.getValue().equals(value)&& count>0){
                map.remove(key);
                map.remove(pair.getKey());

        }

        }
    }
}
