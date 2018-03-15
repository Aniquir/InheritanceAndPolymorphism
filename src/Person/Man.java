package person;

public class Man extends Person {

    @Override
    public String thisIs() {
        return super.thisIs() + "man: ";
    }
}
