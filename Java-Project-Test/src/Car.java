//inheritance  Car vererbt die Eigenschaften von Vehicle...
public class Car extends Vehicle {

    //neues attribut
    boolean abs;

    //constructor
    public Car(String brand, int km, int price, boolean abs) {
        super(brand, km, price);
        this.abs=abs;
    }
}
