package minesweeper.GruppeT;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import minesweeper.GruppeT.model.Game;
import minesweeper.GruppeT.view.View;
/**
 * Main class for the Minesweeper Game
 * shows a Dialog after Startup to choose the difficulty level
 * @author Patrik Balazs
 *
 */
public class Minesweeper {
	
	
	
    public static void main(String[] argv) throws IOException {
    		
    	Game model= null;
    	
    	// Create Dialogs
    	JOptionPane.showMessageDialog(null, "Minesweeper game built with Java! Click Ok and select game difficulty!");
    	JOptionPane.showMessageDialog(null, "There are 3 difficulty levels: Easy(1), Medium(2), Hard(3)");
    	JOptionPane.showMessageDialog(null, "1 -> 9*9 with 10 mines" + "\n" + "2 -> 16*16 with 40 mines" + "\n" + "3 -> 30*16 with 99 mines");
    	String input = JOptionPane.showInputDialog(null, "Please type in the selected difficulty" , "Choose difficulty");
   		
    	// Check whether the selected difficulty is existing
    	if(input.equals("1")) {
    		model = new Game(9,9,10);
    	} else if (input.equals("2")) {
    		model = new Game(16,16,40);
    	} else if (input.equals("3")) {
    		model = new Game(30,16,99);
    	// If the selected difficulty is not existing, creates an error message
    	} else {
    		JOptionPane.showMessageDialog(null, 
    				  "You have selected a non-existing difficulty level!" + "\n" + "Please restart the application and select difficulty level 1, 2 or 3." , "Difficulty level not existing", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	View view = new View(model);     
    	
        JFrame gameFrame = new JFrame("Minesweeper");

        gameFrame.setContentPane(view);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setAlwaysOnTop(true);

    }
}

