
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
   private String[] options ;

    /**
     * Constructor for objects of class Bun
     */
    public Bun(String d)
    {
     super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( options[i]=="Gluten-Free Bun")  {
                this.price += 1.00 ;
            }
            if (options[i]== "Hawaiian Bun" ) {
                this.price += 1.00 ;
            }
            if (options[i]== "Pretzel Bun") {
                this.price += 0.50 ;
            }
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
