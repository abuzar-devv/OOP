class Car {

    private String model;
    private String color;
    private int speed;

    public void setParameters(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public void start() {
        System.out.println("Car is started");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setParameters("Toyota Corolla", "White", 60);
        car1.start();
        car1.display();
        car1.stop();


        Car car2 = new Car();

        car2.setParameters("Honda Civic", "Black", 80);
        car2.start();
        car2.display();
        car2.stop();
    }
}
