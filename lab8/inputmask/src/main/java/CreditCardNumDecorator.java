
public class CreditCardNumDecorator implements IDecorator {

	
	
	int count=0;
	String digits="";
	
	/**
	 * function to added set logic for formating string
	 * @return String which is formatted
	 */
	public String setFormatting( String number){
		String finalNum="";
		for(int i=0;i<number.length();i++){
			if(i==4|| i==8|| i==12){
				finalNum+=" "+ number.charAt(i);
			}else{
				finalNum+= number.charAt(i);
			}
		}
		return finalNum;
	}
}
