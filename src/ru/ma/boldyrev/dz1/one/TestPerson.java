package ru.ma.boldyrev.dz1.one;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .setFirstName("Person1FirstName")
                .setLastName("Person1LastName")
                .build();

        Person person2 = new Person.Builder()
                .setFirstName("Person2FirstName")
                .setLastName("Person2LastName")
                .setAge(34)
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
