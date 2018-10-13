
/**
 * Write a description of class BuildOrder here.
 *
 * @author (Reeya)
 * @version (V 1.0)
 */
public class BuildOrder
{
    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
        
        order.addChild(new Leaf("Fries", 2.79 ));
        
        CustomBurger customBurger = new CustomBurger( "LBB",5.59 ) ;
        
        OnTop onTopItems=new OnTop("On Top Bun");
        onTopItems.addChild("lettuce");
        onTopItems.addChild("Tomatoes");
        
        OnBottom onBottomItems=new OnBottom("On Bottom Bun");
        onBottomItems.addChild("{{{Bacon}}}");
        
        OnMeat onMeatItems=new OnMeat("On Meat");
        onMeatItems.addChild("->|G Onion");
        onMeatItems.addChild("->|Jalapeneos Grilled");
        
        
        // Setup Custom Burger Ingredients
        
        customBurger.addChild( onBottomItems ) ;
        customBurger.addChild( onTopItems ) ;
        customBurger.addChild( onMeatItems ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        
        
        return order ;
    }
}
