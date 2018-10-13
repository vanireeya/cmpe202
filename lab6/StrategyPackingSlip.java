
/**
 * Write a description of class StrategyPackingSlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
public class StrategyPackingSlip implements IStrategyReceipt
{
   
    
    /**
     * Constructor for objects of class PackingReceipt
     */
    
    public StrategyPackingSlip()
    {
       
    }
    /**
     * Return receipt contents
     * @param Order to print packing receipt for
     * @return receipt contents
     */
    public void printReceipt(Component order){
        System.out.println("-------------------------------------");
        System.out.println("Packing Slip");
        System.out.println("-------------------------------------");
        order.printReceipt(1);
        System.out.println("-------------------------------------");
    }
}
