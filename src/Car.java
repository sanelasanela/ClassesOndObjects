 public class Car
 {
     String brand;
     String model;
     String color;
     int yearOfManu;
int speed;

     public Car(String brand, String model, String color, int yearOfManu) {
         this.brand = brand;
         this.model = model;
         this.color = color;
         this.yearOfManu = yearOfManu;
     }

     public void starts (){

         System.out.println("The " + brand + " " + model + " got started");
     }

     public void ubrzanje (){
       speed++;
         System.out.println("speed " + speed);
     }

     public Car(int speed) {
         this.speed = speed;

     }
 }