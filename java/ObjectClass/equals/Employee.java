package ObjectClass.equals;

public class Employee {
    int E_id;

    Employee(int id){
        this.E_id = id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102);
        Employee e3 = new Employee(103);
        Employee e4 = e3;

        System.out.println(e1.equals(e2));
        System.out.println(e3.equals(e4));
    }
}
