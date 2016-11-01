package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet <String> set = new HashSet<>();
        {
            set.add("Ложь");
            set.add("Лож2ь");
            set.add("Л3ожь");
            set.add("Лож4ь");
            set.add("Лож5ь");
            set.add("Ло6жь");
            set.add("Ло7жь");
            set.add("Ло8жь");
            set.add("Ло9жь");
            set.add("Ло0жь");
            set.add("Л123ожь");
            set.add("Лож1а23ь");
            set.add("Ло234ажь");
            set.add("Ло1а23а1жь");
            set.add("Л635ожь");
            set.add("Ло567екн5жь");
            set.add("Ложкенгнеь");
            set.add("Лоеншенгшеногжь");
            set.add("Лоероепопжь");
            set.add("Лопр456746457роржь");


        }
        return  set;
    }
}
