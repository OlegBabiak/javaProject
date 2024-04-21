package lesson3HW;

import lesson3HW.task1.Book;
import lesson3HW.task1.Magazine;
import lesson3HW.task1.Printable;
import lesson3HW.task2.Drum;
import lesson3HW.task2.Guitar;
import lesson3HW.task2.Instrument;
import lesson3HW.task2.Trumpet;

import java.util.Arrays;

public class MainHW3 {
    public static void main(String[] args) {

        //task1
        //а) Оприділити інтерфейс Printable, який містить метод void print().
        //б) Оприділити клас Book, що реалізує інтерфейс Printable.
        //в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
        //г) Створити масив типу Printable, який буде містити книги та журнали.


        Book book1 = new Book("book1");
        book1.print();
        Book book2 = new Book("book2");
        book2.print();
        Book book3 = new Book("book3");
        book3.print();
        Magazine magazine1 = new Magazine();
        magazine1.setMagazineName("magazine1");
        magazine1.print();
        Magazine magazine2 = new Magazine();
        magazine2.setMagazineName("magazine2");
        magazine2.print();
        Magazine magazine3 = new Magazine();
        magazine3.setMagazineName("magazine3");
        magazine3.print();

        Printable[] printable = {book1, book2, book3, magazine1, magazine2, magazine3};
        System.out.println(Arrays.toString(printable));
        printable[2].print();
        printable[3].print();

        //task2
        //Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан" та "Труба".
        //Інтерфейс Instrument  містить метод play().
        //Клас "Гітара" містить змінну класу "кількістьСтрун",
        //клас "Барабан" - розмір, а клас "Труба" - діаметр.
        //Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
        //У циклі викликати метод play() для кожного інструменту,
        //який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".

        Instrument [] instruments = {new Drum(),new Trumpet(),new Guitar()};

        for (Instrument instrument : instruments) {
            instrument.play();
        }






















    }
}
