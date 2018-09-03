
public class GumballMachine
{
    private int num_gumballs;
    private boolean has_quarter;
    private String machine;
   
    public GumballMachine( int size, String machineModel )
    {
      //   initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.machine=machineModel;
    }

    public void insertQuarter(int coin[])
    {
        if(this.machine=="A")
        {
            if ( coin.length>0 && coin[0] == 25 )
                this.has_quarter = true ;
                else 
                this.has_quarter = false;          
        }
        else if(this.machine=="B")
        {
           if( coin.length >1 && coin[0] == 25 && coin[1]==25)
           {
                this.has_quarter = true ;
           }
           else{
               this.has_quarter = false;  
            }  
        }
        else
        {
            int totalValue=0;
            boolean invalidCurrency= false;
            for(int i=0;i<coin.length && !invalidCurrency;i++){
                if(coin[i]!=5 && coin[i]!=10 && coin[i]!=25){
                    invalidCurrency=true;
                }
                totalValue=totalValue+coin[i];
            }
            if(totalValue>=50 && !invalidCurrency)
            {
                this.has_quarter = true ;
           }
           else{
               this.has_quarter = false;  
            }
        }
   }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for paying.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert coins" ) ;
        }        
    }
}