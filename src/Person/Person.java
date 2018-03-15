package person;

import book.Book;

public class Person {

    private String name;
    private int age;

    public void read(Person person, Book book){
        System.out.println("Person " + person.getName() + " read book");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
