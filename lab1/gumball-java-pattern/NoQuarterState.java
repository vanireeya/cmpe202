
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coinValue) {

        if (gumballMachine.machineType == 1) {
            if (coinValue == 25) {
                gumballMachine.sum = 25;
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            } else {
                System.out.println("You inserted wrong coin");
            }
        } else {
            if (gumballMachine.machineType == 2) {
                if (coinValue == 25) {
                    gumballMachine.sum = 25;
                    gumballMachine.setState(gumballMachine.getWaitingMoreCoinsState());
                } else {
                    System.out.println("You inserted wrong coin");
                }
            } else {
                gumballMachine.sum = coinValue;
                gumballMachine.setState(gumballMachine.getWaitingMoreCoinsState());
            }
        }

    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
