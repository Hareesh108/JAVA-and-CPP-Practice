package Inheritance.Multilevel;

public class BmwX7 extends BMW {

    public void AudioPlayer(){
        System.out.println("BMWX7 AudioPlayer");
    }

    public static void main(String[] args) {
        BmwX7 obj = new BmwX7();
        System.out.println(obj.color);
        obj.Engine();
        obj.brake();
        obj.AudioPlayer();
    }
}
