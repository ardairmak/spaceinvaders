package main;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainPanel extends JPanel{
	
	WelcomePanel welcomePanel = new WelcomePanel();
	HighScorePanel highScorePanel = new HighScorePanel();
	GamePanel gamePanel = new GamePanel();
	GameOverPanel gameOverPanel = new GameOverPanel();
	public CardLayout cardPanel = new CardLayout();

		
	public MainPanel(){
		
		setLayout(cardPanel);
		this.setPreferredSize(new Dimension(768,576));
		
		add(welcomePanel,"Welcome");
		add(highScorePanel,"HighScore");
		add(gamePanel,"Game");
		add(gameOverPanel,"GameOver");
		
		
		
	}
	
	public static void main(String []args) {
		
		JFrame window = new JFrame("Space Invaders");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		
		JMenuItem register = new JMenuItem("Register");
		JMenuItem playGame = new JMenuItem("Play Game");
		JMenuItem highScore = new JMenuItem("High Score");
		JMenuItem quit = new JMenuItem("Quit");
		JMenuItem about = new JMenuItem("About");
		
		fileMenu.add(register);
		fileMenu.add(playGame);
		fileMenu.add(highScore);
		fileMenu.add(quit);
		helpMenu.add(about);
		
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		menuBar.setBounds(0,0,768,20);
		window.add(menuBar);
		window.setJMenuBar(menuBar);
		
		MainPanel mainPanel = new MainPanel();
		window.add(mainPanel);
		
		window.pack();
		window.setLocationRelativeTo(null);
		
		
		quit.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		about.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Developer Name : Arda Irmak\nStudent Number : 20210702064\nE-Mail: arda.irmak@std.yeditepe.edu.tr","Developer Info", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		
		highScore.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				mainPanel.cardPanel.show(mainPanel, "HighScore");
				
			}
			
		});
		
		playGame.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				JFrame loginPopUp = new JFrame("Login");
				loginPopUp.setSize(new Dimension(200,300));
				loginPopUp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				loginPopUp.setLocationRelativeTo(null);
				loginPopUp.setLayout(null);
				loginPopUp.getContentPane().setBackground(Color.black);
				
				JLabel username = new JLabel("Username");
				username.setFont(new Font("Arial",Font.BOLD,13));
				username.setBounds(30,40,120,20);
				username.setForeground(Color.white);
				
				JLabel password = new JLabel("Password");
				password.setBounds(30,90,120,20);
				password.setFont(new Font("Arial",Font.BOLD,13));
				password.setForeground(Color.white);
				
				JTextField usernameField = new JTextField();
				usernameField.setBounds(30, 65, 120, 20);
				
				JPasswordField passwordField = new JPasswordField();
				passwordField.setBounds(30, 115, 120, 20);
				
                JButton loginButton = new JButton("Register");
				loginButton.setBounds(30,210,120,30);
				loginButton.addActionListener(new java.awt.event.ActionListener() {
		                public void actionPerformed(ActionEvent e) {
		                    String username = usernameField.getText();
		                    String password = new String(passwordField.getPassword());

		                    boolean loggedIn = false;

		                    try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
		                        String line;
		                        while ((line = reader.readLine()) != null) {
		                            String[] parts = line.split(" ");
		                            String storedUsername = parts[0];
		                            String storedPassword = parts[1];

		                            if (username.equals(storedUsername) && password.equals(storedPassword)) {
		                                loggedIn = true;
		                                break;
		                            }
		                        }
		                    } catch (IOException ex) {
		                        ex.printStackTrace();
		                    }

		                    if (loggedIn) {
		                        JOptionPane.showMessageDialog(null, "Login successful!", "Success",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        loginPopUp.dispose();
		                     
		                        //ASK FOR LEVEL
		                        JFrame levelFrame = new JFrame("Choose Level Difficulty");
		                        levelFrame.setSize(new Dimension(260, 70));
		                        levelFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		                        levelFrame.setLocationRelativeTo(null);
		                        levelFrame.setLayout(new FlowLayout());
		                        levelFrame.getContentPane().setBackground(Color.BLACK);
		                        
		                        JButton noviceButton = new JButton("Level 1");
		                        JButton intermediateButton = new JButton("Level 2");
		                        JButton advancedButton = new JButton("Level 3");
		                        
		                        noviceButton.setFocusable(false);
		                        intermediateButton.setFocusable(false);
		                        advancedButton.setFocusable(false);

		                        levelFrame.add(noviceButton);
		                        levelFrame.add(intermediateButton);
		                        levelFrame.add(advancedButton);

		                        noviceButton.addActionListener(new java.awt.event.ActionListener() {
		                            public void actionPerformed(ActionEvent e) {
		    
		                              
		                                levelFrame.dispose();
		                                
		                                mainPanel.gamePanel.username = username;
		                                mainPanel.gamePanel.setLevel(1);
		                        	    mainPanel.cardPanel.show(mainPanel, "Game");
		                        	    mainPanel.welcomePanel.stopSound();
		                        	    mainPanel.gamePanel.setupAliens();
		                        	    mainPanel.gamePanel.startGameThread();
		                        	    mainPanel.gamePanel.requestFocusInWindow();
		                        	    mainPanel.gamePanel.startGameMusic();
		                        	  
		                            }
		                        });

		                        intermediateButton.addActionListener(new java.awt.event.ActionListener() {
		                            public void actionPerformed(ActionEvent e) {
		                               
		                                levelFrame.dispose();
		                                
		                                mainPanel.gamePanel.username = username;
		                                mainPanel.gamePanel.setLevel(2);
		                                mainPanel.cardPanel.show(mainPanel, "Game");
		                                mainPanel.welcomePanel.stopSound();
		                                mainPanel.gamePanel.setupAliens();
		                                mainPanel.gamePanel.startGameThread();
		                                mainPanel.gamePanel.requestFocusInWindow();
		                                mainPanel.gamePanel.startGameMusic();
		                              
		                            }
		                        });

		                        advancedButton.addActionListener(new java.awt.event.ActionListener() {
		                            public void actionPerformed(ActionEvent e) {
		                                
		                                levelFrame.dispose();
		                                
		                                mainPanel.gamePanel.username = username;
		                                mainPanel.gamePanel.setLevel(3);
		                                mainPanel.cardPanel.show(mainPanel, "Game");
		                                mainPanel.welcomePanel.stopSound();
		                                mainPanel.gamePanel.setupAliens();
		                                mainPanel.gamePanel.startGameThread();
		                                mainPanel.gamePanel.requestFocusInWindow();
		                                mainPanel.gamePanel.startGameMusic();
		                                
		                            }
		                        });
		                        levelFrame.setVisible(true);
		                    }
		                        
					
		                    else {
		                        JOptionPane.showMessageDialog(null, "Invalid username or password!\nCreate and account if you don't have one!", "Error",
		                                JOptionPane.ERROR_MESSAGE);
		                        loginPopUp.dispose();
		                    }
		                }
		            });

	            loginPopUp.add(username);
	            loginPopUp.add(usernameField);
	            loginPopUp.add(password);
	            loginPopUp.add(passwordField);
	            loginPopUp.add(loginButton);
	            loginPopUp.setVisible(true);

			}
			
		});
		
		register.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent e) {
				JFrame registerPopUp = new JFrame("Register");
				registerPopUp.setSize(new Dimension(200,300));
				registerPopUp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				registerPopUp.setLocationRelativeTo(null);
				registerPopUp.setLayout(null);
				registerPopUp.getContentPane().setBackground(Color.black);
				
				JLabel username = new JLabel("Username");
				username.setFont(new Font("Arial",Font.BOLD,13));
				username.setBounds(30,40,120,20);
				username.setForeground(Color.white);
				
				JLabel password = new JLabel("Password");
				password.setBounds(30,90,120,20);
				password.setFont(new Font("Arial",Font.BOLD,13));
				password.setForeground(Color.white);
				
				JTextField usernameField = new JTextField();
				usernameField.setBounds(30, 65, 120, 20);
				
				JPasswordField passwordField = new JPasswordField();
				passwordField.setBounds(30, 115, 120, 20);
				
				JLabel confirmPassword = new JLabel("Confirm Password");
                confirmPassword.setForeground(Color.WHITE);
                confirmPassword.setBounds(30, 140, 120, 20);
                confirmPassword.setFont(new Font("Arial",Font.BOLD,13));
                
                JPasswordField confirmPasswordField = new JPasswordField();
                confirmPasswordField.setBounds(30, 165, 120, 20);
				
				JButton registerButton = new JButton("Register");
				
				registerButton.setBounds(30,210,120,30);
				
				registerButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String username = usernameField.getText();
                        String password = new String(passwordField.getPassword());
                        String confirmPassword = new String(confirmPasswordField.getPassword());

                        if(password.equals(confirmPassword)) {
                        	try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                                writer.write(username + " " + password);
                                writer.newLine();
                                writer.flush();
                                JOptionPane.showMessageDialog(null, "Registration successful!", "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                                registerPopUp.dispose();
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Error occurred during registration!", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        
                        }
                        else {
                        	 JOptionPane.showMessageDialog(null, "Passwords doesn't match. Please try again.", "Error",
                                     JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                registerPopUp.add(username);
                registerPopUp.add(usernameField);
                registerPopUp.add(password);
                registerPopUp.add(passwordField);
                registerPopUp.add(registerButton);
                registerPopUp.add(confirmPassword);
                registerPopUp.add(confirmPasswordField);
                registerPopUp.setVisible(true);
            }
        });
    }
	public void showGameOverPanel() {
	    cardPanel.show(this, "GameOver");
	}
	


	
}