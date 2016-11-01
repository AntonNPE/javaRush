package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)    {

    }

    public static class Human    {

        String name;
        int age;
        String nationality;
        String proffession;
        boolean sex;
        String favoriteColor;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String nationality)
        {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
        }

        public Human(String name, int age, String nationality, String proffession)
        {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
            this.proffession = proffession;
        }

        public Human(String name, int age, String nationality, String proffession, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
            this.proffession = proffession;
            this.sex = sex;
        }

        public Human(String name, int age, String nationality, String proffession, boolean sex, String favoriteColor)
        {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
            this.proffession = proffession;
            this.sex = sex;
            this.favoriteColor = favoriteColor;
        }

        public Human(String favoriteColor, boolean sex)
        {
            this.favoriteColor = favoriteColor;
            this.sex = sex;
        }

        public Human(String favoriteColor, boolean sex, String proffession)
        {
            this.favoriteColor = favoriteColor;
            this.sex = sex;
            this.proffession = proffession;
        }

        public Human(int age, String nationality, String proffession)
        {
            this.age = age;
            this.nationality = nationality;
            this.proffession = proffession;
        }

        public Human(String favoriteColor, boolean sex, String proffession, String nationality)
        {
            this.favoriteColor = favoriteColor;
            this.sex = sex;
            this.proffession = proffession;
            this.nationality = nationality;
        }

    }
}
