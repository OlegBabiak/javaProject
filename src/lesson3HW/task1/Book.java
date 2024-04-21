package lesson3HW.task1;

public class Book implements Printable{
    String bookName;
    static int count = 0;
    @Override
    public void print() {
        System.out.println( count + " books was printed");
    }

    public Book() {
        count++;
    }

    public Book(String bookName) {
        count++;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
