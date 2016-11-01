package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFa1 = new Human("Совелий",true,79,null,null);
        Human grandFa2 = new Human("Пафнутий",true,78,null,null);
        Human grandMa1 = new Human("Марьяна",false,77,null,null);
        Human grandMa2 = new Human("Зинаида",false,76,null,null);
        Human father = new Human("Олег",true,41,grandFa1,grandMa1);
        Human mother = new Human("Света",false,33,grandFa2,grandMa2);
        Human kid1 = new Human("Илья",true,13,father,mother);
        Human kid2 = new Human("Алёша",true,11,father,mother);
        Human kid3 = new Human("Добрыня",true,9,father,mother);

        System.out.println(grandFa1.toString());
        System.out.println(grandFa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

    Human(String name, boolean sex, int age, Human father, Human mother){

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;

    }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
