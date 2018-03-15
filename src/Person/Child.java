package person;

public class Child extends Person {

    @Override
    public String thisIs() {

        return super.thisIs() + "child: ";
    }
}
