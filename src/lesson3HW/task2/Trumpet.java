package lesson3HW.task2;

public class Trumpet implements Instrument{
    static int diameter = 25;
    @Override
    public void play() {
        System.out.println("Trumpet is playing with diameter: " + diameter);

    }
}
