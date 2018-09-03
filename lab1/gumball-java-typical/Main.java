

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2,"A");
        int[] coinsA= {25};
        int[] coinsB={25,25};
        int[] coinsC={10,25,10,5};

        gumballMachine.insertQuarter(coinsA);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( coinsA );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( coinsA );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        GumballMachine gumballMachineB = new GumballMachine(2,"B");
        gumballMachineB.insertQuarter(coinsB);
        gumballMachineB.turnCrank();
        coinsB=new int[]{25,5};
        gumballMachineB.insertQuarter( coinsB );
        gumballMachineB.turnCrank();
        coinsB=new int[]{25};
        gumballMachineB.insertQuarter( coinsB );
        gumballMachineB.turnCrank();
        System.out.println(gumballMachineB);
        
        
        GumballMachine gumballMachineC = new GumballMachine(2,"C");
        gumballMachineC.insertQuarter(coinsC);
        gumballMachineC.turnCrank();
        coinsC=new int[]{25,5,5};
        gumballMachineC.insertQuarter( coinsC );
        gumballMachineC.turnCrank();
        coinsC=new int[]{25,25,25};
        gumballMachineC.insertQuarter( coinsC );
        gumballMachineC.turnCrank();
        
    }
}
