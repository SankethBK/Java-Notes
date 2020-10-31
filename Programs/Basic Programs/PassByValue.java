class Car{
    int x;
    Car(int i){
        x = i;
    }
}

class CarWrapper {
    Car c;
    CarWrapper(Car c){
        this.c = c;
    }
}
public class PassByValue {
    public static void swap(Car c1, Car c2){
        Car temp;
        temp = c1;
        c1 = c2;
        c2 = temp;
        c2.x = 150;  // it may not swap c1 and c2 but this line can change c1's x as it still points to c1
    }

    public static void swap(CarWrapper cw1, CarWrapper cw2){
        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }
    public static void main(String[] args){
        Car c1 = new Car(12);
        Car c2 = new Car(13);
      //  swap(c1, c2);
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        swap(cw1, cw2);
        System.out.println(c1.x); //12
        System.out.println(c2.x); //13
        System.out.println(cw1.c.x); //13
        System.out.println(cw2.c.x); //12
        // Well if we start thinking , this is amazing
    }
}