package Methods;

public class CallAnother {
    public static int  Hareesh(int money){
        System.out.println(money);
        System.out.println("Taken From Gaurav " + Gaurav(money));
        return money*2;
    }
    public static int Gaurav(int cash){
        System.out.println(cash);
        System.out.println("Taken From Rahul "+ Rahul(cash));
        return cash*2;
    }
    public static int Rahul(int dollar){
        System.out.println(dollar);
        return dollar*2;
    }

    public static void main(String[] args) {
        System.out.println("Give Back to Hareesh " + Hareesh(1000));
    }
}
