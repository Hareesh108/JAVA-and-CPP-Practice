package ObjectClass.equals;

public class Company {
    String C_name;
    Company(String name)
    {
        this.C_name = name;
    }

    public boolean equals(Object obj2)
    {
        if (this.C_name == ((Company)obj2).C_name){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Company c1 = new Company("TCS");
        System.out.println(c1);
        Company c2 = new Company("TCS");
        System.out.println(c2);

        System.out.println(c1.equals(c2));
    }
}
