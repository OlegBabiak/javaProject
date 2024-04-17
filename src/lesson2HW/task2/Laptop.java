package lesson2HW.task2;

public class Laptop extends PC {
    boolean mobility = true;

    public Laptop() {
    }

    public Laptop(boolean mobility) {
        this.mobility = mobility;
    }

    public Laptop(String core, String keyboard, String screen) {
        super(core, keyboard, screen);
    }

    public Laptop(String core, String keyboard, String screen, boolean mobility) {
        super(core, keyboard, screen);
        this.mobility = mobility;

    }

    @Override
    public String toString() {

        return
                "Laptop{" +
                        "core='" + getCore() + '\'' +
                        ", keyboard='" + getKeyboard() + '\'' +
                        ", screen='" + getScreen() + '\'' +
                        "mobility=" + mobility +
                        '}';
    }
}
