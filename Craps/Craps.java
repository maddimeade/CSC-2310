/*
Maddison Davenport
Nathan Sexton
01/30/2020
CSC 2310-104
*/

public class Craps
{

   public static int playCraps(int num_rolls)
   {
     CrapsDice dice = new CrapsDice();
	 int num = 0;
	 int result;
	 
	 for(int i = 0; i < num_rolls; i++)
	 {
		 result = dice.roll();
		 
		 if(result == 2 || result == 3 || result == 12)
		 {
			 num++;
		 }
	 }
	 
	 return num;
   }
   public static void main(String[] args)
   {
      
	int num_rolls = 752;
	double percentage = 0.0;
	int num = playCraps(num_rolls);
	
	percentage = (double)num / num_rolls;
	percentage = percentage * 100;
	
	System.out.println("The percentage of a 2, 3, or 12 being rolled is " + percentage + "%.");	  
   }

}