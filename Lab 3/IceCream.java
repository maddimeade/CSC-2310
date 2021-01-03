//IceCream class
class IceCream
{
	private Flavor flavor;
	private Topping topping;
	private int scoops;
		
	/*if(scoops > 3 || scoops < 1)
	{
		scoops = 3;
	}*/
		
	//constructor
	public IceCream(Flavor flavor, Topping topping, int scoops)
	{
		this.flavor = flavor;
		this.topping = topping;
		this.scoops = scoops;	
	}
	
	public double getPrice()
	{
		double price;
		//returning price based on number of scoops
		switch (scoops)
		{
			case 1:
				price = topping.price();
				return price;
				break;
			case 2:
				price = topping.price() + 0.75;
				return price;
				break;
			case 3:
				price = topping.price() + (0.75 * 2);
				return price;
				break;
			default:
			//3 scoops for default
				price = topping.price() + (0.75 * 2);
				return price;
				break;
		}
	}
		
	public String returnList()
	{
		Toppings toppings = Toppings.getToppings();
		Flavors flavors = Flavors.getFlavors();
		
		String flavorsString = flavors.getFlavor();//help
		String toppingsString = toppings.getTopping();//help
		
		String finalString = ("/nFlavor: " + flavorsString + "/nTopping: " + toppingsString + "/nNumber of scoops: " +  scoops);
		return finalString;
	}
}