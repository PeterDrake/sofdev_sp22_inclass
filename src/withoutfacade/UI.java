package withoutfacade;

public class UI {

    private BankAccount account;
    private Car car;

    public static void main(String[] args) {
        new UI().run();
    }

    public UI() {
        account = new BankAccount(5000);
        car = new Car();
    }

    public void run() {
        display();
        paint("red");
        display();
    }

    public void paint(String color) {
        car.setColor(color);
        account.reduceBy(200);
    }

    public void display() {
        System.out.println("The car is " + car.getColor());
        System.out.println("I have $" + account.getBalance());
    }
}
