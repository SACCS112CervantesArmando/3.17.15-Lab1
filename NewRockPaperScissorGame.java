import javax.swing.JOptionPane;

public class NewRockPaperScissorGame {

	public static void main(String[] args){
	int numberOfGamePlays = 1;
			
	while (numberOfGamePlays<4)
				{
		   	String userChoice = JOptionPane.showInputDialog("Lets play Rock, Paper, Scissors!\nChoose your move: ");
		numberOfGamePlays++;
		   	
		   		if (userChoice.equalsIgnoreCase("rock"))
		   			{ String message = String.format("The computer chose paper, you lose!");
		   			JOptionPane.showMessageDialog(null,message);}
			
		   		else if (userChoice.equalsIgnoreCase("paper"))
		   			{String message = String.format("The computer chose paper, it's a tie!");
		   			JOptionPane.showMessageDialog(null,message);}
		   		else if (userChoice.equalsIgnoreCase("Scissors"))
		   			{String message = String.format("The computer chose paper, you win!");
		   			JOptionPane.showMessageDialog(null,message);}
		   		else
		   		
		   			JOptionPane.showMessageDialog(null,"Invalid response!");  	
		   		
		   		String userChoice2 = JOptionPane.showInputDialog("Do you want to play again?");
		   			
		   			if (userChoice2.equalsIgnoreCase("yes")){
		   					String message = String.format("Glad to hear, try again");
		   					JOptionPane.showMessageDialog(null, message);}
		   			else if(userChoice2.equalsIgnoreCase("no")){
		   					String message= String.format("too bad try again");
		   					JOptionPane.showMessageDialog(null,message);}
		   			else 
		   				
   						JOptionPane.showMessageDialog(null,"Invalid response!");
		}
	}
}
