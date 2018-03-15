package person;

import book.Book;

public class GeekMan extends Man {

    String name = "John";
    @Override
    public String likesToRead() {
        return "fantasy and adventure books";
    }

    @Override
    public String likeToEat() {
        return "veal";
    }
    @Override
    public String thisIs() {
        return super.thisIs() + "geek man.";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
