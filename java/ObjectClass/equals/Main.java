package ObjectClass.equals;

class Main {

    String Name;
    Main(String name){
        this.Name = name;
    }

    public boolean equals(Main o){

        if(this.Name == o.Name){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Main obj = new Main("Hareesh");
        Main obj1 = new Main("Hareesh");

        System.out.println(obj.equals(obj1));
    }
}
