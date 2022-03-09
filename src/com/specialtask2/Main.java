package com.specialtask2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /* 1. Три класса
    По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
    Подумай, что должен возвращать метод toString в классах Cat и Dog?
    В методе main создай по два объекта каждого класса и выведи их на экран.
    Объекты класса Duck уже созданы и выводятся на экран. */

    public static class Duck {
        String name;
        int age, weight;

        public void setDuckInfo (String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String toString()
        {
            return ("Имя утки: " + name + "\nЕго возраст: " + age + "\nЕго вес: " + weight);
        }
    }

    public static class Cat {
        String name;
        int age, weight;

        public void setCatInfo(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String toString()
        {
            return ("Имя кота: " + name + "\nЕго возраст: " + age + "\nЕго вес: " + weight);
        }
    }

    public static class Dog {
        String name;
        int age, weight;

        public void setDogInfo (String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String toString()
        {
            return ("Имя собаки: " + name + "\nЕго возраст: " + age + "\nЕго вес: " + weight);
        }
    }

    /* 2. Man and Woman
    1) Внутри класса Solution создай public static классы Man и Woman.
    2) У классов должны быть поля: name(String), age(int), address(String).
    3) Создай конструкторы, в которые передаются все возможные параметры.
    4) Создай по два объекта каждого класса со всеми данными, используя конструктор.
    5) Объекты выведи на экран в таком формате [name + " " + age + " " + address]. */

    public class Solution {
        public static class Man {
            String name, address;
            int age;

            public Man (String name) {
                this.name = name;
            }

            public Man (String name, String address) {
                this.name = name;
                this.address = address;
            }

            public Man (String name, String address, int age) {
                this.name = name;
                this.address = address;
                this.age = age;
            }

            public Man (String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getManInfo() {
                return ("Имя мужчины: " + name + "\nВозраст мужчины: " + age + "\nАдрес мужчины: " + address);
            }
        }

        public static class Woman {
            String name, address;
            int age;

            public Woman (String name) {
                this.name = name;
            }

            public Woman (String name, String address) {
                this.name = name;
                this.address = address;
            }

            public Woman (String name, String address, int age) {
                this.name = name;
                this.address = address;
                this.age = age;
            }

            public Woman (String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getWomanInfo() {
                return ("Имя женщины: " + name + "\nВозраст женщины: " + age + "\nАдрес женщины: " + address);
            }
        }
    }

    /* 3. Создай public static классы Dog, Cat.

    Добавь по три поля в каждый класс, на твой выбор.
    Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.

    Пример:
    Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см), 5 (длина хвоста, см)) */

    public class Drawings {
        public static class Drawed_Cat {
            String name;
            int age, weight, tail_length, height;

            public Drawed_Cat(String name, int age, int weight, int tail_length, int height) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.tail_length = tail_length;
                this.height = height;
            }

            public String toString()
            {
                return ("Имя кота: " + name + "\nЕго возраст: " + age + "\nЕго вес: " + weight + "\nДлина его хвоста: " + tail_length + "\nЕго рост: " + height);
            }
        }

        public static class Drawed_Dog {
            String name;
            int age, weight, tail_length, height;

            public Drawed_Dog(String name, int age, int weight, int tail_length, int height) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.tail_length = tail_length;
                this.height = height;
            }

            public String toString()
            {
                return ("Имя пса: " + name + "\nЕго возраст: " + age + "\nЕго вес: " + weight + "\nДлина его хвоста: " + tail_length + "\nЕго рост: " + height);
            }
        }

        public static class Drawed_Mouse {
            String name;
            int age, weight, tail_length, height;

            public Drawed_Mouse(String name, int age, int weight, int tail_length, int height) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.tail_length = tail_length;
                this.height = height;
            }

            public String toString()
            {
                return ("Имя мышки: " + name + "\nЕё возраст: " + age + "\nЕё вес: " + weight + "\nДлина её хвоста: " + tail_length + "\nЕё рост: " + height);
            }
        }
    }

    /* 4. Вывести на экран сегодняшнюю дату
    Вывести на экран текущую дату в аналогичном виде «21 06 2015». */

    public static class Date {
        int day, month, year;
        String s;

        public void setDate (int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            s = "Сегодняшнее число: ";
            if (day < 10)
                s = s + "0" + day;
            else s = s + day;
            s = s + " ";
            if (month < 10)
                s = s + "0" + month;
            else s = s + month;
            s = s + " " + year;
            return (s);
        }
    }

    public static void main(String[] args) {

        // Вывод, Задание №1

        System.out.println();
        Duck duck1 = new Duck();
        duck1.setDuckInfo("Pasha", 6, 3);
        System.out.println(duck1.toString());

        System.out.println();
        Duck duck2 = new Duck();
        duck2.setDuckInfo("Dima", 7, 4);
        System.out.println(duck2.toString());

        System.out.println();
        Cat cat1 = new Cat();
        cat1.setCatInfo("Pushok", 6, 4);
        System.out.println(cat1.toString());

        System.out.println();
        Cat cat2 = new Cat();
        cat2.setCatInfo("Snejok", 8, 5);
        System.out.println(cat2.toString());

        System.out.println();
        Dog dog1 = new Dog();
        dog1.setDogInfo("Rex", 6, 5);
        System.out.println(dog1.toString());

        System.out.println();
        Dog dog2 = new Dog();
        dog2.setDogInfo("Yan", 7, 3);
        System.out.println(dog2.toString());
        System.out.println();

        // Вывод, Задание №2

        Solution.Man man = new Solution.Man("Стас", "Улица Пушкина, дом Колотушкина", 27);
        System.out.println(man.getManInfo());
        System.out.println();

        Solution.Woman woman = new Solution.Woman("Вика", "Улица Коробейника, дом Мельника", 26);
        System.out.println(woman.getWomanInfo());
        System.out.println();

        // Вывод, Задание №3

        Drawings.Drawed_Cat cat = new Drawings.Drawed_Cat("Tom", 5, 4, 35, 50);
        System.out.println(cat.toString());
        System.out.println();

        Drawings.Drawed_Dog dog = new Drawings.Drawed_Dog("Spike", 7, 8, 25, 60);
        System.out.println(dog.toString());
        System.out.println();

        Drawings.Drawed_Mouse mouse1 = new Drawings.Drawed_Mouse("Jerry", 6, 1, 5, 10);
        System.out.println(mouse1.toString());
        System.out.println();

        Drawings.Drawed_Mouse mouse2 = new Drawings.Drawed_Mouse("Nibbls", 2, 1, 3, 6);
        System.out.println(mouse2.toString());
        System.out.println();

        // Вывод, Задание №4

        Date date = new Date();
        date.setDate(9, 3, 2022);
        System.out.println(date.toString());
        System.out.println();

        /* 5. Вводить с клавиатуры числа и считать их сумму.
        Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
        Вывести на экран полученную сумму. */

        int sum = 0, a;
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.println("Сейчас ты сможешь слагать сумму хоть до посинения." +
                "\nВводи числа, которые хочешь суммировать вместе" +
                "\nЯ остановлюсь, если ты скажешь \"сумма\"");

        do {
            System.out.print("Введи новое число: ");
            s = scan.nextLine();
            try {
                if (s != "сумма") {
                    a = Integer.parseInt(s.trim());
                    sum = sum + a;
                    s = null;
                }
            } catch (NumberFormatException nfe) {
                break;
            }
        } while (s != "сумма");

        System.out.println("Сумма введенных тобой чисел: " + sum);
        System.out.println();

        // Задания повышенной сложности:
        /* 1. Нужно исправить программу, чтобы компилировалась и работала.
        Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран. */

        int b;
        System.out.println("Введи два числа, чтобы узнать их сумму.");
        System.out.print("Введи первое число: ");
        a = scan.nextInt();
        System.out.print("Введи второе число: ");
        b = scan.nextInt();
        sum = a + b;
        System.out.println("Их сумма: " + sum);

        /* 2. Нужно добавить в программу новую функциональность.
        Старая Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
        Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран. */

        int min;
        System.out.println("Введи числа a и b, чтобы узнать минимальное из них.");
        System.out.print("Введи число a: ");
        a = scan.nextInt();
        System.out.print("Введи число b: ");
        b = scan.nextInt();
        if (a < b) {
            s = "a";
            min = a;
        } else {
            s = "b";
            min = b;
        }
        min = 0;
        System.out.println("Минимальное число - " + s + ": " + min);

        int c,d,e;
        System.out.println("Повышаем ставки!\nТеперь введи числа a,b,c,d и e, чтобы узнать минимальное из них.");
        System.out.print("Введи число a: ");
        a = scan.nextInt();
        System.out.print("Введи число b: ");
        b = scan.nextInt();
        System.out.print("Введи число c: ");
        c = scan.nextInt();
        System.out.print("Введи число d: ");
        d = scan.nextInt();
        System.out.print("Введи число e: ");
        e = scan.nextInt();

        if (a < b) {
            s = "a";
            min = a;
        } else {
            s = "b";
            min = b;
        }
        if (c < min) {
            s = "c";
            min = c;
        }
        if (d < min) {
            s = "d";
            min = d;
        }
        if (e < min) {
            s = "e";
            min = e;
        }
        System.out.println("Минимальное число - " + s + ": " + min);
        System.out.println();

        /* 3. Задача по алгоритмам.
        Задача: Написать программу, которая:
        1) вводит с консоли число N > 0
        2) потом вводит N чисел с консоли
        3) выводит на экран максимальное из введенных N чисел. */

        int n, max = 0;
        s = null;
        System.out.println("Ну и напоследок попробуем поработать с массивами данных, давай?");
        System.out.print("Размер нашего массива: ");
        n = scan.nextInt();
        ArrayList <Integer> array = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Введи новое значение массива: ");
            a = scan.nextInt();
            array.add(a);
            if (a < max) {
                s = null;
                max = a;
                s = s + i;
            }
        }

        System.out.print("Наш массив:");
        for (Integer abc: array) {
            System.out.print(abc + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение массива под индексом " + s + ": " + max);
    }
}