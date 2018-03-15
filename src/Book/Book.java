package book;

public class Book {

    private String title;
    private int numberOfPages = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumerOfPages(int numerOfPages) {
        this.numberOfPages = numerOfPages;
    }
}
