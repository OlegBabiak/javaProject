package lesson2HW.task2;

public class Ultrabook extends Laptop{
    public Ultrabook() {
    }

    public Ultrabook(boolean mobility) {
        super(mobility);
    }

    public Ultrabook(String core, String keyboard, String screen) {
        super(core, keyboard, screen);
    }

    public Ultrabook(String core, String keyboard, String screen, boolean mobility) {
        super(core, keyboard, screen, mobility);
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "do not know nothing about ultrabooks"  +
                '}';
    }
}
