package InnerClasses.Combination.IinsideC;

import InnerClasses.Combination.CinsideI.Vehicle;

public class Vehicletype {

    interface Vehicle{
        void getWheels();
    }

    class Bus implements Vehicle{
        public void getWheels(){
            System.out.println(6);
        }
    }
    class Auto implements Vehicle{
        public void getWheels(){
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        Vehicletype obj = new Vehicletype();
        System.out.println(obj);
        Vehicletype.Bus obj1 = obj.new Bus();
        obj1.getWheels();
        System.out.println(obj1);
        Vehicletype.Auto obj2 = obj.new Auto();
        obj2.getWheels();
        System.out.println(obj2);
    }
}
