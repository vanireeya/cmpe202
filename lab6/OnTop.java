
/**
 * Write a description of class OnTop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class OnTop extends Leaf
{
   private String[] options ;
    
    protected ArrayList<String> OnTopItems = new ArrayList<String>()  ;
     protected String description ;
    
    public OnTop( String d )
    {
        super(d);
        description=d;
    }
    
    public void addChild(String item){
        OnTopItems.add(item);
    }
    
     public void printReceipt(int calledBy) {
        int i=0;
        while (i<OnTopItems.size()) {
		System.out.println(OnTopItems.get(i));
		i++;
	}
    }
    
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}
