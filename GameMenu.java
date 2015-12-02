import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;



public class gameMenu {
  public static void main(String args[]){

  JFrame menuFrame = new JFrame("Main Menu");
  JPanel menuPanel = new JPanel();
  JPanel optionsPanel = new JPanel();
  JLabel statusLabel = new JLabel("", JLabel.CENTER);
  JLabel nameLabel = new JLabel("Name:",JLabel.LEFT);
  JLabel gridSizeLabel = new JLabel("Grid Size:", JLabel.LEFT);
  JLabel mineCountLabel = new JLabel("Number of Mines:", JLabel.LEFT);
  JTextField nameText = new JTextField("");
  JTextField gridSizeText = new JTextField("10");
  JTextField mineCountText = new JTextField("0");
  JButton startGameButton = new JButton("Start Game");
  JButton exitGameButton = new JButton("Exit Game");
  ImageIcon titleImage = new ImageIcon("titleImage.png");
  ImageIcon backImage = new ImageIcon("menuBack.png");
  JLabel titleLabel = new JLabel(titleImage);
  JLabel backLabel = new JLabel(backImage);
  Border blackBorder = BorderFactory.createLineBorder(Color.BLACK, 2);

  

  Color teal = new Color(2, 192, 180);
  Color orange = new Color(255, 153, 0);


  menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  menuFrame.setBounds(0,0,900, 600);

    optionsPanel.setLayout(null);
    optionsPanel.setBounds(225, 169, 450, 200);
    optionsPanel.setOpaque(true);
    optionsPanel.setBackground(Color.WHITE);
    optionsPanel.setBorder(blackBorder);
    menuFrame.add(optionsPanel);

    menuPanel.setLayout(null);
    menuPanel.setBounds(0, 0, 900, 600);
    menuPanel.setBackground(teal);
    menuPanel.setOpaque(false);
    menuFrame.add(menuPanel);

    titleLabel.setLayout(null);
    titleLabel.setBounds(218, 60, 465, 67);

    backLabel.setLayout(null);
    backLabel.setBounds(0,0, 900, 600);

    menuPanel.add(titleLabel);
    menuFrame.add(backLabel);

    nameText.setLayout(null);
    gridSizeText.setLayout(null);
    mineCountText.setLayout(null);

    nameText.setBounds(250, 30, 150, 40);
    gridSizeText.setBounds(250, 80, 150, 40);
    mineCountText.setBounds(250, 130, 150, 40);

    optionsPanel.add(nameText);
    optionsPanel.add(gridSizeText);
    optionsPanel.add(mineCountText);

    nameLabel.setLayout(null);
    gridSizeLabel.setLayout(null);
    mineCountLabel.setLayout(null);

    nameLabel.setBounds(50, 30, 150, 40);
    gridSizeLabel.setBounds(50, 80, 150, 40);
    mineCountLabel.setBounds(50, 130, 150, 40);

    optionsPanel.add(nameLabel);
    optionsPanel.add(gridSizeLabel);
    optionsPanel.add(mineCountLabel);

    startGameButton.setHorizontalTextPosition(SwingConstants.CENTER);
    exitGameButton.setHorizontalTextPosition(SwingConstants.CENTER);

    startGameButton.setLayout(null);
    exitGameButton.setLayout(null);

    startGameButton.setBounds(250, 420, 150, 40);
    exitGameButton.setBounds(500, 420, 150, 40);

    menuPanel.add(exitGameButton);
    menuPanel.add(startGameButton);

    statusLabel.setLayout(null);
    statusLabel.setBounds(400, 475, 120, 60);
    statusLabel.setOpaque(false);
    menuPanel.add(statusLabel);
 
    startGameButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Starting game...");
            statusLabel.setBackground(Color.WHITE);
            statusLabel.setBorder(blackBorder);
            statusLabel.setOpaque(true);
            menuPanel.repaint();
            String username = nameText.getText();
            int gridSize = Integer.parseInt(gridSizeText.getText());
            int mineCount = Integer.parseInt(mineCountText.getText());
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
