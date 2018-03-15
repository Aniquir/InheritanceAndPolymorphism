package main;

import book.*;
import person.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Hobbit());
        books.add(new HarryPotter());
        books.add(new Sonea());
        books.add(new Pipi());
        books.add(new BearsAdventures());
        books.add(new Missing());
        books.add(new Investigation());
        books.add(new Clue());

        List<Person> persons = new ArrayList<>();
        persons.add(new GeekMan());
        persons.add(new SerialKillerMan());
        persons.add(new LittleBoy());
        persons.add(new LittleGirl());
        persons.add(new BusinessWoman());
        persons.add(new WriterWoman());

        Main main = new Main();
        main.printAllBook(books);

        printNiceLine();
        main.printAllPeople(persons);

        printNiceLine();
        main.whatPeopleLikeReadandEat(persons);

        printNiceLine();
        persons.get(0).setName("Warwick");
        main.whatPeopleLikeReadandEat(persons);

        printNiceLine();
        main.whatReadInThisMoment(persons, books);

    }


    private void whatReadInThisMoment(List<Person> persons, List<Book> books) {
        for (Person person : persons) {
            person.read(person, books);
            System.out.println("-------------------");
        }
    }

    private void whatPeopleLikeReadandEat(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.getName()
                    + " likes read: " + person.likesToRead()
                    + " and likes eat: " + person.likeToEat());
        }
    }

    private void printAllBook(List<Book> books) {

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle()
                    + ", number of pages: " + book.getNumberOfPages());
        }
    }

    private void printAllPeople(List<Person> persons) {

        for (Person person : persons) {
            person.thisIs();
        }
    }

    private static void printNiceLine() {
        System.out.println("============" +
                "=======================" +
                "=======================" +
                "=======================" +
                "=================");
    }
}
