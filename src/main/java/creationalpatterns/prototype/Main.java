package creationalpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,"Volvo", "120 л.с, 88Квт\n");
    System.out.println(car1);

   Car car1Clone = (Car) car1.clone();
    System.out.println("\n=========================");
    System.out.println(car1Clone);
    }
}
