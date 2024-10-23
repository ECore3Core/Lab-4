import java.io.*;
import Vehicle.*;
import Exceptions.*;

public class App {
    public static void main(String[] args) throws IOException, NoSuchModelNameException, DuplicateModelNameException, ClassNotFoundException, CloneNotSupportedException{
        
        //тест equals
        Car car = new Car("BMW", 5);
        Car car2 = new Car("BMW", 5);
        car.addModel("car10", 10);
        car2.setModelName("Car 3", "car10");
        car2.setPrice("car10", 10);
        car2.addModel("Car 3", 103);
        System.out.println(car.equals(car2));
        car2.deleteModel("Car 1");
        System.out.println(car.equals(car2));

        //тест toString
        System.out.println(car.toString());

        //тест clone
        Car cloneCar = (Car)car.clone();
        cloneCar.printInfo();

        //тест hashCode()
        Motorcycle moto = new Motorcycle("Suzuki", 10);
        System.out.println(moto.hashCode());
    }
}
