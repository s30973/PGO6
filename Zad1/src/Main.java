import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
      ArrayList<Car> cars=new ArrayList<Car>();

      cars.add(new Car(model "BMW", year 1916));
      cars.add(new Car(model "Honda", year 1948));
      cars.add(new Car(model "Fiat 500", year 1957));
      cars.add(new Car(model "Kia", year 1971));
      cars.add(new Car(model "Golf", year 1999));
      cars.add(new Car(model "Astra", year 2010));
      cars.add(new Car(model "Corsa", year 2005));
      cars.add(new Car(model "Tesla Model S", year 2012));
      cars.add(new Car(model "Lamborghini Huracan", year 2014));
      cars.add(new Car(model "Suzuki Jimny 5D", year 2024));

      for(Car car : cars){
          System.out.println(car.model);
      }
      Collections.sort(cars);
      System.out.println("-----");
      for(Car car : cars){
          System.out.println(car.model);
      }
}
}


