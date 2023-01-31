public class Car {
    String name;
    Myself owner;
    int speed;

Car(String carName, Myself carOwner, int carSpeed){
    this.name = carName;
    this.owner = carOwner;
    this.speed = carSpeed;
 }
void showCarName(){
    System.out.println("My car is " + this.name  + ", The owner of this car is " + owner.name + ", and the speed of this car is " + this.speed);
  
 }
}
