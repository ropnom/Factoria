package factoria;

import modelo.P1;
import modelo.P2;
import modelo.Product;

public class Factoria {
	
	public static Product getProduct(String name){

		Product p = null;
		if(name.equals("P1"))
		p = new P1();
		else
		p= new P2();
		return p;
	}	

}
