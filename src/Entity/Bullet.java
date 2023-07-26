package Entity;

import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class Bullet extends Entity{

	
	public int bulletX;
	public int bulletY;
	public int bulletSpeed = 5;
	
	Bullet(GamePanel gp,int x,int y){
		super(gp);
		this.bulletX = x;
		this.bulletY = y;
	    getBulletImage();
	}
	
	
	public void getBulletImage() {
		try {
			
			bullet = ImageIO.read(getClass().getResourceAsStream("/bullet/bullet.png"));

		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		bulletY -= bulletSpeed;
		
	}
	
	public void draw(Graphics2D g2) {
		
		g2.drawImage(bullet, bulletX, bulletY,gp.tileSize/2,gp.tileSize/2,null);
	}
}
