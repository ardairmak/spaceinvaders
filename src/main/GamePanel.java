package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Entity.Player;
import Entity.PurpleAlien;
import tile.TileManager;
import Entity.BlueAlien;
import Entity.Bullet;
import Entity.GreenAlien;
import Entity.GreenAlienTongue;
import Entity.GreenAlienUpsideDown;
import Entity.GreenSmileyAlien;
import Entity.OctopusAlien;
import Entity.Alien;


public class GamePanel extends JPanel implements Runnable{
	
	//SCREEN SETTINGS
		final int originalTileSize = 16;
		final int scale = 3;
		public final int tileSize = originalTileSize * scale;
		public final int maxScreenCol = 16;
		public final int maxScreenRow = 12;
		public final int screenWidth = maxScreenCol * tileSize;
		public final int screenHeight = maxScreenRow * tileSize;
		
		//WORLD SETTINGS
		
		public final int maxWorldCol = 16;
		public final int maxWorldRow = 125;	
		public final int worldWidth = tileSize * maxWorldCol;
		public final int worldHeight = tileSize * maxWorldRow;
		
		//FPS
		
		int FPS = 60;
		
		//PAUSE SETTING
		
		protected boolean paused = false;
		
		
		//GAME LEVEL
		private int level;
		
		//PLAYER SETTING
		public int score;
		public String username;
		
		//GAME OVER STATE
	    private boolean gameOver = false;
	    
	    //GAME SOUND
	    private Clip gameMusicClip;
	    private AudioInputStream gameMusicAudio;
	    
	    private Clip levelCompletedClip;
	    private AudioInputStream levelCompletedAudio;

		
		
		
		
		Thread gameThread;
		KeyHandler keyHandler = new KeyHandler(this);
		MouseHandler mouseHandler = new MouseHandler(this);
		public Player player = new Player(this,keyHandler,mouseHandler);
		TileManager tileM = new TileManager(this);
		
		//DUMMY ALIEN OBJECTS TO SETUP THE ALIENS
		
