package withfacade;

import withoutfacade.BankAccount;
import withoutfacade.Car;

public class UI {

    private Facade facade;

    public static void main(String[] args) {
        new UI().run();
    }

    public UI() {
        facade = new Facade();
    }

    public void run() {
        display();
        paint("red");
        display();
    }

    public void paint(String color) {
        facade.paintCar(color);
    }

    public void display() {
        System.out.println("The car is " + facade.getCarColor());
        System.out.println("I have $" + facade.getAccountBalance());
    }
}
