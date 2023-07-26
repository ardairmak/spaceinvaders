package Entity;


import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class GreenAlien extends Alien{
	

	public GreenAlien(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/greenSmileyAlienDown.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/greenSmileyAlienMid.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/greenSmileyAlienUp.png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void setGreenAliensLevel1() {
		GreenAlien alien = new GreenAlien(this.gp,gp.tileSize*5,gp.tileSize*112,1,1,4);
		gp.alienList.add(alien);
		
	}
	
	public void setGreenAliensLevel2() {
		GreenAlien alien = new GreenAlien(this.gp,gp.tileSize*5,gp.tileSize*112,1,2,4);
		gp.alienList.add(alien);
	}
	
    public void setGreenAliensLevel3() {
    	GreenAlien alien = new GreenAlien(this.gp,gp.tileSize*5,gp.tileSize*112,1,3,4);
		gp.alienList.add(alien);
	}
    
    
      
     

}
