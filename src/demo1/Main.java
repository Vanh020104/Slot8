package demo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("name");
        Room r = new Room("position");
        r.Information();
        p.Add();
        ArrayList listPerson = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        System.out.println("Age: " + p.age);
        System.out.println("Name:" + r.position);
        System.out.println("Telephone:" + p.telephone);
    }
}
