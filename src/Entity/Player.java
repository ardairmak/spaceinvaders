package Entity;

import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import main.GamePanel;
import main.KeyHandler;
import main.MouseHandler;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Player extends Entity{

	KeyHandler keyHandler;
	MouseHandler mouseHandler;
	
	public final int screenX;
	public final int screenY;
	
	public int playerX;
	public int playerY;
	
	private int prevMouseX;
    private int prevMouseY;
	
	
	private long lastCollisionTime = 0;
	
	
	private boolean shooting = true;
	private long lastShotTime; 
	private long shootCooldown = 200;
	
	private Clip shootClip;
	private Clip hitClip;
	
	
	public int playerHealth = 3;
	
	private int progressPercentage = 0;
	
	
	public Player(GamePanel gp,KeyHandler keyH,MouseHandler mouseH) {
		
		super(gp);
		this.keyHandler = keyH;
		this.mouseHandler = mouseH;
		
		screenX = gp.maxScreenCol * gp.tileSize;
		screenY = gp.maxScreenRow * gp.tileSize;
		
		playerX = gp.screenWidth/2 - (gp.tileSize/2);
		playerY = gp.screenHeight/2 - (gp.tileSize/2);
		
		
		setDefaultValues();
		//getPlayerImage();
		loadShootSound();
		loadHitSound();
	}
	
	public void setDefaultValues() {
		
		worldX = gp.tileSize * 6;
		worldY = gp.tileSize * 123;
		worldSpeed = 1;
		speed = 3;
	}
	
	public void getPlayerImage() {
		try {
			
			ship1 = ImageIO.read(getClass().getResourceAsStream("/player/ship1.png"));
			ship2 = ImageIO.read(getClass().getResourceAsStream("/player/ship2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    private void loadShootSound() {
        try {
            URL soundURL = getClass().getResource("/sounds/shoot.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL);
            shootClip = AudioSystem.getClip();
            shootClip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    private void loadHitSound() {
        try {
            URL soundURL = getClass().getResource("/sounds/playerHit.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL);
            hitClip = AudioSystem.getClip();
            hitClip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    private void playShootSound() {
        if (shootClip == null) {
            System.err.println("Shoot sound clip is null. Make sure the sound file is loaded correctly.");
            return;
        }

        if (shootClip.isRunning()) {
            shootClip.stop();
        }
        shootClip.setFramePosition(0);
        shootClip.start();
    }
    private void playHitSound() {
        if (hitClip == null) {
            System.err.println("Shoot sound clip is null. Make sure the sound file is loaded correctly.");
            return;
        }

        if (hitClip.isRunning()) {
            hitClip.stop();
        }
        hitClip.setFramePosition(0);
        hitClip.start();
    }
	
	public void update() {
	    
		    int mouseX = MouseInfo.getPointerInfo().getLocation().x;
	        int mouseY = MouseInfo.getPointerInfo().getLocation().y;

	        int xDiff = mouseX - prevMouseX;
	        int yDiff = mouseY - prevMouseY;

	        if (xDiff > 0) {
	            playerX += speed; 
	        } else if (xDiff < 0) {
	            playerX -= speed; 
	        }

	        if (yDiff > 0) {
	            playerY += speed; 
	        } else if (yDiff < 0) {
	            playerY -= speed; 
	        }

	        prevMouseX = mouseX;
	        prevMouseY = mouseY;
	        
	    if (mouseHandler.isLeftButtonClicked() && canShoot()) {
	        shootBullet();
	        playShootSound();
	    }

		 
		if (keyHandler.upPressed) {
			
			if (playerY - speed >= 0) {
	            playerY -= speed;
	        }
			
	        
	    }
	    if (keyHandler.downPressed) {

	    	if (playerY + gp.tileSize + speed <= screenY) {
	            playerY += speed;
	        }

	    }
	    if (keyHandler.rightPressed) {

	    	if (playerX + gp.tileSize + speed <= screenX) {
	            playerX += speed;
	        }

	    }
	    if (keyHandler.leftPressed) {
	    	
	    	if (playerX - speed >= 0) {
	            playerX -= speed;
	        }
	    }
	    if (keyHandler.spacePressed && canShoot()) {
            shootBullet();
            playShootSound();
        }
	    
	    worldY -= worldSpeed;
	    
	    int distanceFromTop = (gp.tileSize * (gp.maxWorldRow - 2)) - worldY;
	    progressPercentage = Math.max((int) (((double) distanceFromTop / (gp.tileSize * (gp.maxWorldRow - 6))) * 100), 0);
	    
	    for (Alien alien : gp.alienList) {
	        if (collisionWithAlien(alien)) {
	            decreaseHealth();
	            playHitSound();
	            break;
	        }
	    }
	    
	    
	    spriteCounter++;
	    if (spriteCounter > 5) {
	        if (spriteNum == 1) {
	            spriteNum = 2;
	        } else if (spriteNum == 2) {
	            spriteNum = 1;
	        }
	        spriteCounter = 0;
	    }
	}
	
    
	public void draw(Graphics2D g2) {
			
		
		BufferedImage image = null;
		switch(spriteNum) {
		case 1:
			image = ship1;
			break;
		case 2:
			image = ship2;
			break;
		}
		
	    
		g2.drawImage(image, playerX, playerY,gp.tileSize,gp.tileSize, null);
		
	}
	
	public int getProgressPercentage() {
		return progressPercentage;
	}
	public int getPlayerHealth() {
		return playerHealth;
	}
	public void decreaseHealth() {
		playerHealth--;
	}
	private boolean canShoot() {
        long currentTime = System.currentTimeMillis();
        return shooting && currentTime - lastShotTime >= shootCooldown;
    }

    public void shootBullet() {
        Bullet bullet = new Bullet(gp, playerX + (gp.tileSize/2)-12, playerY);
        gp.addBullet(bullet);
        lastShotTime = System.currentTimeMillis();
    }
    private boolean collisionWithAlien(Alien alien) {
        int alienLeft = alien.alienX - gp.player.worldX + gp.screenWidth / 2;
        int alienRight = alien.alienX - gp.player.worldX + gp.screenWidth / 2 + gp.tileSize;
        int alienTop = alien.alienY - gp.player.worldY + gp.screenHeight / 2;
        int alienBottom = alien.alienY - gp.player.worldY + gp.screenHeight / 2 + gp.tileSize;

        int playerLeft = playerX;
        int playerRight = playerX + gp.tileSize;
        int playerTop = playerY;
        int playerBottom = playerY + gp.tileSize;

        long currentTime = System.currentTimeMillis();
        long collisionCooldown = 5000;
        long timeSinceLastCollision = currentTime - lastCollisionTime;

        if (playerLeft < alienRight && playerRight > alienLeft &&
            playerTop < alienBottom && playerBottom > alienTop &&
            timeSinceLastCollision >= collisionCooldown) {
            lastCollisionTime = currentTime;
            return true;
        }

        return false;
    }
 


}
