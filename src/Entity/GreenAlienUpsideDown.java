package Entity;


import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class GreenAlienUpsideDown extends Alien{
	

	public GreenAlienUpsideDown(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienUpsideDown.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienUpsideMid.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienUpsideUp.png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void setGreenUpsideAliensLevel1() {
		
		GreenAlienUpsideDown alien = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*110,1,1,4);
		GreenAlienUpsideDown alien1 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*106,-1,1,4);
		
		GreenAlienUpsideDown alien2 = new GreenAlienUpsideDown(this.gp,gp.tileSize*4,gp.tileSize*99,-1,1,4);
		GreenAlienUpsideDown alien3 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*96,0,1,4);
		GreenAlienUpsideDown alien4 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*96,0,1,4);
		
		GreenAlienUpsideDown alien5 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*92,0,1,4);
		GreenAlienUpsideDown alien6 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*93,0,1,4);
		GreenAlienUpsideDown alien7 = new GreenAlienUpsideDown(this.gp,gp.tileSize*7,gp.tileSize*93,0,1,4);
		
		GreenAlienUpsideDown alien8 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*84,1,1,4);
		
		GreenAlienUpsideDown alien9 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*79,-1,1,4);
		
		GreenAlienUpsideDown alien10 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*76,1,1,4);
		GreenAlienUpsideDown alien11 = new GreenAlienUpsideDown(this.gp,gp.tileSize*2,gp.tileSize*76,1,1,4);
		
		GreenAlienUpsideDown alien12 = new GreenAlienUpsideDown(this.gp,gp.tileSize*12,gp.tileSize*73,-1,1,4);
		GreenAlienUpsideDown alien13 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*73,-1,1,4);
		
		GreenAlienUpsideDown alien14 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*70,0,1,4);
		GreenAlienUpsideDown alien15 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*69,0,1,4);
		GreenAlienUpsideDown alien16 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*67,0,1,4);
		GreenAlienUpsideDown alien17 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*68,0,1,4);
		
		GreenAlienUpsideDown alien18 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*70,0,1,4);
		GreenAlienUpsideDown alien19 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*68,0,1,4);
		GreenAlienUpsideDown alien20 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*68,0,1,4);
		
		GreenAlienUpsideDown alien21 = new GreenAlienUpsideDown(this.gp,gp.tileSize*6,gp.tileSize*62,0,1,4);
		
		GreenAlienUpsideDown alien22 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*62,0,1,4);
		GreenAlienUpsideDown alien23 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*63,0,1,4);
		GreenAlienUpsideDown alien24 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*64,0,1,4);
		
		
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

	}
	
	public void setGreenUpsideAliensLevel2() {
		
		GreenAlienUpsideDown alien = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*110,1,2,4);
		GreenAlienUpsideDown alien1 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*106,-1,2,4);
		
		GreenAlienUpsideDown alien2 = new GreenAlienUpsideDown(this.gp,gp.tileSize*4,gp.tileSize*99,-1,2,4);
		GreenAlienUpsideDown alien3 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*96,0,2,4);
		GreenAlienUpsideDown alien4 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*96,0,2,4);
		
		GreenAlienUpsideDown alien5 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*92,0,2,4);
		GreenAlienUpsideDown alien6 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*93,0,2,4);
		GreenAlienUpsideDown alien7 = new GreenAlienUpsideDown(this.gp,gp.tileSize*7,gp.tileSize*93,0,2,4);
		
		GreenAlienUpsideDown alien8 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*84,1,2,4);
		
		GreenAlienUpsideDown alien9 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*79,-1,2,4);
		
		GreenAlienUpsideDown alien10 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*76,1,2,4);
		GreenAlienUpsideDown alien11 = new GreenAlienUpsideDown(this.gp,gp.tileSize*2,gp.tileSize*76,1,2,4);
		
		GreenAlienUpsideDown alien12 = new GreenAlienUpsideDown(this.gp,gp.tileSize*12,gp.tileSize*73,-1,2,4);
		GreenAlienUpsideDown alien13 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*73,-1,2,4);
		
		GreenAlienUpsideDown alien14 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*70,0,2,4);
		GreenAlienUpsideDown alien15 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*69,0,2,4);
		GreenAlienUpsideDown alien16 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*67,0,2,4);
		GreenAlienUpsideDown alien17 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*68,0,2,4);
		
		GreenAlienUpsideDown alien18 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*70,0,2,4);
		GreenAlienUpsideDown alien19 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*68,0,2,4);
		GreenAlienUpsideDown alien20 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*68,0,2,4);
		
		GreenAlienUpsideDown alien21 = new GreenAlienUpsideDown(this.gp,gp.tileSize*6,gp.tileSize*62,0,2,4);
		
		GreenAlienUpsideDown alien22 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*62,0,2,4);
		GreenAlienUpsideDown alien23 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*63,0,2,4);
		GreenAlienUpsideDown alien24 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*64,0,2,4);
		
		
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

	}
	
    public void setGreenUpsideAliensLevel3() {
    	
    	GreenAlienUpsideDown alien = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*110,1,3,4);
		GreenAlienUpsideDown alien1 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*106,-1,3,4);
		
		GreenAlienUpsideDown alien2 = new GreenAlienUpsideDown(this.gp,gp.tileSize*4,gp.tileSize*99,-1,3,4);
		GreenAlienUpsideDown alien3 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*96,0,3,4);
		GreenAlienUpsideDown alien4 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*96,0,3,4);
		
		GreenAlienUpsideDown alien5 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*92,0,3,4);
		GreenAlienUpsideDown alien6 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*93,0,3,4);
		GreenAlienUpsideDown alien7 = new GreenAlienUpsideDown(this.gp,gp.tileSize*7,gp.tileSize*93,0,3,4);
		
		GreenAlienUpsideDown alien8 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*84,1,3,4);
		
		GreenAlienUpsideDown alien9 = new GreenAlienUpsideDown(this.gp,gp.tileSize*11,gp.tileSize*79,-1,3,4);
		
		GreenAlienUpsideDown alien10 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*76,1,3,4);
		GreenAlienUpsideDown alien11 = new GreenAlienUpsideDown(this.gp,gp.tileSize*2,gp.tileSize*76,1,3,4);
		
		GreenAlienUpsideDown alien12 = new GreenAlienUpsideDown(this.gp,gp.tileSize*12,gp.tileSize*73,-1,3,4);
		GreenAlienUpsideDown alien13 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*73,-1,3,4);
		
		GreenAlienUpsideDown alien14 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*70,0,3,4);
		GreenAlienUpsideDown alien15 = new GreenAlienUpsideDown(this.gp,gp.tileSize*0,gp.tileSize*69,0,3,4);
		GreenAlienUpsideDown alien16 = new GreenAlienUpsideDown(this.gp,gp.tileSize*1,gp.tileSize*67,0,3,4);
		GreenAlienUpsideDown alien17 = new GreenAlienUpsideDown(this.gp,gp.tileSize*3,gp.tileSize*68,0,3,4);
		
		GreenAlienUpsideDown alien18 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*70,0,3,4);
		GreenAlienUpsideDown alien19 = new GreenAlienUpsideDown(this.gp,gp.tileSize*9,gp.tileSize*68,0,3,4);
		GreenAlienUpsideDown alien20 = new GreenAlienUpsideDown(this.gp,gp.tileSize*10,gp.tileSize*68,0,3,4);
		
		GreenAlienUpsideDown alien21 = new GreenAlienUpsideDown(this.gp,gp.tileSize*6,gp.tileSize*62,0,3,4);
		
		GreenAlienUpsideDown alien22 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*62,0,3,4);
		GreenAlienUpsideDown alien23 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*63,0,3,4);
		GreenAlienUpsideDown alien24 = new GreenAlienUpsideDown(this.gp,gp.tileSize*-1,gp.tileSize*64,0,3,4);
		
		
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

		
	}
    
    
      
     

}
