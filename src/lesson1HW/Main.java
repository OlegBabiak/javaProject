package lesson1HW;

import lesson1HW.task1.Book;
import lesson1HW.task1.Car;
import lesson1HW.task1.Dog;
import lesson1HW.task2.Post;
import lesson1HW.task3.Comment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // task1
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("book1",238,new String[]{"a1","a2"},"si-fi");
        books.add(book1);
        Book book2 = new Book("book2",248,new String[]{"a1","a2","a3"},"mystery");
        books.add(book2);
        Book book3 = new Book("book3",338,new String[]{"a1"},"biography");
        books.add(book3);
        Book book4 = new Book("book4",235,new String[]{"a1"},"history");
        books.add(book4);
        Book book5 = new Book("book5",526,new String[]{"a1"},"guide");
        books.add(book5);
        System.out.println(books);
        for (Book book : books) {
            System.out.println(book);
        }



        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setModel("m3");
        car1.setPower(350);
        car1.setVolumeEngine(3.5);
        car1.setTurbo(true);

        cars.add(car1);

        Car car2 = new Car("audi",230, 2.2,true);
        cars.add(car2);
        Car car3 = new Car("peugeot",130, 1.2,true);
        cars.add(car3);
        Car car4 = new Car("ferrari",450, 4,false);
        cars.add(car4);
        Car car5 = new Car("dacia",71, 1.5,false);
        cars.add(car5);

        System.out.println(cars);
        for (Car car : cars) {
            System.out.println(car);
        }

        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("tuzik",2,"dvirteryer");
        dogs.add(dog1);
        Dog dog2 = new Dog("bars",1,"doberman");
        dogs.add(dog2);
        Dog dog3 = new Dog("dog3",1,"breed3");
        dogs.add(dog3);
        Dog dog4 = new Dog("dog4",1,"breed4");
        dogs.add(dog4);
        Dog dog5 = new Dog("dog5",1,"breed5");
        dogs.add(dog5);

        System.out.println(dogs);
        for (Dog dog :
                dogs) {
            System.out.println(dog);
        }

//        task2
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post(1,1,"sunt aut","quia et suscipit nsuscipit");
        Post post2 = new Post(1,2,"qui est esse","est rerum tempore");
        Post post12 = new Post(2,12,"in quibusdam","itaque id aut magnam");
        Post post23 = new Post(3,23,"maxime id","veritatis unde neque");
        Post post35 = new Post(4,35,"id nihil consequatur","nisi error delectus possimus ut eligendi");
        posts.add(post1);
        posts.add(post2);
        posts.add(post12);
        posts.add(post23);
        posts.add(post35);
        System.out.println(posts);
        for (Post post :
                posts) {
            System.out.println(post);
        }

        //task3

        ArrayList<Comment> comments = new ArrayList<>();
        Comment comment1 = new Comment(1,1,"id labore ex","Eliseo@gardner.biz","laudantium enim quasi est");
        Comment comment22 = new Comment(5,22,"porro repellendus","Khalil@emile.co.uk","qui ipsa animi nostrum");
        Comment comment31 = new Comment(7,31,"ex velit ut","Buford@shaylee.biz","quia incidunt");
        Comment comment36 = new Comment(8,36,"sit et quis","Raheem_Heaney@gretchen.biz","aut vero est");
        Comment comment42 = new Comment(9,42,"nam qui et","Shemar@ewell.name","aut culpa quaerat");
        comments.add(comment1);
        comments.add(comment22);
        comments.add(comment31);
        comments.add(comment36);
        comments.add(comment42);
        System.out.println(comments);
        for (Comment comment :
                comments) {
            System.out.println(comment);
        }







    }
}
