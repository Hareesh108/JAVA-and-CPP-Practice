package ObjectClass.equals;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        return p.name.equals(this.name) && p.age == age;
    }
    public static void main(String[] args) {

        Person p1 = new Person("Harry",23);

        Person p2 = new Person("Prince",23);
        System.out.println(p1.equals(p2));
    }
}

