package lesson2HW;

import lesson2HW.task1.Address;
import lesson2HW.task1.Company;
import lesson2HW.task1.User;
import lesson2HW.task2.Laptop;
import lesson2HW.task2.Workstation;
import lesson2HW.task3.Comic;
import lesson2HW.task4.Car;
import lesson2HW.task4.Employee;
import lesson2HW.task4.Gender;
import lesson2HW.task4.Skills;

public class Main {
    public static void main(String[] args) {

        //task 1
        //створити клас, який би описував подібні об'єкти використовуючи композицію/агрегацію
        //https://jsonplaceholder.typicode.com/users/1

        User user1 =
                new User(1, "Leanne Graham", "Bret", "Sincere@april.biz",
                        new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", new double[]{-37.3159, 81.1496}),
                        "1-770-736-8031 x56442", "hildegard.org",
                        new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"));
        System.out.println(user1);
        User user2 =
                new User(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv", "010-692-6593 x09125", "anastasia.net",
                        "Victor Plains", "Suite 879", "Wisokyburgh", "90566-7771", new double[]{-43.9509, -34.4618},
                        "Deckow-Crist", "Proactive didactic contingency", "synergize scalable supply-chains");
        System.out.println(user2);


        //task 2
        //Створити та описати наступну їєрархію
        //PC-Laptop-Ultrabook
        //PC-Laptop- Workstation
        //Загальна кількість використаних класів - 4!
        Workstation workstation = new Workstation("i5", "full size", "17 inch", true);
        Laptop laptop = new Laptop("i7", "full size", "15 inch", true);
        System.out.println(workstation);
        System.out.println(laptop);

        // task3
        //Створити клас ланцюг наслідування:
        //Папірус-Книга-Журнал
        //Папірус-Книга-Комікс
        //Кількість полів довільна.
        Comic comic = new Comic();
        System.out.println(comic);

        // task4
        //Створити клас котрий відповідає наступній моделі
        //{
        //    id: 1,
        //    name: 'vasya',
        //    surname: 'pupkin',
        //    email: 'asd@asd.com',
        //    age: 31,
        //    gender: 'MALE',
        //    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
        //    car: {model: 'toyota', year: 2021, power: 250}
        //}
        //Використати композицію/агрегацію та енуми в потрібному місці.
        String[] skArr = {"java exp: 10", "js exp: 10", "c++ exp: 15"};
        Car tCar = new Car("toyota", 2021, 250);
        Skills skills = new Skills(skArr);
        System.out.println(skills);
        Employee employee = new Employee(1, "vasya", "pupkin", "asd@asd.com", 31,
                Gender.MALE, skills, tCar);
        Employee employee2 = new Employee(2, "asya", "dupkin", "zasd@zasd.com", 21,
                Gender.FEMALE, "toyota", 2021, 250, new String[]{"java exp: 10", "js exp: 10", "c++ exp: 15"});

        System.out.println(employee);
        System.out.println(employee2);


    }
}
