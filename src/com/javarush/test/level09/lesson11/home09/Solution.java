package com.javarush.test.level09.lesson11.home09;

import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String,Cat> map = new HashMap<>();
        Cat cat = new Cat("catqweqwe");
        Cat cat1 = new Cat("cat1qweqwe");
        Cat cat2 = new Cat("cat2qweqwe");
        Cat cat3 = new Cat("cat3qweqwe");
        Cat cat4 = new Cat("catqqwwqeqwe");
        Cat cat5 = new Cat("cat5qweweqeqwe");
        Cat cat6 = new Cat("cat6qweweqwe");
        Cat cat7 = new Cat("cat7qweqeqqwe");
        Cat cat8 = new Cat("cat8qweqwqweqe");
        Cat cat9 = new Cat("cat9qweq88weqwe");

        map.put(cat.name,cat);
        map.put(cat1.name,cat1);
        map.put(cat2.name,cat2);
        map.put(cat3.name,cat3);
        map.put(cat4.name,cat4);
        map.put(cat5.name,cat5);
        map.put(cat6.name,cat6);
        map.put(cat7.name,cat7);
        map.put(cat8.name,cat8);
        map.put(cat9.name,cat9);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Map.Entry<String, Cat>> lol = map.entrySet();


        return null;

    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
