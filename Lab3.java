import java.util.Scanner;
public class Lab3 {

	    public static void main(String[] args) {
			Scanner inp = new Scanner( System.in );
			int userNum;
			int computerNum;
			int round=1;
			String playerAnswer;


		do {
			computerNum = 0 + (int) ( Math.random() * 10 );
			System.out.println ("Enter a number between 0 and 10");
			userNum = inp.nextInt();
			System.out.printf ("Random number is %d\n", computerNum );round++;
			if (userNum > computerNum)		{
				System.out.println ("Too big");
			}
			else if (userNum < computerNum)		{
				System.out.println ("Too Small");
			}
			else		{
				System.out.println ("Match");
			}
			
			System.out.print("Do you want to play again? ");
			playerAnswer = inp.next();
	
			if(playerAnswer.equalsIgnoreCase("yes")){
				}
			else
				System.out.print("Sorry to see you go");
			
		}
			while(round<4);
		
	    }
        
    }
