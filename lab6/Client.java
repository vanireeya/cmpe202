
/**
 * Client places builds the order and prints the receipt
 *
 * @author (Reeya )
 * @version (v 1.0)
 */
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
