import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner (System.in);
		String name = "";
		String play = "yes";
		String faceOrRun = "";
		int numberOfHeads;
		String weapon = "";
		String eyeColor = "";
		String dragonName = "";
		
		System.out.println("Welcome!  What is your name?");
		name = scan1.nextLine();
		
	
		System.out.println("Would you like to play a game?  Enter yes or no");
		play = scan1.nextLine();
		if (play.equalsIgnoreCase("yes"))
		{System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you do? (enter face the beast or run away)");
		faceOrRun = scan1.nextLine();
		//String faceOrRunDecision = "";
		
		switch (faceOrRun)
		{case "face the beast": break; 
		 case "run away": play = "no";
		 System.out.println("See you later or should I say bwak bwak (chicken noises)?");
		 break;	
			
		}	
		
		while (play.equalsIgnoreCase("yes"))
		{
		
		System.out.println("You approach the dragon. You see that he has __ heads.  Enter 1, 2, or 3");
		numberOfHeads =scan1.nextInt();
		scan1.nextLine();
		switch (numberOfHeads)
		{case 3: System.out.println("No one has ever faced a 3 headed dragon before!"); 		
		break;
		case 2: System.out.println("A few people have faced a 2 headed dragon, but it's still pretty impressive");
		break;
		case 1: System.out.println("My neice could take out a one headed dragon in her sleep, but I suppose you will still get a bit of applause if you are successful.");
		break;
		}
		
		System.out.println("Choose your weapon (enter slingshot or sword or bow and arrow)");
		weapon = scan1.nextLine();
		System.out.println("Armed with your " + weapon + ", you approach the dragon.  You can feel its fiery breath as you get closer.  It stares at you with its __ eyes.  enter red or blue");
		eyeColor = scan1.nextLine();
		switch (eyeColor)
		{case "red":
		 System.out.println("Oh thank goodness! Red-eyed dragons are friendly.  You pet it and become friends.  You name the dragon __.  enter a name");
		 dragonName=scan1.nextLine();
		 System.out.println(name + "and " + dragonName + " live happily ever after!");
		 break;
		case "blue":
		System.out.println("It was nice knowing you.  Sorry about how this all turned out");
		 break;
		}
		play = "no";
		scan1.close();
		
		}
		
			
		}
		
		}
	      
		

	       
	        
	}


