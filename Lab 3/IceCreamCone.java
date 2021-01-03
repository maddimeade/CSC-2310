//IceCreamCone class
class IceCreamCone
{
	private IceCream iceCream;
	private Cone cone;
	
	//constructor
	public IceCreamCone(IceCream iceCream)
	{
		if(iceCream == null)
		{
			iceCream = new IceCream(Flavors.getFlavors().getFlavor(1), Toppings.getToppings().getTopping(2), 3);
		}
		
		else
		{
			this.iceCream = iceCream;
			this.cone = cone;
		}
		
	}
		
	public double getPrice()
	{
		int coneInt = cone.getCone();
		
		//calling method to get cone priceString
		double conePrice = cone.getPrice();
			
		//calling method to get price of scoops and toppings 
		double iceCreamPrice = iceCream.getPrice();
		
		double totalPrice = conePrice + iceCreamPrice + 1.99;
		return totalPrice;
	}
		
	public String fullOrder()
	{
		String list = iceCream.returnList();
				
		double price = getPrice();
		String priceString = formatCurrency();
			
		//calling method to get cone type string
		String coneType = cone.getTypeOfCone();
		
		String finalOrder = ("\nYour order\nCone: " + coneType + list + "/nPrice: " + priceString);
		
		return finalOrder;
	}
}