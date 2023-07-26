package Entity;


import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class GreenSmileyAlien extends Alien{
	

	public GreenSmileyAlien(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
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
	
	
	
	public void setGreenSmileyAliensLevel1() {
		GreenSmileyAlien alien = new GreenSmileyAlien(this.gp,gp.tileSize*2,gp.tileSize*109,1,1,4);
		GreenSmileyAlien alien1 = new GreenSmileyAlien(this.gp,gp.tileSize*9,gp.tileSize*107,-1,1,4);
		GreenSmileyAlien alien2 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*104,-1,1,4);
		
		GreenSmileyAlien alien3 = new GreenSmileyAlien(this.gp,gp.tileSize*6,gp.tileSize*101,-1,1,4);
		
		GreenSmileyAlien alien4 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*96,0,1,4);
		
		GreenSmileyAlien alien5 = new GreenSmileyAlien(this.gp,gp.tileSize*-1,gp.tileSize*93,0,1,4);
		GreenSmileyAlien alien6 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*92,0,1,4);
		
		GreenSmileyAlien alien7 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*85,1,1,4);
		
		GreenSmileyAlien alien8 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*78,-1,1,4);
		
		GreenSmileyAlien alien9 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*76,1,1,4);
		GreenSmileyAlien alien10 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*76,1,1,4);
		
		GreenSmileyAlien alien11 = new GreenSmileyAlien(this.gp,gp.tileSize*13,gp.tileSize*73,-1,1,4);
		GreenSmileyAlien alien12 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*73,-1,1,4);
		
		GreenSmileyAlien alien13 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*70,0,1,4);
		GreenSmileyAlien alien14 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*70,0,1,4);
		GreenSmileyAlien alien15 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*67,0,1,4);
		GreenSmileyAlien alien16 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*67,0,1,4);
		
		GreenSmileyAlien alien17 = new GreenSmileyAlien(this.gp,gp.tileSize*8,gp.tileSize*70,0,1,4);
		GreenSmileyAlien alien18 = new GreenSmileyAlien(this.gp,gp.tileSize*11,gp.tileSize*70,0,1,4);
		GreenSmileyAlien alien19 = new GreenSmileyAlien(this.gp,gp.tileSize*9 + (gp.tileSize/2),gp.tileSize*67,0,1,4);
		
		GreenSmileyAlien alien20 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*62,0,1,4);
		
		GreenSmileyAlien alien21 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*63,0,1,4);
		
		
		
		
		
		gp.alienList.add(alien);
		gp.alienList.add(alien1);
		gp.alienList.add(alien2);
		gp.alienList.add(alien3);
		gp.alienList.add(alien4);
		gp.alienList.add(alien5);
		gp.alienList.add(alien6);
		gp.alienList.add(alien7);
		gp.alienList.add(alien8);
		gp.alienList.add(alien9);
		gp.alienList.add(alien10);
		gp.alienList.add(alien11);
		gp.alienList.add(alien12);
		gp.alienList.add(alien13);
		gp.alienList.add(alien14);
		gp.alienList.add(alien15);
		gp.alienList.add(alien16);
		gp.alienList.add(alien17);
		gp.alienList.add(alien18);
		gp.alienList.add(alien19);
		gp.alienList.add(alien20);
		gp.alienList.add(alien21);
	}
	
	public void setGreenSmileyAliensLevel2() {
		
		GreenSmileyAlien alien = new GreenSmileyAlien(this.gp,gp.tileSize*2,gp.tileSize*109,1,2,4);
		GreenSmileyAlien alien1 = new GreenSmileyAlien(this.gp,gp.tileSize*9,gp.tileSize*107,-1,2,4);
		GreenSmileyAlien alien2 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*104,-1,2,4);
		
		GreenSmileyAlien alien3 = new GreenSmileyAlien(this.gp,gp.tileSize*6,gp.tileSize*101,-1,2,4);
		
		GreenSmileyAlien alien4 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*96,0,2,4);
		
		GreenSmileyAlien alien5 = new GreenSmileyAlien(this.gp,gp.tileSize*-1,gp.tileSize*93,0,2,4);
		GreenSmileyAlien alien6 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*92,0,2,4);
		
		GreenSmileyAlien alien7 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*85,1,2,4);
		
		GreenSmileyAlien alien8 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*78,-1,2,4);
		
		GreenSmileyAlien alien9 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*76,1,2,4);
		GreenSmileyAlien alien10 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*76,1,2,4);
		
		GreenSmileyAlien alien11 = new GreenSmileyAlien(this.gp,gp.tileSize*13,gp.tileSize*73,-1,2,4);
		GreenSmileyAlien alien12 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*73,-1,2,4);
		
		GreenSmileyAlien alien13 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*70,0,2,4);
		GreenSmileyAlien alien14 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*70,0,2,4);
		GreenSmileyAlien alien15 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*67,0,2,4);
		GreenSmileyAlien alien16 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*67,0,2,4);
		
		GreenSmileyAlien alien17 = new GreenSmileyAlien(this.gp,gp.tileSize*8,gp.tileSize*70,0,2,4);
		GreenSmileyAlien alien18 = new GreenSmileyAlien(this.gp,gp.tileSize*11,gp.tileSize*70,0,2,4);
		GreenSmileyAlien alien19 = new GreenSmileyAlien(this.gp,gp.tileSize*9 + (gp.tileSize/2),gp.tileSize*67,0,2,4);
		
		GreenSmileyAlien alien20 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*62,0,2,4);
		
		GreenSmileyAlien alien21 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*63,0,2,4);
		
		
		
		
		
		gp.alienList.add(alien);
		gp.alienList.add(alien1);
		gp.alienList.add(alien2);
		gp.alienList.add(alien3);
		gp.alienList.add(alien4);
		gp.alienList.add(alien5);
		gp.alienList.add(alien6);
		gp.alienList.add(alien7);
		gp.alienList.add(alien8);
		gp.alienList.add(alien9);
		gp.alienList.add(alien10);
		gp.alienList.add(alien11);
		gp.alienList.add(alien12);
		gp.alienList.add(alien13);
		gp.alienList.add(alien14);
		gp.alienList.add(alien15);
		gp.alienList.add(alien16);
		gp.alienList.add(alien17);
		gp.alienList.add(alien18);
		gp.alienList.add(alien19);
		gp.alienList.add(alien20);
		gp.alienList.add(alien21);
	}
	
    public void setGreenSmileyAliensLevel3() {
    	
    	GreenSmileyAlien alien = new GreenSmileyAlien(this.gp,gp.tileSize*2,gp.tileSize*109,1,3,4);
		GreenSmileyAlien alien1 = new GreenSmileyAlien(this.gp,gp.tileSize*9,gp.tileSize*107,-1,3,4);
		GreenSmileyAlien alien2 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*104,-1,3,4);
		
		GreenSmileyAlien alien3 = new GreenSmileyAlien(this.gp,gp.tileSize*6,gp.tileSize*101,-1,3,4);
		
		GreenSmileyAlien alien4 = new GreenSmileyAlien(this.gp,gp.tileSize*12,gp.tileSize*96,0,3,4);
		
		GreenSmileyAlien alien5 = new GreenSmileyAlien(this.gp,gp.tileSize*-1,gp.tileSize*93,0,3,4);
		GreenSmileyAlien alien6 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*92,0,3,4);
		
		GreenSmileyAlien alien7 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*85,1,3,4);
		
		GreenSmileyAlien alien8 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*78,-1,3,4);
		
		GreenSmileyAlien alien9 = new GreenSmileyAlien(this.gp,gp.tileSize*-2,gp.tileSize*76,1,3,4);
		GreenSmileyAlien alien10 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*76,1,3,4);
		
		GreenSmileyAlien alien11 = new GreenSmileyAlien(this.gp,gp.tileSize*13,gp.tileSize*73,-1,3,4);
		GreenSmileyAlien alien12 = new GreenSmileyAlien(this.gp,gp.tileSize*10,gp.tileSize*73,-1,3,4);
		
		GreenSmileyAlien alien13 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*70,0,3,4);
		GreenSmileyAlien alien14 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*70,0,3,4);
		GreenSmileyAlien alien15 = new GreenSmileyAlien(this.gp,gp.tileSize*0,gp.tileSize*67,0,3,4);
		GreenSmileyAlien alien16 = new GreenSmileyAlien(this.gp,gp.tileSize*3,gp.tileSize*67,0,3,4);
		
		GreenSmileyAlien alien17 = new GreenSmileyAlien(this.gp,gp.tileSize*8,gp.tileSize*70,0,3,4);
		GreenSmileyAlien alien18 = new GreenSmileyAlien(this.gp,gp.tileSize*11,gp.tileSize*70,0,3,4);
		GreenSmileyAlien alien19 = new GreenSmileyAlien(this.gp,gp.tileSize*9 + (gp.tileSize/2),gp.tileSize*67,0,3,4);
		
		GreenSmileyAlien alien20 = new GreenSmileyAlien(this.gp,gp.tileSize*4,gp.tileSize*62,0,3,4);
		
		GreenSmileyAlien alien21 = new GreenSmileyAlien(this.gp,gp.tileSize*1,gp.tileSize*63,0,3,4);
		
		
		
		
		
		gp.alienList.add(alien);
		gp.alienList.add(alien1);
		gp.alienList.add(alien2);
		gp.alienList.add(alien3);
		gp.alienList.add(alien4);
		gp.alienList.add(alien5);
		gp.alienList.add(alien6);
		gp.alienList.add(alien7);
		gp.alienList.add(alien8);
		gp.alienList.add(alien9);
		gp.alienList.add(alien10);
		gp.alienList.add(alien11);
		gp.alienList.add(alien12);
		gp.alienList.add(alien13);
		gp.alienList.add(alien14);
		gp.alienList.add(alien15);
		gp.alienList.add(alien16);
		gp.alienList.add(alien17);
		gp.alienList.add(alien18);
		gp.alienList.add(alien19);
		gp.alienList.add(alien20);
		gp.alienList.add(alien21);
		
	}
    
    
      
     

}
