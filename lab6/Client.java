

public class Client
{
    

    /**
     * run method to run the test
     */
    public static void runTest()
    {
        Component order = BuildOrder.getOrder() ;
        
        CustomerReceipt receipt=new CustomerReceipt();
        receipt.printReceipt(order);
        StrategyPackingSlip slip =new StrategyPackingSlip();
        slip.printReceipt(order);

    }
}
