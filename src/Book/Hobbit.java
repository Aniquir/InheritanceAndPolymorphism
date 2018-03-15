package book;

public class Hobbit extends FantasyBook {

    @Override
    public String getTitle() {
        return "Hobbit";
    }

    @Override
    public int getNumberOfPages() {
        return 100;
    }
}
