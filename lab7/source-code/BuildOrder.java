  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
        CustomBurger customBurger1 = new CustomBurger( "Custom Burger1" ) ;
        
        // base price for 1/3 lb
        Burger burger1=new Burger("Burger");
        String[] b1={"Organic Bison*","1/2lb.","On A Bun"};
        burger1.setOptions(b1);
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American Cheese", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( burger1 ) ;
        
        //+1.50 each premium cheese
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
         
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        // free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"  } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        //+1.00-3.00 each topping
        PremiumToppings p = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        
        Bun b = new Bun( "Bun Options" ) ;
        String[] bo = { "Ciabatta(Vegan)" } ;
        b.setOptions( bo ) ;
        b.wrapDecorator( p ) ;
        
        
        //+3.00 each
        Side side = new Side( "Side Options" ) ;
        String[] sideo = { "Shoestring Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( b) ;
        
        customBurger1.setDecorator(side);
        customBurger1.addChild(burger1);
        customBurger1.addChild(c);
        customBurger1.addChild(pc);
        customBurger1.addChild(s);
        customBurger1.addChild(t);
        customBurger1.addChild(p);
        customBurger1.addChild(b);
        customBurger1.addChild(side);
        
        
        CustomBurger customBurger2 = new CustomBurger( "Custom Burger2" ) ;
        
        // base price for 1/3 lb
        Burger burger2=new Burger("Burger");
        String[] b2={"Harmone & Antibiotic Beef*", "1/3lb.", "On A Bun" };
        burger2.setOptions(b2);
        
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = {  "Smoked Gouda", "Greek Feta"  } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( burger2 ) ;
        
        //+1.50 each premium cheese
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"  } ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
         
        // 1 sauce free, extra +.75
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        
        // free
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts"  } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        
        //+1.00-3.00 each topping
        PremiumToppings p2= new PremiumToppings( "Premium Toppings Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*", "Marinated Tomatoes"  } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        
        
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] bo2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( bo2 ) ;
        bun2.wrapDecorator( p2 ) ;
        
        
        //+3.00 each
        Side side2 = new Side( "Side Options" ) ;
        String[] sideo2 = { "Shoestring Fries" } ;
        side2.setOptions( sideo2 ) ;
        side2.wrapDecorator( bun2) ;
        
        customBurger2.setDecorator(side2);
        customBurger2.addChild(burger2);
        customBurger2.addChild(c2);
        customBurger2.addChild(pc2);
        customBurger2.addChild(s2);
        customBurger2.addChild(t2);
        customBurger2.addChild(p2);
        customBurger2.addChild(bun2);
        customBurger2.addChild(side2);
        
        
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/