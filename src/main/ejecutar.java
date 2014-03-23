package main;

import modelo.Product;
import factoria.Factoria;

public class ejecutar {

public static void main(String[]args){
		
		Product p = Factoria.getProduct("P1");
		p.manipulate();
		
		Product c = Factoria.getProduct("P1");
		c.manipulate();
		
		Product r = Factoria.getProduct("P2");
		r.vender();
	}

}
