package person;

public class LittleBoy extends Child {

    String name = "Michael";
    @Override
    public String likesToRead() {
        return "adventure books";
    }

    @Override
    public String likeToEat() {
        return "candies";
    }
    @Override
    public String thisIs() {

        return super.thisIs() + "little boy.";
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
