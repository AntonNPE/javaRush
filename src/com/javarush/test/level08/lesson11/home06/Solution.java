package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.io.IOException;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> childrens = new ArrayList<>();
        ArrayList<Human> oldChildren = new ArrayList<>();
        ArrayList<Human> oldChildren1 = new ArrayList<>();
        ArrayList<Human> family = new ArrayList<>();
        Human kid = new Human("kid",true,13);
        Human kid1 = new Human("kid1",false,10);
        Human kid2 = new Human("kid2",true,3);
        childrens.add(kid);
        childrens.add(kid1);
        childrens.add(kid2);
        Human father = new Human ("father",true,44,childrens);
        Human mother = new Human("ma",false,33,childrens);
        oldChildren.add(father);
        oldChildren1.add(mother);
        Human grandpa = new Human("grandpaDad",true,88,oldChildren);
        Human grandpa2 = new Human("grandpaDad2",true,77,oldChildren1);
        Human grandma = new Human("grandpaMa",false,66,oldChildren);
        Human grandma2 = new Human("grandpaMa",false,55,oldChildren1);
        family.add(grandma);
        family.add(grandma2);
        family.add(grandpa);
        family.add(grandpa2);
        family.addAll(childrens);
        family.addAll(oldChildren);
        family.addAll(oldChildren1);
        for(Human intq : family){
            System.out.println(intq.toString());
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        Human (String name, boolean sex, int age, ArrayList<Human> child){

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = child;

        }
        Human (String name, boolean sex, int age){

            this.name = name;
            this.sex = sex;
            this.age = age;


        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
