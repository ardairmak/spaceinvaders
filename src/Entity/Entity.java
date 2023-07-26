package Entity;

import java.awt.image.BufferedImage;
import main.GamePanel;

public class Entity {

	GamePanel gp;
	public int worldX,worldY;
	public int speed;
	public int worldSpeed;
	
	
	public BufferedImage ship1,ship2,bullet,up,mid,down;
	
	public int spriteCounter = 0;
	public int spriteNum = 1;
	
	public int direction;
	
	public Entity(GamePanel gp) {
		this.gp = gp;
	}
	
     
}
	
	
	
	


