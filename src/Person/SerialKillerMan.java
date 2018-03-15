package person;

public class SerialKillerMan extends Man{

    @Override
    public String likesToRead() {
        return "adventure and criminal books";
    }

    @Override
    public String likeToEat() {
        return "potatoes";
    }

    @Override
    public String thisIs() {
        return super.thisIs() + "serial killer.";
    }
}
