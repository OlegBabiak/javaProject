package lesson3HW.task2;

public class Drum implements Instrument{
    static int size = 50;
    @Override
    public void play() {
        System.out.println("Drum is playing with size: " + size);

    }
}
