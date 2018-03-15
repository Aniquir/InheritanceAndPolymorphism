package book;

public class Missing extends CriminalBook {

    @Override
    public String getTitle() {
        return "Missing";
    }

    @Override
    public int getNumberOfPages() {
        return 350;
    }
}
