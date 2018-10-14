
/**
 * Acts as component for composite design pattern
 * 
 *
 * @author (Reeya)
 * @version (V 1.0)
 */
public interface Component
{
     void printReceipt(int calledBy) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     Double returnPrice();
     
}
