package Entity;


import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class PurpleAlien extends Alien{
	
	public PurpleAlien(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/purpleUp.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/purpleDown.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/purpleDown.png"));
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setPurpleAliensLevel1() {
		
		PurpleAlien alien = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*103,-1,1,5);
		
		PurpleAlien alien1 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*100,-1,1,5);
		
		PurpleAlien alien2 = new PurpleAlien(this.gp,gp.tileSize*2,gp.tileSize*95,0,1,5);
		PurpleAlien alien3 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*95,0,1,5);
		PurpleAlien alien4 = new PurpleAlien(this.gp,gp.tileSize*4,gp.tileSize*95,0,1,5);
		PurpleAlien alien5 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*95,0,1,5);
		
		PurpleAlien alien6 = new PurpleAlien(this.gp,gp.tileSize*1,gp.tileSize*91,0,1,5);
		PurpleAlien alien7 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*91,0,1,5);
		
		PurpleAlien alien8 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*92,0,1,5);
		PurpleAlien alien9 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*92,0,1,5);
		PurpleAlien alien10 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*93,0,1,5);
		PurpleAlien alien11 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*93,0,1,5);
		
		PurpleAlien alien12 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*87,1,1,5);
		PurpleAlien alien13 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*88,-1,1,5);
		
		PurpleAlien alien14 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*83,1,1,5);
		
		PurpleAlien alien15 = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*81,-1,1,5);
		
		PurpleAlien alien16 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*74,-1,1,5);
		PurpleAlien alien17 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*74,-1,1,5);
		
		PurpleAlien alien18 = new PurpleAlien(this.gp,gp.tileSize*-1,gp.tileSize*72,-1,1,5);
		PurpleAlien alien19 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*72,-1,1,5);
		
		PurpleAlien alien20 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*65,0,1,5);
		PurpleAlien alien21 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*65,0,1,5);
		PurpleAlien alien22 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*61,0,1,5);
		PurpleAlien alien23 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*61,0,1,5);
		PurpleAlien alien24 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*63,0,1,5);
		
		PurpleAlien alien25 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*62,0,1,5);
		PurpleAlien alien26 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*63,0,1,5);
		PurpleAlien alien27 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*64,0,1,5);
		PurpleAlien alien28 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*62 + (gp.tileSize/2),0,1,5);
		PurpleAlien alien29 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*63 + (gp.tileSize/2),0,1,5);
		PurpleAlien alien30 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*63,0,1,5);
	
		
		
		
		
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
		gp.alienList.add(alien22);
		gp.alienList.add(alien23);
		gp.alienList.add(alien24);
		gp.alienList.add(alien25);
		gp.alienList.add(alien26);
		gp.alienList.add(alien27);
		gp.alienList.add(alien28);
		gp.alienList.add(alien29);
		gp.alienList.add(alien30);
		
		
	}
	public void setPurpleAliensLevel2() {
        
		PurpleAlien alien = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*103,-1,2,5);
		
		PurpleAlien alien1 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*100,-1,2,5);
		
		PurpleAlien alien2 = new PurpleAlien(this.gp,gp.tileSize*2,gp.tileSize*95,0,2,5);
		PurpleAlien alien3 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*95,0,2,5);
		PurpleAlien alien4 = new PurpleAlien(this.gp,gp.tileSize*4,gp.tileSize*95,0,2,5);
		PurpleAlien alien5 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*95,0,2,5);
		
		PurpleAlien alien6 = new PurpleAlien(this.gp,gp.tileSize*1,gp.tileSize*91,0,2,5);
		PurpleAlien alien7 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*91,0,2,5);
		
		PurpleAlien alien8 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*92,0,2,5);
		PurpleAlien alien9 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*92,0,2,5);
		PurpleAlien alien10 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*93,0,2,5);
		PurpleAlien alien11 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*93,0,2,5);
		
		PurpleAlien alien12 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*87,1,2,5);
		PurpleAlien alien13 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*88,-1,2,5);
		
		PurpleAlien alien14 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*83,1,2,5);
		
		PurpleAlien alien15 = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*81,-1,2,5);
		
		PurpleAlien alien16 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*74,-1,2,5);
		PurpleAlien alien17 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*74,-1,2,5);
		
		PurpleAlien alien18 = new PurpleAlien(this.gp,gp.tileSize*-1,gp.tileSize*72,-1,2,5);
		PurpleAlien alien19 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*72,-1,2,5);
		
		PurpleAlien alien20 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*65,0,2,5);
		PurpleAlien alien21 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*65,0,2,5);
		PurpleAlien alien22 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*61,0,2,5);
		PurpleAlien alien23 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*61,0,2,5);
		PurpleAlien alien24 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*63,0,2,5);
		
		PurpleAlien alien25 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*62,0,2,5);
		PurpleAlien alien26 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*63,0,2,5);
		PurpleAlien alien27 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*64,0,2,5);
		PurpleAlien alien28 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*62 + (gp.tileSize/2),0,2,5);
		PurpleAlien alien29 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*63 + (gp.tileSize/2),0,2,5);
		PurpleAlien alien30 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*63,0,2,5);
	
		
		
		
		
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
		gp.alienList.add(alien22);
		gp.alienList.add(alien23);
		gp.alienList.add(alien24);
		gp.alienList.add(alien25);
		gp.alienList.add(alien26);
		gp.alienList.add(alien27);
		gp.alienList.add(alien28);
		gp.alienList.add(alien29);
		gp.alienList.add(alien30);
	}
	public void setPurpleAliensLevel3() {
		
        PurpleAlien alien = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*103,-1,3,5);
		
		PurpleAlien alien1 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*100,-1,3,5);
		
		PurpleAlien alien2 = new PurpleAlien(this.gp,gp.tileSize*2,gp.tileSize*95,0,3,5);
		PurpleAlien alien3 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*95,0,3,5);
		PurpleAlien alien4 = new PurpleAlien(this.gp,gp.tileSize*4,gp.tileSize*95,0,3,5);
		PurpleAlien alien5 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*95,0,3,5);
		
		PurpleAlien alien6 = new PurpleAlien(this.gp,gp.tileSize*1,gp.tileSize*91,0,3,5);
		PurpleAlien alien7 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*91,0,3,5);
		
		PurpleAlien alien8 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*92,0,3,5);
		PurpleAlien alien9 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*92,0,3,5);
		PurpleAlien alien10 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*93,0,3,5);
		PurpleAlien alien11 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*93,0,3,5);
		
		PurpleAlien alien12 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*87,1,3,5);
		PurpleAlien alien13 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*88,-1,3,5);
		
		PurpleAlien alien14 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*83,1,3,5);
		
		PurpleAlien alien15 = new PurpleAlien(this.gp,gp.tileSize*13,gp.tileSize*81,-1,3,5);
		
		PurpleAlien alien16 = new PurpleAlien(this.gp,gp.tileSize*12,gp.tileSize*74,-1,3,5);
		PurpleAlien alien17 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*74,-1,3,5);
		
		PurpleAlien alien18 = new PurpleAlien(this.gp,gp.tileSize*-1,gp.tileSize*72,-1,3,5);
		PurpleAlien alien19 = new PurpleAlien(this.gp,gp.tileSize*0,gp.tileSize*72,-1,3,5);
		
		PurpleAlien alien20 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*65,0,3,5);
		PurpleAlien alien21 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*65,0,3,5);
		PurpleAlien alien22 = new PurpleAlien(this.gp,gp.tileSize*3,gp.tileSize*61,0,3,5);
		PurpleAlien alien23 = new PurpleAlien(this.gp,gp.tileSize*7,gp.tileSize*61,0,3,5);
		PurpleAlien alien24 = new PurpleAlien(this.gp,gp.tileSize*5,gp.tileSize*63,0,3,5);
		
		PurpleAlien alien25 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*62,0,3,5);
		PurpleAlien alien26 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*63,0,3,5);
		PurpleAlien alien27 = new PurpleAlien(this.gp,gp.tileSize*9,gp.tileSize*64,0,3,5);
		PurpleAlien alien28 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*62 + (gp.tileSize/2),0,3,5);
		PurpleAlien alien29 = new PurpleAlien(this.gp,gp.tileSize*10,gp.tileSize*63 + (gp.tileSize/2),0,3,5);
		PurpleAlien alien30 = new PurpleAlien(this.gp,gp.tileSize*11,gp.tileSize*63,0,3,5);
	
		
		
		
		
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
		gp.alienList.add(alien22);
		gp.alienList.add(alien23);
		gp.alienList.add(alien24);
		gp.alienList.add(alien25);
		gp.alienList.add(alien26);
		gp.alienList.add(alien27);
		gp.alienList.add(alien28);
		gp.alienList.add(alien29);
		gp.alienList.add(alien30);
	}
   
      
      
     


}
