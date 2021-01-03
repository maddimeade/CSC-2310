//Cone class
class Cone
{
	private int coneType;

	//constructor
	public Cone(int coneType)
	{
		this.coneType = coneType;
	}
		
	//accessor
	public int getCone()
	{
		return coneType;
	}
	
	//mutator
	public void setCone(int coneType)
	{
		this.coneType = coneType;
	}
		
	//gets price of each cone type, default is cup
	public double getPrice()
	{
		//returning price of cone based on int entered by user
		switch (coneType)
		{
			case 1:
			//sugar cone
				return 0.59;
				break;
			case 2:
			//waffle cone
				return 0.79;
				break;
			case 3:
			//cup
				return 0.00;
				break;
			default:
			//cup
				return 0.00;
				break;
		}
	}
	
	//toString, gets string of the type of cone using integer parameter
	//default is cup
	public String getTypeOfCone()
	{
		//returning string of type of cone using int entered by user
		switch (coneType)
		{
			case 1:
				return "Sugar Cone";
				break;
			case 2:
				return "Waffle Cone";
				break;
			case 3:
				return "Cup";
				break;
			default:
				return "Cup";
				break;
		}
	}
}
