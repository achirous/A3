import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class gameMenu {
	public static void main(String args[]){

	JFrame menuFrame = new JFrame("Main Menu");
	JPanel menuPanel = new JPanel();
	JButton startGameButton = new JButton("Start Game");
	JButton exitGameButton = new JButton("Exit Game");
	JLabel statusLabel = new JLabel("",JLabel.CENTER);

	Color teal = new Color(2, 192, 180);
	Color orange = new Color(255, 153, 0);

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	int scrnWidth = 4*(screenSize.width/5);
	int scrnHeight = 4*(screenSize.height/5);
	//int statusLabelWidth = scrnWidth*0.05;

	menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menuFrame.setBounds(0,0,scrnWidth, scrnHeight);

    menuPanel.setLayout(null);
    menuPanel.setBounds(0, 0, 4*scrnWidth, scrnHeight);
    menuPanel.setBackground(teal);
    menuFrame.add(menuPanel);

    startGameButton.setHorizontalTextPosition(SwingConstants.CENTER);
    exitGameButton.setHorizontalTextPosition(SwingConstants.CENTER);

    startGameButton.setLayout(null);
    exitGameButton.setLayout(null);

    startGameButton.setBounds(1*(scrnWidth)/5, 3*(scrnHeight)/5, 200, 40);
    exitGameButton.setBounds(3*(scrnWidth)/5, 3*(scrnHeight)/5, 200, 40);

    menuPanel.add(exitGameButton);
  	menuPanel.add(startGameButton);

  	statusLabel.setLayout(null);
  	statusLabel.setBounds((((scrnWidth)/2)-50), 3*(scrnHeight)/4, 100, 100);
  	menuPanel.add(statusLabel);
  	


    startGameButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Starting game...");
         }          
      });

    exitGameButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             System.exit(0);
         }          
      });





	
    menuFrame.setLocationRelativeTo(null);
    menuFrame.setVisible(true);















	}
}	
