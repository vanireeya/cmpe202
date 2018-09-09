
/**
 * This state is used when coin has been inserted in the gumball machine but is its value is less than value of gumball.
 * Eg a quater has been inserted for a a gumball whose value is 50 cents.
 *
 * @author (Reeya)
 * @version (v1.0)
 */
public class waitingMoreCoins implements State {

    int machineType;
    GumballMachine gumballMachine;

    public waitingMoreCoins(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coinValue) {
        if (gumballMachine.machineType == 2) {
            if (coinValue == 25 && gumballMachine.sum < 50) {
                gumballMachine.sum = gumballMachine.sum + 25;
                if (gumballMachine.sum >= 50) {
                    System.out.println("You inserted a quater");
                    gumballMachine.setState(gumballMachine.getHasQuarterState());
                }
            } else {
                System.out.println("You cannot insert this coin");
            }
        } else {
            System.out.println("You inserted a coin");
            gumballMachine.sum = gumballMachine.sum + coinValue;
            if (gumballMachine.sum >= 50) {
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
        }
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned, but not enough money");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "sold out";
    }

}
