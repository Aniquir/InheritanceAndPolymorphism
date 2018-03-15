package book;

public class Investigation extends CriminalBook {

    @Override
    public String getTitle() {
        return "Investigation";
    }

    @Override
    public int getNumberOfPages() {
        return 400;
    }
}
