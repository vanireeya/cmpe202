
/**
 * Write a description of class CustomerReceipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;

import java.util.ArrayList;
public class CustomerReceipt implements IStrategyReceipt
{
    
    
   /**
     * Constructor for objects of class PackingReceipt
     */
    public CustomerReceipt()
    {
       
    }
    
  
    /**
     * Return receipt contents
     * @param Order to print packing receipt for
     * @return receipt contents
     */
    public void printReceipt(Component order){
        System.out.println("-------------------------------------");
        System.out.println("Receipt");
        System.out.println("-------------------------------------");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        order.printReceipt(0);
        //System.out.println(order.printDescription());
        
        
        System.out.println("\nSub. Total:\t" + fmt.format(order.returnPrice()));
        System.out.println("-------------------------------------\n");
    }
}
