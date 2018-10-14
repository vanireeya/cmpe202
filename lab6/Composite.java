
/**
 * Write a description of class Composite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Composite implements Component
{
    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
   
    
    public Composite ( String d)
    {
        description = d ;
        
    }

    public void printReceipt(int calledBy) {
        //System.out.println( description );
        for (Component obj  : components)
        {
            
            obj.printReceipt(calledBy);
        }
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
    public Double returnPrice(){
        
        Double total=0.0;
        for (Component obj  : components)
        {
            total=total+obj.returnPrice();
        }
        return total;
    }
   
}
