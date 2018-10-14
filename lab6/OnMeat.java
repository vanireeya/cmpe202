

import java.util.ArrayList;
public class OnMeat extends Leaf
{
    
    protected ArrayList<String> onMeatItems = new ArrayList<String>()  ;
     protected String description ;
    
    public OnMeat( String d )
    {
        super(d);
        description=d;
    }
    
     public void printReceipt(int calledBy) {
        int i=0;
        while (i<onMeatItems.size()) {
		System.out.println(onMeatItems.get(i));
		i++;
	}
    }
    
    
    public void addChild(String item){
       onMeatItems.add(item);
    }
}
