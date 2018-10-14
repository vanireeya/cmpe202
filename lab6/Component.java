
public interface Component
{
     void printReceipt(int calledBy) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     Double returnPrice();
     
}
