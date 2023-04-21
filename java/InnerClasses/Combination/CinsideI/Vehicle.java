package InnerClasses.Combination.CinsideI;

public interface Vehicle {
     void getWheels();
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
}
