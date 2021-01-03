public class IceCreamDriver
{
		private Toppings toppings = Toppings.getToppings();
		private Flavors flavors = Flavors.getFlavors();
		private Keyboard keyboard = Keyboard.getKeyboard();
		
		private IceCreamCone iceCream = new IceCreamCone();
		private String wantIce = "y";
		private double runningTotal = 0;
		
	//main method
	public static void main(String[] args)
	{	
		double price = iceCream.getPrice();
		wantIce = input.readString("Do you want ice cream? (y/n): ");
		
		while(wantIce  = "y" || wantIce == "Y")
		{	
			flavors.listFlavors();
			getFlavorChoice();
			
			toppings.listToppings();
			getToppingChoice();
			
			getScoopsChoice();
			getConeChoice();
			
			String order = iceCream.fullOrder();
			
			System.out.println(order);
			
			wantIce = input.readString("/nDo you want ice cream? (y/n): ");
			
			int orders = 0;
			orders++;
			
			runningTotal = price + runningTotal;
		}
		
		String ordersString = Int.toString(orders);
		double total = iceCream.getRunningTotal;
		System.out.println("Your total order for " + ordersString + " of ice cream is $" +  runningTotal);
			
		public static Flavor getFlavorChoice()
		{
			int flavorChoice  = input.readInt("Enter your desired flavor: ");
			while(flavorChoice < 1 || flavorChoice > 18)
			{
				System.out.println("Invalid option/n");
				int flavorChoice  = input.readInt("Enter your desired flavor: ");
			}
			return flavors.getFlavor(flavorChoice);
		}
		
		public static Topping getToppingChoice()
		{
			int toppingChoice = input.readInt("Enter your desired topping: ");
			while(toppingChoice < 1 || toppingChoice > 5)
			{
				System.out.println("Invalid option/n");
				int toppingChoice = input.readInt("Enter your desired topping: ");
			}
			return toppings.getTopping(toppingChoice);
		}
		
		public static int getScoopsChoice()
		{
			int scoopChoice = input.readInt("How many scoops (1, 2, or 3) would you like? ");
			while(scoopChoice < 1 || scoopChoice > 3)
			{
				System.out.println("Invalid option/n");
				int scoopChoice = input.readInt("How many scoops (1, 2, or 3) would you like? ");
			}
			return scoopChoice;
		}
		
		public static Cone getConeChoice()
		{
			int coneChoice = input.readInt("Would you like a 1: Sugar Cone, 2: Waffle Cone, or 3: Cup? ");
			while(coneChoice < 1 || coneChoice > 3)
			{
				System.out.println("Invalid option/n");
				int coneChoice = input.readInt("Would you like a 1: Sugar Cone, 2: Waffle Cone, or 3: Cup? ");
			}
			cone.setCone(coneChoice);
			return cone.getCone();
		}
	}
}
	