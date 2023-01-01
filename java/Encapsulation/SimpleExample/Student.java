package Encapsulation.SimpleExample;

public class Student {

    String St_Name;
    String St_DOB;
    private double st_fee;

//    getter method for fee
    public double getSt_fee(){
        return st_fee;
    }
//    setter method for setSt_fee
    public void setSt_fee(double fee){
        this.st_fee = fee;
    }

    Student(String name, String dob,double fee){
        this.St_Name = name;
        this.St_DOB = dob;
        this.st_fee = fee;
    }
    public void get_details(){
        System.out.println(this.St_Name);
        System.out.println(this.St_DOB);
        System.out.println(this.st_fee);
    }
}
