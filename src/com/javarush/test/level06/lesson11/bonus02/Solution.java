package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandyName = reader.readLine();
        Cat catGrandy = new Cat(grandyName);

        String grannyName = reader.readLine();
        Cat catGranny = new Cat(grannyName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName,null,catGrandy);

        String momName = reader.readLine();
        Cat catMom = new Cat(momName,catGranny,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMom, catDad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMom, catDad);

        System.out.println(catGrandy.toString());
        System.out.println(catGranny.toString());
        System.out.println(catDad.toString());
        System.out.println(catMom.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());

    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;
        Cat(String name)
        {
            this.name = name;
        }


        Cat(String name, Cat mother, Cat father  )
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            if (father == null & mother == null & name.equals("Вася"))
                return "Cat name is дедушка " + name + ", no mother" + ", no father ";
            else if (father == null & mother == null & name.equals("Мурка"))
                return "Cat name is бабушка " + name + ", no mother" + ", no father ";
            else if (mother == null)
                return "Cat name is папа " + name + ", no mother, father is дедушка " + father.name;
            else if (father == null)
                return "Cat name is мама " + name + ", mother is бабушка " + mother.name+ ", no father";
            else if (name.equals("Мурчик"))
                return "Cat name is сын  " + name + ", mother is мама " + mother.name+ ", father is папа " + father.name;

            return "Cat name is дочь " + name + ", mother is мама " + mother.name+ ", father is папа " + father.name;

        }
    }

}
