
public class CreditCardExpDecorator implements IDecorator {

	
	/**
	 * function to added set logic for formating string
	 * @return String which is formatted
	 */
	public String setFormatting(String number){
		String finalNum="";
		for(int i=0;i<number.length();i++){
			if(i==2){
				finalNum+="/"+ number.charAt(i);
			}else{
				finalNum+= number.charAt(i);
			}
		}
		return finalNum;
	}
}
