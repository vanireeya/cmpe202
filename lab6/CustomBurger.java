


import java.util.ArrayList;
public class CustomBurger extends Composite
{
  protected ArrayList<Component> customBurger = new ArrayList<Component>()  ;
  protected String description;
  protected Double price;
    
    
    public CustomBurger ( String d,Double p  )
    {
        super(d) ;
        description=d;
        price=p;
    }
    
    public void addChild(Component c){
        customBurger.add(c);
    }
    
    public void printReceipt(int calledBy) {
        if(calledBy==0){
            System.out.println("\n"+description+"\t$"+price);
            int i=0;
            while(i<customBurger.size()){
                customBurger.get(i).printReceipt(calledBy);
                i++;
            }
        }
        else {
            
            
            int i=0;
            System.out.println("\n"+description);
            while(i<3){
                int j=0;
                while(j<3){
                    
                    if(i==0){
                        if(customBurger.get(j).getClass().getName()=="OnTop"){
                            customBurger.get(j).printReceipt(calledBy);
                            i++;
                        }                        
                    }else if(i==1) {
                        if(customBurger.get(j).getClass().getName()=="OnMeat"){
                            customBurger.get(j).printReceipt(calledBy);
                            i++;
                        }
                    }else{
                        if(customBurger.get(j).getClass().getName()=="OnBottom"){
                            customBurger.get(j).printReceipt(calledBy);
                            i++;
                        }
                    }
                    j++;
                }
                
            }
         
        }
        
        
    }
    
    
    public Double returnPrice(){
        return price;
    }
    
    
}
