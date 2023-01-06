package ObjectClass.equals;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return p.name.equals(name) && p.age == age;
    }

    public static void main(String[] args) {

        Person p = new Person("Harry",23);
        System.out.println(p.equals(p));

        Person p1 = new Person("Parasu",23);
        System.out.println(p.equals(p1));
    }
}

