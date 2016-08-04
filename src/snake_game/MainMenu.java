package snake_game;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * This class creates the Main Menu for the Snake Game.
 * @author Marcellis Carr-Barfield
 *
 */

public class MainMenu extends JFrame implements KeyListener, MouseListener, ActionListener {
	private JFrame mainMenu; 
	
	//create instance variables for menu selections
	private static boolean startGame = false;
	Button start = new Button("Start Game");
	
	public MainMenu(){
		//add the main menu to the key and mouse listeners
		this.addMouseListener(this);
		this.addKeyListener(this);
		
		mainMenu = new JFrame("Snake Game");
		mainMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainMenu.add(start, BorderLayout.CENTER);
		start.addActionListener(this);
		
		mainMenu.pack();
		mainMenu.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == start){
			startGame = true;
			start.setLabel("Started Game: " + startGame);
		}
	}
	
}
