package person;

import book.Book;

public class Person {

    private String name;

    public void read(Person person, Book book){
        System.out.println("Person " + person.getName() + " read book entitled: " + book.getTitle());
        System.out.println(person.getName() + " read " + book.getNumberOfPages() + " pages of " + book.getTitle());
    }
    public String likesToRead(){
        return null;
    }
    public String likeToEat(){
        return null;
    }
    public String thisIs(){
        return "This is a ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
