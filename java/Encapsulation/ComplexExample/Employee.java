package Encapsulation.ComplexExample;

public class Employee {
    private String Ep_Name;
    private String Ep_Email;
    private String Ep_DOJ;

    //    We have to create individual setter and getter method all private variables
//    Getter Methods
    public String getEp_Name(){
        return this.Ep_Name;
    }
    public String getEp_Email(){
        return this.Ep_Email;
    }
    public String getEp_DOJ(){
        return this.Ep_DOJ;
    }

    //    Setter Methods
    public void setEp_Name(String name){
        this.Ep_Name = name;
    }
    public void setEp_Email(String email){
        this.Ep_Email = email;
    }
    public void setEp_DOJ(String doj){
        this.Ep_DOJ = doj;
    }

    Employee(String name,String email,String doj){
        this.Ep_Name = name;
        this.Ep_Email = email;
        this.Ep_DOJ = doj;
    }

    public void get_Details(){
        System.out.println(this.Ep_Name);
        System.out.println(this.Ep_Email);
        System.out.println(this.Ep_DOJ);
    }
}
