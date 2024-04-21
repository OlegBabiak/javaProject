package lesson3HW.task1;

public class Magazine implements Printable{
    String magazineName;
    static int count  = 0;

    public Magazine() {
        count++;
    }

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println(count + " magazines was printed");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazineName='" + magazineName + '\'' +
                '}';
    }
}
