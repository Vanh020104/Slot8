package demo1;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    int telephone;
    String address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  Add() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        telephone =sc.nextInt();
    }

}
