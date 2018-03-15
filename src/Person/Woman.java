package person;

public class Woman extends Person{

    @Override
    public String thisIs() {

        return super.thisIs() + "woman: ";
    }
}
