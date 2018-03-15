package person;

public class LittleGirl extends Child {

    String name = "Katie";

    @Override
    public String likesToRead() {
        return "fantasy books";
    }

    @Override
    public String likeToEat() {
        return "vegetables";
    }

    @Override
    public String thisIs() {

        return super.thisIs() + "little girl.";
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
