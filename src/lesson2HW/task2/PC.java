package lesson2HW.task2;

public class PC {
    private String core;
    private String keyboard;
    private String screen;

    public PC() {
    }

    public PC(String core, String keyboard, String screen) {
        this.core = core;
        this.keyboard = keyboard;
        this.screen = screen;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "PC{" +
                "core='" + core + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
