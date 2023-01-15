package Interfaces;

public class Person implements Comparable<Person>{

//    The Comparable interface is a built-in interface in Java that is used to establish a natural ordering for
//    objects of a class. A class that implements the Comparable interface must implement the compareTo(Object o)
//    method, which compares the current object to the object passed as a parameter and returns an integer indicating
//    their relative ordering.

//    The compareTo() method should return a negative integer if the current object is less than the object
//    passed as a parameter, a positive integer if the current object is greater than the object passed as a
//    parameter, and zero if the two objects are equal.

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        int a = 5;
        Person obj = new Person("Harry",21);
        Person obj1 = new Person("Prince",25);
        System.out.println(obj.compareTo(obj1));

    }


    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
