package ObjectClass.hashCode;

public class Employee {
    int E_id;

    Employee(int id){
        this.E_id = id;
    }

    public int hashCode(){
        return this.E_id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        System.out.println(e1.hashCode());
        Employee e2 = new Employee(102);
        System.out.println(e2.hashCode());
        Employee e3 = new Employee(103);
        System.out.println(e3.hashCode());
    }
}
