package main;

import book.*;
import person.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new HarryPotter());
        books.add(new Hobbit());
        books.add(new Sonea());
        books.add(new Pipi());
        books.add(new BearsAdventures());
        books.add(new Missing());
        books.add(new Clue());
        books.add(new Investigation());


        List<Person> persons = new ArrayList<>();
        persons.add(new GeekMan());
        persons.add(new SerialKillerMan());
        persons.add(new LittleBoy());
        persons.add(new LittleGirl());
        persons.add(new BusinessWoman());
        persons.add(new WriterWoman());

        Main main = new Main();
        main.printAllBook(books);
        System.out.println("=======================================");
        main.printAllPeople(persons);
        System.out.println("=======================================");
        main.whatPeopleLikeReadandEat(persons);
        System.out.println("=======================================");
        persons.get(0).setName("Warwick");
        main.whatPeopleLikeReadandEat(persons);


    }

    private void whatPeopleLikeReadandEat(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).getName()
                    + " likes read: " + persons.get(i).likesToRead()
                    + " and likes eat: " + persons.get(i).likeToEat());
        }
    }

    public void printAllBook(List<Book> books){

        for (int i = 0; i < books.size(); i++) {
            System.out.println("Title: " + books.get(i).getTitle()
                    + ", number of pages: "+ books.get(i).getNumberOfPages() );
        }
    }
    public void printAllPeople(List<Person> persons){

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).thisIs());
        }
    }
}
