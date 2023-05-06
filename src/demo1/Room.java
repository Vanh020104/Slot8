package demo1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Room {
    String name;
    String position;
    Array listPerson;

    public Room(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Information(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dien thong tin: ");
        position = sc.next();
    }
}
