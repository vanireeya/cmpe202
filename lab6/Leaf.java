
/**
 * Write a description of class Leaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
public class Leaf implements Component
{
    private String description ;
    public Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public void printReceipt(int calledBy) {
        //DecimalFormat fmt = new DecimalFormat("0.00");
        if(calledBy==0){
            System.out.println("\n"+description+"\t\t$"+price);
        }else{
            System.out.println("\n"+description);
        }
        
        
        //System.out.println( " " + description + " "  ) ;
    }

    public Double returnPrice(){
        return price;
    }
    
    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
}
