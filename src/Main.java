public class Main {
    public static void main(String[] args) {

       // Car newCar = new Car();
       // newCar.brand = "Bmw";
        //newCar.model = "x6";
        //newCar.color = "black";


        Car newCar2 = new Car("audi", "6", "black", 5);
        Car second = new Car(23);

        newCar2.starts();
        second.ubrzanje();
    }
}
