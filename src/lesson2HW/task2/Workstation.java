package lesson2HW.task2;

public class Workstation extends Laptop{
    public Workstation() {
    }

    public Workstation(boolean mobility) {
        super(mobility);
    }

    public Workstation(String core, String keyboard, String screen) {
        super(core, keyboard, screen);
    }

    public Workstation(String core, String keyboard, String screen, boolean mobility) {
        super(core, keyboard, screen, mobility);
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "core='" + getCore() + '\'' +
                ", keyboard='" + getKeyboard() + '\'' +
                ", screen='" + getScreen() + '\'' +
                "mobility=" + mobility +
                '}';
    }
}
