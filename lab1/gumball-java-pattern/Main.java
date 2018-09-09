
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5, 1);

        System.out.println(gumballMachine);
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(5);
        gumballMachine.turnCrank();

        gumballMachine.insertCoin(25);
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        GumballMachine gumballMachine2 = new GumballMachine(3, 2);

        System.out.println(gumballMachine2);
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin(5);
        gumballMachine2.turnCrank();

        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);

        GumballMachine gumballMachine3 = new GumballMachine(4, 3);

        System.out.println(gumballMachine3);
        gumballMachine3.insertCoin(5);
        gumballMachine3.insertCoin(25);
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3);

        gumballMachine3.insertCoin(5);
        gumballMachine3.turnCrank();

        gumballMachine3.insertCoin(25);
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3);

    }
}
