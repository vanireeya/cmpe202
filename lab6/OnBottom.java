
/**
 * Write a description of class OnBottom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class OnBottom extends Leaf
{
    
   protected ArrayList<String> OnBottomItems = new ArrayList<String>()  ;
     protected String description ;
    
    
    public OnBottom( String d )
    {
        super(d) ;
        description=d;
        
    }
    
     
    
    
    public void addChild(String item){
        OnBottomItems.add(item);
    }
    
    
    
    public void printReceipt(int calledBy) {
        int i=0;
        while (i<OnBottomItems.size()) {
		System.out.println(OnBottomItems.get(i));
		i++;
	}
    }
    
    
    public void setOptions( String[] options )
    {
        
    }
    
    public String getDescription() 
    {
        return "";
    }
}
