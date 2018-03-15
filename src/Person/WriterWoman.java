package person;

public class WriterWoman extends Woman{

    String name = "Amanda";

    @Override
    public String likesToRead() {
        return "fantasy, adventure and criminal books";
    }

    @Override
    public String likeToEat() {
        return "carrots";
    }
    @Override
    public String thisIs() {

        return super.thisIs() + "writer woman.";
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