		Alien alien = new Alien(this,0,0,0,0,0);
		GreenAlien greenAlien = new GreenAlien(this, 0, 0, 0,0,0);
		BlueAlien blueAlien = new BlueAlien(this,0,0,0,0,0);
		PurpleAlien purpleAlien = new PurpleAlien(this,0,0,0,0,0);
		OctopusAlien octopusAlien = new OctopusAlien(this,0,0,0,0,0);
		GreenSmileyAlien greenSmileyAlien = new GreenSmileyAlien(this,0,0,0,0,0);
		GreenAlienUpsideDown greenAlienUpsideDown = new GreenAlienUpsideDown(this,0,0,0,0,0);
		GreenAlienTongue greenAlienTongue = new GreenAlienTongue(this,0,0,0,0,0);
		
		
		public List<Bullet> bulletList = new ArrayList<>();
		public List<Alien> alienList = new ArrayList<>();

		
	
	
	public GamePanel(){
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyHandler);
		this.addMouseListener(mouseHandler);
		this.addMouseMotionListener(mouseHandler);
		this.setFocusable(true);
		loadSounds();
	}
	
	public void setupAliens() {
		if (level == 1) {
			greenAlien.setGreenAliensLevel1();
			blueAlien.setBlueAliensLevel1();
			purpleAlien.setPurpleAliensLevel1();
			octopusAlien.setOctopusAliensLevel1();
			greenSmileyAlien.setGreenSmileyAliensLevel1();
			greenAlienUpsideDown.setGreenUpsideAliensLevel1();
			greenAlienTongue.setGreenTongueAliensLevel1();
			
		}
		else if (level == 2) {
			greenAlien.setGreenAliensLevel2();
			blueAlien.setBlueAliensLevel2();
			purpleAlien.setPurpleAliensLevel2();
			octopusAlien.setOctopusAliensLevel2();
			greenSmileyAlien.setGreenSmileyAliensLevel2();
			greenAlienUpsideDown.setGreenUpsideAliensLevel2();
			greenAlienTongue.setGreenTongueAliensLevel2();
		}
		else if (level == 3) {
			greenAlien.setGreenAliensLevel3();
			blueAlien.setBlueAliensLevel3();
			purpleAlien.setPurpleAliensLevel3();
			octopusAlien.setOctopusAliensLevel3();
			greenSmileyAlien.setGreenSmileyAliensLevel3();
			greenAlienUpsideDown.setGreenUpsideAliensLevel3();
			greenAlienTongue.setGreenTongueAliensLevel3();
		}
		else {
			greenAlien.setGreenAliensLevel1();
			blueAlien.setBlueAliensLevel1();
			purpleAlien.setPurpleAliensLevel1();
			octopusAlien.setOctopusAliensLevel1();
			greenSmileyAlien.setGreenSmileyAliensLevel1();
			greenAlienUpsideDown.setGreenUpsideAliensLevel1();
			greenAlienTongue.setGreenTongueAliensLevel1();
		}
		
	}
	private void loadSounds() {
	    try {
	        gameMusicAudio = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/gameSound.wav"));
	        gameMusicClip = AudioSystem.getClip();
	        gameMusicClip.open(gameMusicAudio);
	        
	        levelCompletedAudio = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/levelFinished.wav"));
	        levelCompletedClip = AudioSystem.getClip();
	        levelCompletedClip.open(levelCompletedAudio);
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	protected void stopGameMusic() {
	    gameMusicClip.stop();
	}
	protected void startGameMusic() {
	    gameMusicClip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	private void startLevelCompleteMusic() {
		levelCompletedClip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	@Override
	public void run() {
	    
		double drawInterval = 1000000000/FPS;
		double nextDrawTime = System.nanoTime() + drawInterval;
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) {
			
			
			if (!paused) {
		        update();
		        repaint();
		        drawCount++;
		    }
			
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/1000000;
				
				if(remainingTime < 0) {
					remainingTime = 0;
				}
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				timer += (nextDrawTime - System.nanoTime());
				if(timer >= 1000000000) {
					int currentFPS = drawCount;
					System.out.println("FPS: "+ currentFPS);
					this.setFPS(currentFPS);
					drawCount = 0;
					timer = 0;
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void update() {
		
		 if (player.getProgressPercentage() >= 100) {
		        
		        paused = true;
		        stopGameMusic();
		        saveScore(username,score);
		        startLevelCompleteMusic();
		        
		        SwingUtilities.invokeLater(() -> {
		            JOptionPane.showMessageDialog(GamePanel.this, "Congratulations! The level is completed!");
		            
		            System.exit(0);
		        });
		    }
		
		 if (!gameOver) {
			player.update();
			
			if (player.getPlayerHealth() <= 0) {
                
				saveScore(username,score);
				gameOver = true;
            }
		    for (Bullet bullet : bulletList) {
		        
		    	bullet.update();
		    }
		    
		List<Alien> aliensToRemove = new ArrayList<>();

	    for (Alien alien : alienList) {
	        
	    	if (alien != null) {
	            alien.update();
	            
	            if (alien.getAlienHealth() <= 0) {
	                aliensToRemove.add(alien);
	                alien.destroyAlienSound();
	                
	            }
	        }
	    }

	    alienList.removeAll(aliensToRemove);
		}
	    
		
		
}
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	
		if (!gameOver) {
			
			tileM.draw(g2);
			player.draw(g2);
			
			for (Bullet bullet : bulletList) {
		        bullet.draw(g2);
		    }
			
			for (Alien alien : alienList) {
		        alien.draw(g2);
		    }
			
			this.draw(g2);
			g2.dispose();
	    }
		else {
			stopGameMusic();
			((MainPanel) getParent()).showGameOverPanel();
			((MainPanel) getParent()).gameOverPanel.playGameOverSound();;
			
		}
	
	}
	
	public void addBullet(Bullet bullet) {
		
		bulletList.add(bullet);
		System.out.println(bulletList.size());
	}
	
	
	public void draw(Graphics2D g2) {
		
		//DRAW THE FPS
		
		g2.setColor(Color.red);
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        String fpsText = "FPS: " + FPS;
        g2.drawString(fpsText, 700, 20);
        
        //DRAW PROGRESS BAR AS PERCENTAGE
        g2.setColor(Color.red);
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        String progressText = player.getProgressPercentage() + "%";
        g2.drawString(progressText, 100, 20);
        
        
        // DRAW PLAYER HEALTH
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        g2.setColor(Color.red);
        String healthText = "♥ x" + player.getPlayerHealth();
        g2.drawString(healthText, 150, 20);
        
        //DRAW LEVEL
        g2.drawString("LEVEL " + level, 10, 20);

        //DRAW PLAYER SCORE
        g2.setFont(new Font("Arial", Font.BOLD, 20));
        g2.setColor(Color.red);
        String scoreText = "Score: " + score;
        FontMetrics fontMetrics = g2.getFontMetrics();
        int textWidth = fontMetrics.stringWidth(scoreText);
        int textHeight = fontMetrics.getHeight();
        int x = (getWidth() - textWidth) / 2;
        int y = textHeight;
        g2.drawString(scoreText, x, y);
        
        
	}
	
	public void setFPS(int fps) {
		this.FPS = fps;
	}
	
	public void togglePause() {
		paused = !paused;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	private void saveScore(String username, int score) {
	    
		File inputFile = new File("highscores.txt");
	    File tempFile = new File("temp.txt");

	    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

	        String currentLine;
	        boolean usernameExists = false;

	        while ((currentLine = reader.readLine()) != null) {
	            String[] parts = currentLine.split(" ");
	            String existingUsername = parts[0];
	            int existingScore = Integer.parseInt(parts[1]);

	            if (existingUsername.equals(username)) {
	                usernameExists = true;
	                if (existingScore < score) {
	                    writer.write(username + " " + score);
	                } else {
	                    writer.write(currentLine);
	                }
	            } else {
	                writer.write(currentLine);
	            }

	            writer.newLine();
	        }

	        if (!usernameExists) {
	            writer.write(username + " " + score);
	            writer.newLine();
	        }

	        reader.close();
	        writer.close();

	        inputFile.delete();
	        tempFile.renameTo(inputFile);
	       
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
}