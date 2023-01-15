package Interfaces;

import java.io.Serializable;

public class Serializable1 implements Serializable {

//    Serialization is the process of converting an object's state to a format that can be stored or transmitted
//    over a network. By default, the Java Virtual Machine (JVM) uses a binary format to serialize objects, but
//    other formats can also be used.
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    public Serializable1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Serializable1 obj = new Serializable1("harry",22);
        System.out.println(obj);
    }
}
