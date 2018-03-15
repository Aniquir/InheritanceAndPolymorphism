package person;

import book.Book;

import java.util.List;
import java.util.Random;

public class SerialKillerMan extends Man {

    String name = "Al";

    @Override
    public String likesToRead() {
        return "adventure and criminal books";
    }

    @Override
    public String likeToEat() {
        return "potatoes";
    }

    @Override
    public String thisIs() {
        return super.thisIs() + "serial killer.";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void read(Person person, List<Book> books) {
        int[] numberOfBook = {3, 4, 5, 6, 7};
        Random r = new Random();
        int boundOfBooksNumber = 5;
        int randomNumberOfBooksList = r.nextInt(boundOfBooksNumber);

        System.out.println(person.thisIs() + " Now reads: "
                + books.get(numberOfBook[randomNumberOfBooksList]).toString()
                + " (" + books.get(numberOfBook[randomNumberOfBooksList]).getNumberOfPages() + " pages)");
    }
}
