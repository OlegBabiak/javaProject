package lesson3HW.task2;

public class Guitar implements Instrument {
    static int quantityOfStrings = 6;

    @Override
    public void play() {
        System.out.println("Guitar is playing with quantity of strings: " + quantityOfStrings);
    }
}
