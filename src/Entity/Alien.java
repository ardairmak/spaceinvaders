package Entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import main.GamePanel;

public class Alien extends Entity{
	
	public int alienX;
	public int alienY;
	protected int alienHealth;
	public int alienSpeed;
	
	private Clip alienKilledClip;
	
	
	public Alien(GamePanel gp, int x,int y,int direction,int speed,int initialHealth) {
		
		super(gp);
		this.alienX = x;
		this.alienY = y;
		this.direction = direction;
		this.alienHealth = initialHealth;
		this.alienSpeed = speed;
		loadSounds();
		
		}
	
	 private void loadSounds() {
	        try {
	            alienKilledClip = AudioSystem.getClip();
	            alienKilledClip.open(AudioSystem.getAudioInputStream(getClass().getResource("/sounds/invaderkilled.wav")));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	public void update() {
		 alienX += alienSpeed * direction;

		if (alienX <= 0-gp.tileSize*2 || alienX >= gp.screenWidth - gp.tileSize*3) {
			direction *= -1;
	    }
		 List<Bullet> bulletsToRemove = new ArrayList<>();

		 for (Bullet bullet : gp.bulletList) {
		     if (collisionWithBullet(bullet)) {
		            bulletsToRemove.add(bullet);
		        }
		    }

		 for (Bullet bullet : bulletsToRemove) {
		        gp.bulletList.remove(bullet);
		    }
		      
		spriteCounter++;
	    if (spriteCounter > 20) {
	        if (spriteNum == 1) {
	            spriteNum = 2;
	        } else if (spriteNum == 2) {
	            spriteNum = 3;
	        } else if (spriteNum == 3) {
	        	spriteNum = 1;
	        }
	        spriteCounter = 0;
	    }
}
	
	 protected boolean collisionWithBullet(Bullet bullet) {
 	    int bulletX = bullet.bulletX;
 	    int bulletY = bullet.bulletY;

 	    int alienLeft = alienX - gp.player.worldX + gp.screenWidth / 2;
 	    int alienRight = alienX - gp.player.worldX + gp.screenWidth / 2 + gp.tileSize;
 	    int alienTop = alienY - gp.player.worldY + gp.screenHeight / 2;
 	    int alienBottom = alienY - gp.player.worldY + gp.screenHeight / 2 + gp.tileSize;

 	    if (bulletX + bullet.bullet.getWidth() >= alienLeft && bulletX <= alienRight &&
 	        bulletY + bullet.bullet.getWidth() >= alienTop && bulletY <= alienBottom) {
 	    	gp.score += 10;
 	    	takeDamage();
 	    	
 	        return true;
 	    }

 	    return false;
 	}
	 public void draw(Graphics2D g2) {
			
   	  BufferedImage image = null;
   	    
   	    int screenX = alienX - gp.player.worldX + gp.screenWidth / 2;
   	    int screenY = alienY - gp.player.worldY + gp.screenHeight / 2;

   	    if (screenX + gp.tileSize > 0 && screenX - gp.tileSize < gp.screenWidth &&
   	        screenY + gp.tileSize > 0 && screenY - gp.tileSize < gp.screenHeight) {
   	        switch (spriteNum) {
   	            case 1:
   	                image = up;
   	                break;
   	            case 2:
   	                image = mid;
   	                break;
   	            case 3:
   	                image = down;
   	                break;
   	        }
   	        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
   	    }
	} 
	 
	 public void takeDamage() {
		 this.alienHealth-=1;
	 }
	  public void destroyAlienSound() {
	        if (alienKilledClip != null) {
	            alienKilledClip.setFramePosition(0);
	            alienKilledClip.start();
	        }
	  }
	 public int getAlienHealth() {
		 return this.alienHealth;
	 }
	 

}
