import java.awt.*;
import javax.swing.*;



public class GameMenu {
	public static void main(String args[]){

	JFrame menuFrame = new JFrame("Main Menu");


	menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    menuFrame.setBounds(0,0,screenSize.width, screenSize.height);
    JPanel backgroundPanel = new JPanel(new BorderLayout(screenSize.width, screenSize.height));
    

	backgroundPanel.setBackground(Color.RED);
	backgroundPanel.setOpaque(true);
	backgroundPanel.setVisible(true); 

    menuFrame.setLocationRelativeTo(null);
    menuFrame.setVisible(true);

