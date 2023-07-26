package Entity;


import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class GreenAlienTongue extends Alien{
	

	public GreenAlienTongue(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienTongueDown.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienTongueMid.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/greenAlienTongueUp.png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void setGreenTongueAliensLevel1() {
		GreenAlienTongue alien = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*111,1,1,4);
		GreenAlienTongue alien1 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*105,-1,1,4);
		
		GreenAlienTongue alien2 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*98,-1,1,4);
		GreenAlienTongue alien3 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*96,0,1,4);
		
		GreenAlienTongue alien4 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*92,0,1,4);
		GreenAlienTongue alien5 = new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*92,0,1,4);
		
		GreenAlienTongue alien6 = new GreenAlienTongue(this.gp,gp.tileSize*1,gp.tileSize*82,1,1,4);
		
		GreenAlienTongue alien7 = new GreenAlienTongue(this.gp,gp.tileSize*12,gp.tileSize*80,-1,1,4);
		
		GreenAlienTongue alien8 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*76,1,1,4);
		GreenAlienTongue alien9 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*76,1,1,4);
		
		GreenAlienTongue alien10 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*73,-1,1,4);     
		GreenAlienTongue alien11 = new GreenAlienTongue(this.gp,gp.tileSize*8,gp.tileSize*73,-1,1,4);       
		                                                                                                   
		GreenAlienTongue alien12 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*70,0,1,4);
		GreenAlienTongue alien13 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*68,0,1,4);
		GreenAlienTongue alien14 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*67,0,1,4);
		GreenAlienTongue alien15 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*69,0,1,4);
		
		GreenAlienTongue alien16 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*70,0,1,4);
		GreenAlienTongue alien17 = new GreenAlienTongue(this.gp,gp.tileSize*8 + (gp.tileSize/2),gp.tileSize*69,0,1,4);
		GreenAlienTongue alien18 = new GreenAlienTongue(this.gp,gp.tileSize*10 + (gp.tileSize/2),gp.tileSize*69,0,1,4);
		
		GreenAlienTongue alien19 = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*64,0,1,4);
		GreenAlienTongue alien20= new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*64,0,1,4);
		
		GreenAlienTongue alien21 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*62 +(gp.tileSize/2),0,1,4);
		GreenAlienTongue alien22= new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*63 + (gp.tileSize/2),0,1,4);
		
		
		
		
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
		
	}
	
	public void setGreenTongueAliensLevel2() {
		
		GreenAlienTongue alien = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*111,1,2,4);
		GreenAlienTongue alien1 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*105,-1,2,4);
		
		GreenAlienTongue alien2 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*98,-1,2,4);
		GreenAlienTongue alien3 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*96,0,2,4);
		
		GreenAlienTongue alien4 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*92,0,2,4);
		GreenAlienTongue alien5 = new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*92,0,2,4);
		
		GreenAlienTongue alien6 = new GreenAlienTongue(this.gp,gp.tileSize*1,gp.tileSize*82,1,2,4);
		
		GreenAlienTongue alien7 = new GreenAlienTongue(this.gp,gp.tileSize*12,gp.tileSize*80,-1,2,4);
		
		GreenAlienTongue alien8 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*76,1,2,4);
		GreenAlienTongue alien9 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*76,1,2,4);
		
		GreenAlienTongue alien10 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*73,-1,2,4);     
		GreenAlienTongue alien11 = new GreenAlienTongue(this.gp,gp.tileSize*8,gp.tileSize*73,-1,2,4);       
		                                                                                                   
		GreenAlienTongue alien12 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*70,0,2,4);
		GreenAlienTongue alien13 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*68,0,2,4);
		GreenAlienTongue alien14 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*67,0,2,4);
		GreenAlienTongue alien15 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*69,0,2,4);
		
		GreenAlienTongue alien16 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*70,0,2,4);
		GreenAlienTongue alien17 = new GreenAlienTongue(this.gp,gp.tileSize*8 + (gp.tileSize/2),gp.tileSize*69,0,2,4);
		GreenAlienTongue alien18 = new GreenAlienTongue(this.gp,gp.tileSize*10 + (gp.tileSize/2),gp.tileSize*69,0,2,4);
		
		GreenAlienTongue alien19 = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*64,0,2,4);
		GreenAlienTongue alien20= new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*64,0,2,4);
		
		GreenAlienTongue alien21 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*62 +(gp.tileSize/2),0,2,4);
		GreenAlienTongue alien22= new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*63 + (gp.tileSize/2),0,2,4);
		
		
		
		
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
	}
	
    public void setGreenTongueAliensLevel3() {
    	
    	GreenAlienTongue alien = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*111,1,3,4);
		GreenAlienTongue alien1 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*105,-1,3,4);
		
		GreenAlienTongue alien2 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*98,-1,3,4);
		GreenAlienTongue alien3 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*96,0,3,4);
		
		GreenAlienTongue alien4 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*92,0,3,4);
		GreenAlienTongue alien5 = new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*92,0,3,4);
		
		GreenAlienTongue alien6 = new GreenAlienTongue(this.gp,gp.tileSize*1,gp.tileSize*82,1,3,4);
		
		GreenAlienTongue alien7 = new GreenAlienTongue(this.gp,gp.tileSize*12,gp.tileSize*80,-1,3,4);
		
		GreenAlienTongue alien8 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*76,1,3,4);
		GreenAlienTongue alien9 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*76,1,3,4);
		
		GreenAlienTongue alien10 = new GreenAlienTongue(this.gp,gp.tileSize*11,gp.tileSize*73,-1,3,4);     
		GreenAlienTongue alien11 = new GreenAlienTongue(this.gp,gp.tileSize*8,gp.tileSize*73,-1,3,4);       
		                                                                                                   
		GreenAlienTongue alien12 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*70,0,3,4);
		GreenAlienTongue alien13 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*68,0,3,4);
		GreenAlienTongue alien14 = new GreenAlienTongue(this.gp,gp.tileSize*2,gp.tileSize*67,0,3,4);
		GreenAlienTongue alien15 = new GreenAlienTongue(this.gp,gp.tileSize*3,gp.tileSize*69,0,3,4);
		
		GreenAlienTongue alien16 = new GreenAlienTongue(this.gp,gp.tileSize*10,gp.tileSize*70,0,3,4);
		GreenAlienTongue alien17 = new GreenAlienTongue(this.gp,gp.tileSize*8 + (gp.tileSize/2),gp.tileSize*69,0,3,4);
		GreenAlienTongue alien18 = new GreenAlienTongue(this.gp,gp.tileSize*10 + (gp.tileSize/2),gp.tileSize*69,0,3,4);
		
		GreenAlienTongue alien19 = new GreenAlienTongue(this.gp,gp.tileSize*4,gp.tileSize*64,0,3,4);
		GreenAlienTongue alien20= new GreenAlienTongue(this.gp,gp.tileSize*6,gp.tileSize*64,0,3,4);
		
		GreenAlienTongue alien21 = new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*62 +(gp.tileSize/2),0,3,4);
		GreenAlienTongue alien22= new GreenAlienTongue(this.gp,gp.tileSize*0,gp.tileSize*63 + (gp.tileSize/2),0,3,4);
		
		
		
		
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
		
	}
    
    
      
     

}
