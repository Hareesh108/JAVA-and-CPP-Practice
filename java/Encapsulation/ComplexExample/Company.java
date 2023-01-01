package Encapsulation.ComplexExample;

public class Company {
    String CompanyName = "TCS";

    public static void main(String[] args) {
        Employee obj = new Employee("Harry","h@gmail.com","20/1/2021");

        System.out.println(obj);

//        printed values using getter methods
        System.out.println(obj.getEp_Name());
        System.out.println(obj.getEp_Email());
        System.out.println(obj.getEp_DOJ());

//        Updated Values using setter methods
        obj.setEp_Name("Prince");
        obj.setEp_Email("P@gmail.com");
        obj.setEp_DOJ("20/5/2022");

        System.out.println(obj.getEp_Name());
        System.out.println(obj.getEp_Email());
        System.out.println(obj.getEp_DOJ());

        obj.get_Details();
    }
}
