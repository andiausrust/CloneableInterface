package com.andi;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("andi", 52);
        System.out.println(person);

        Person secondPerson = (Person) person.clone();
        System.out.println(secondPerson);

        System.out.println(System.identityHashCode(person) + " = "
                + System.identityHashCode(secondPerson));

    }
}
