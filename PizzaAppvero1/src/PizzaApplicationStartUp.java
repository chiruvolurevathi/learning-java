import javax.swing.JOptionPane;

public class PizzaApplicationStartUp {
	private static String pizzaName;
	private static String size;
	private static String crust;
	private static int price; 
	private static String topping;
	
	public static void main(String[] args) {
		String pizName= JOptionPane.showInputDialog("choose pizza Name :vegitable pizza,vegitable,cut]");
		String pizSize= JOptionPane.showInputDialog("choose pizza Size  :[Medium,Regular,Large]");
		String pizCrust= JOptionPane.showInputDialog("choose pizza Crust  :[new hand on,new hand,new hand on on]");
		orderPizza(pizName,pizSize,pizCrust);
	    displayPizzaOrder();
	 
	  
	}

	private static void displayPizzaOrder() {
		 System.out.println("----------your pizza------");
			System.out.println("pizza  Name:"+pizzaName);
			System.out.println("Size :"+size);
			System.out.println("Crust  :"+crust);
			System.out.println("Price  :"+price);
			System.out.println("Topping :"+topping);
			
		
	}

	private static void orderPizza(String pName,String pSize,String pCrust) {
		pizzaName = pName;
		size=pSize;
		crust=pCrust;
		if(pizzaName.equals(PizzaConstants.FORMHOUSE_PIZZA) &&
	  size.equals(PizzaConstants.SIZE_REGULAR) &&
	 crust.equals(PizzaConstants.CRUST_NEW_HAND))
		{
			price=PizzaConstants.PRICE_FORMHOUSE;
			topping=PizzaConstants.TOPPING_FORMHOUSE;
			
		}
		 if(pizzaName.equals(PizzaConstants.VEGEXTRAVAGANZA_PIZZA) &&
				  size.equals(PizzaConstants.SIZE_MEDIUM) &&
				 crust.equals(PizzaConstants.CRUST_NEW_HAND_TOASTED))
					{
						price=PizzaConstants.PRICE_VEG_EXTRAVAGANZA;
						topping=PizzaConstants.TOPPING_VEG_EXTRA_VAGANZA;
					}

		 if(pizzaName.equals(PizzaConstants.MEXICAN_GREEN_WAVE) &&
								  size.equals(PizzaConstants.SIZE_LARGE) &&
								 crust.equals(PizzaConstants.CRUST_NEW_HAND_ON))
									{
										price=PizzaConstants.PRICE_MEXICAN;
										topping=PizzaConstants.TOPPING_MEXICAN;
						
					                  }	
	}
}


