package com.javarush.test.level09.lesson11.home04;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SortedMap;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        System.out.println( dateFormat.format( date ).toUpperCase() );

    }
}
