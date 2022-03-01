package withfacade;

import withoutfacade.BankAccount;
import withoutfacade.Car;

public class Facade {

    private BankAccount account;
    private Car car;

    public Facade() {
        account = new BankAccount(5000);
        car = new Car();
    }

    public void paintCar(String color)  {
        car.setColor(color);
        account.reduceBy(200);
    }

    public String getCarColor() {
        return car.getColor();
    }

    public int getAccountBalance() {
        return account.getBalance();
    }
}
