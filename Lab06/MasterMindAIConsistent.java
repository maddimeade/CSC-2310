//Maddison Davenport and Nathan Sexton

import java.util.ArrayList;
import java.util.List;

public class MasterMindAIConsistent implements MasterMindAI
{
   private MasterMind game;

   public MasterMindAIConsistent(MasterMind game)  
   {
      this.game = game;
   }

    //DO THIS
   public Guess nextGuess(int guess_id)
   {
      List<Guess> guesses = game.getGuesses();
      int num_guesses = guesses.size();
      Guess nextGuess = null;

      if (guesses.size() > 0)
      {
         Guess trialGuess = null;

         boolean good = false;
         //keep obtaining a random guess until you get one that works with all previous results
         //it is cheating to keep obtaining a random guess until you match the solution
		 //make a random guess and then analyze it

		while(good == false)
		{
			trialGuess = makeRandomGuess(guess_id);
			good = analyzeGuess(trialGuess);
		}
 
         nextGuess = trialGuess;  //found a good one
      }
      else
      {
         nextGuess = makeRandomGuess(guess_id);
      }

      return nextGuess;
   }
   
   //DO THIS
   //is the guess consistent with all previous results?
   //that is, if you compare your random guess to a previous guess, do you get the same number of black and white buttons?
   //don't just check your random guess against the secret guess until you get a good result
   private boolean analyzeGuess(Guess nextGuess)
   {
      List<Guess> guesses = game.getGuesses();  //get all previous guesses from the game
      int num_guesses = guesses.size();

      //loop over all previous guesses
      for (int i = 1; i < guesses.size(); i++) //note that i is starting at 1!
      {
		//previous guess compared to the secret guess (obtain the int array through the game ref)
		int[] previousGuess = game.getResult(guesses.get(i));
			
		//next guess is compared to previous guesses, NOT the secret guess
		int[] next = game.getResult(nextGuess, guesses.get(i)); 
		
		//if our previous number of black buttons is not equal to the next number black buttons
		//or if our previous number of white buttons is not equal to the next number of white buttons return false
		if (previousGuess[0] != next[0] || previousGuess[1] != next[1])
         {
            return false;
         }
      }

      return true;
   }

  
 
   //DO THIS
   //use the Random class to make a randomly generated guess
   private static Guess makeRandomGuess(int guess_id)
   {
      Guess randomGuess = new Guess(guess_id);
      Random random = Random.getRandomNumberGenerator();

		for (int i = 1; i <= 4; i++)
		{
			 int random_int = random.randomInt(1, 7);
			 //add the random int to your guess list
			 randomGuess.addGuess(random_int);
		}
		  return randomGuess;
   }
}