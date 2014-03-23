package factoria;

import modelo.P1;
import modelo.P2;
import modelo.Product;

public class Factoria2 {

	// version de pedirlo por string
	public static Product getProduct(String name) {

		Product p = null;
		if (name.equals("P1"))
			p = new P1();
		else
			p = new P2();
		return p;
	}

	//Introducimos directamente el nombre de la clase a instanciar
	// Es mas util ya que todos lso objetos heredan de Objet por lo que 	
	//podemos instanciar cualquier tipo de clase
	
	public static Product getProduct2(String name) {

		//definimos el producto y la clase vacia
		Product p = null;
		Class c = null;

		try {
			// la clase objet tiene metodos por defecto y atributos y son
			// heredados por todos
			// El metodo Class.forName tu le metes el nombre de la clase y el te
			// devuelte la clase que es
			// El metodo c.newInstance( permite intanciasn como new Objet());

			c = Class.forName(name);
			p = (Product) c.newInstance();
			
		} catch (Exception e) {

		}
		return p;
	}
	
}
