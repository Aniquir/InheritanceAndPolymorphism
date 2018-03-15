package person;

public class BusinessWoman extends Woman {

    String name = "Dolores";

    @Override
    public String likesToRead() {
        return "criminal books";
    }

    @Override
    public String likeToEat() {
        return "fast food";
    }

    @Override
    public String thisIs() {

        return super.thisIs() + "bussines woman.";
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
