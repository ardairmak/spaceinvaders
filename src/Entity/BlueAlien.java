package Entity;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

public class BlueAlien extends Alien{
	
	public BlueAlien(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		speed = 2;
		
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/blueDown.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/blueMid.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/blueUp.png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setBlueAliensLevel1() {
		BlueAlien alien = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*57,0,1,5);
		BlueAlien alien1 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*57,0,1,5);
		BlueAlien alien2 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*57,0,1,5);
		BlueAlien alien3 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*57,0,1,5);
		BlueAlien alien4 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*57,0,1,5);
		BlueAlien alien5 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*57,0,1,5);
		BlueAlien alien6 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*57,0,1,5);
		BlueAlien alien7 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*57,0,1,5);
		BlueAlien alien8 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*57,0,1,5);
		BlueAlien alien9 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*57,0,1,5);
		BlueAlien alien10 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*57,0,1,5);
		
		BlueAlien alien11 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*47,1,1,5);
		BlueAlien alien12 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*48,1,1,5);
		BlueAlien alien13 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*49,1,1,5);
		BlueAlien alien14 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*50,1,1,5);
		
		BlueAlien alien15 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*45,1,1,5);
		BlueAlien alien16 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*44,1,1,5);
		BlueAlien alien17 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*43,1,1,5);
		BlueAlien alien18 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*42,1,1,5);
		
		BlueAlien alien19 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*40,1,1,5);
		BlueAlien alien20 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*39,1,1,5);
		BlueAlien alien21 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*38,1,1,5);
		BlueAlien alien22 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*37,1,1,5);
		
		BlueAlien alien23 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*35,0,1,5);
		BlueAlien alien24 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*35,0,1,5);
		BlueAlien alien25 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*35,0,1,5);
		BlueAlien alien26 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*35,0,1,5);
		BlueAlien alien27 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*35,0,1,5);
		
		BlueAlien alien28 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*35,0,1,5);
		BlueAlien alien29 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*35,0,1,5);
		BlueAlien alien30 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*35,0,1,5);
		BlueAlien alien31 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*35,0,1,5);
		BlueAlien alien32 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*35,0,1,5);
		
		BlueAlien alien33 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*32,0,1,5);
		BlueAlien alien34 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*32,0,1,5);
		BlueAlien alien35 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*32,0,1,5);
		BlueAlien alien36 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*32,0,1,5);
		BlueAlien alien37 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*32,0,1,5);
		BlueAlien alien38 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*32,0,1,5);
		BlueAlien alien39 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*32,0,1,5);
		BlueAlien alien40 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*32,0,1,5);
		
		BlueAlien alien41 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*11,0,1,5);
		BlueAlien alien42 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*10,0,1,5);
		BlueAlien alien43 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*9,0,1,5);
		BlueAlien alien44 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*8,0,1,5);
		BlueAlien alien45 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*7,0,1,5);
		BlueAlien alien46 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*11,0,1,5);
		BlueAlien alien47 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*11,0,1,5);
		BlueAlien alien48 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*11,0,1,5);
		BlueAlien alien49 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*11,0,1,5);
		BlueAlien alien50 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*7,0,1,5);
		BlueAlien alien51 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*7,0,1,5);
		BlueAlien alien52 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*7,0,1,5);
		BlueAlien alien53 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*7,0,1,5);
		BlueAlien alien54 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*10,0,1,5);
		BlueAlien alien55 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*9,0,1,5);
		BlueAlien alien56 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*9,0,1,5);
		BlueAlien alien57 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*9,0,1,5);
		
		BlueAlien alien58 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*11,0,1,5);
		BlueAlien alien59 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*10,0,1,5);
		BlueAlien alien60 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*9,0,1,5);
		BlueAlien alien61 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*8,0,1,5);
		BlueAlien alien62 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*7,0,1,5);
		BlueAlien alien63 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*11,0,1,5);
		BlueAlien alien64 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*11,0,1,5);
		BlueAlien alien65 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*11,0,1,5);
		BlueAlien alien66 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*11,0,1,5);
		BlueAlien alien67 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*7,0,1,5);
		BlueAlien alien68 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*7,0,1,5);
		BlueAlien alien69 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*7,0,1,5);
		BlueAlien alien70 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*7,0,1,5);
		BlueAlien alien71 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*10,0,1,5);
		BlueAlien alien72 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*9,0,1,5);
		BlueAlien alien73 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*9,0,1,5);
		BlueAlien alien74 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*9,0,1,5);
		
		
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
		gp.alienList.add(alien31);
		gp.alienList.add(alien32);
		gp.alienList.add(alien33);
		gp.alienList.add(alien34);
		gp.alienList.add(alien35);
		gp.alienList.add(alien36);
		gp.alienList.add(alien37);
		gp.alienList.add(alien38);
		gp.alienList.add(alien39);
		gp.alienList.add(alien40);
		gp.alienList.add(alien41);
		gp.alienList.add(alien42);
		gp.alienList.add(alien43);
		gp.alienList.add(alien44);
		gp.alienList.add(alien45);
		gp.alienList.add(alien46);
		gp.alienList.add(alien47);
		gp.alienList.add(alien48);
		gp.alienList.add(alien49);
		gp.alienList.add(alien50);
		gp.alienList.add(alien51);
		gp.alienList.add(alien52);
		gp.alienList.add(alien53);
		gp.alienList.add(alien54);
		gp.alienList.add(alien55);
		gp.alienList.add(alien56);
		gp.alienList.add(alien57);
		gp.alienList.add(alien58);
		gp.alienList.add(alien59);
		gp.alienList.add(alien60);
		gp.alienList.add(alien61);
		gp.alienList.add(alien62);
		gp.alienList.add(alien63);
		gp.alienList.add(alien64);
		gp.alienList.add(alien65);
		gp.alienList.add(alien66);
		gp.alienList.add(alien67);
		gp.alienList.add(alien68);
		gp.alienList.add(alien69);
		gp.alienList.add(alien70);
		gp.alienList.add(alien71);
		gp.alienList.add(alien72);
		gp.alienList.add(alien73);
		gp.alienList.add(alien74);
	 
	}
	
	public void setBlueAliensLevel2() {
		BlueAlien alien = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*57,0,2,5);
		BlueAlien alien1 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*57,0,2,5);
		BlueAlien alien2 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*57,0,2,5);
		BlueAlien alien3 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*57,0,2,5);
		BlueAlien alien4 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*57,0,2,5);
		BlueAlien alien5 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*57,0,2,5);
		BlueAlien alien6 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*57,0,2,5);
		BlueAlien alien7 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*57,0,2,5);
		BlueAlien alien8 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*57,0,2,5);
		BlueAlien alien9 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*57,0,2,5);
		BlueAlien alien10 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*57,0,2,5);
		
		BlueAlien alien11 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*47,1,2,5);
		BlueAlien alien12 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*48,1,2,5);
		BlueAlien alien13 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*49,1,2,5);
		BlueAlien alien14 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*50,1,2,5);
		
		BlueAlien alien15 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*45,1,2,5);
		BlueAlien alien16 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*44,1,2,5);
		BlueAlien alien17 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*43,1,2,5);
		BlueAlien alien18 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*42,1,2,5);
		
		BlueAlien alien19 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*40,1,2,5);
		BlueAlien alien20 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*39,1,2,5);
		BlueAlien alien21 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*38,1,2,5);
		BlueAlien alien22 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*37,1,2,5);
		
		BlueAlien alien23 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*35,0,2,5);
		BlueAlien alien24 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*35,0,2,5);
		BlueAlien alien25 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*35,0,2,5);
		BlueAlien alien26 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*35,0,2,5);
		BlueAlien alien27 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*35,0,2,5);
		
		BlueAlien alien28 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*35,0,2,5);
		BlueAlien alien29 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*35,0,2,5);
		BlueAlien alien30 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*35,0,2,5);
		BlueAlien alien31 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*35,0,2,5);
		BlueAlien alien32 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*35,0,2,5);
		
		BlueAlien alien33 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*32,0,2,5);
		BlueAlien alien34 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*32,0,2,5);
		BlueAlien alien35 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*32,0,2,5);
		BlueAlien alien36 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*32,0,2,5);
		BlueAlien alien37 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*32,0,2,5);
		BlueAlien alien38 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*32,0,2,5);
		BlueAlien alien39 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*32,0,2,5);
		BlueAlien alien40 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*32,0,2,5);
		
		BlueAlien alien41 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*11,0,2,5);
		BlueAlien alien42 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*10,0,2,5);
		BlueAlien alien43 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*9,0,2,5);
		BlueAlien alien44 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*8,0,2,5);
		BlueAlien alien45 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*7,0,2,5);
		BlueAlien alien46 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*11,0,2,5);
		BlueAlien alien47 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*11,0,2,5);
		BlueAlien alien48 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*11,0,2,5);
		BlueAlien alien49 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*11,0,2,5);
		BlueAlien alien50 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*7,0,2,5);
		BlueAlien alien51 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*7,0,2,5);
		BlueAlien alien52 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*7,0,2,5);
		BlueAlien alien53 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*7,0,2,5);
		BlueAlien alien54 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*10,0,2,5);
		BlueAlien alien55 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*9,0,2,5);
		BlueAlien alien56 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*9,0,2,5);
		BlueAlien alien57 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*9,0,2,5);
		
		BlueAlien alien58 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*11,0,2,5);
		BlueAlien alien59 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*10,0,2,5);
		BlueAlien alien60 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*9,0,2,5);
		BlueAlien alien61 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*8,0,2,5);
		BlueAlien alien62 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*7,0,2,5);
		BlueAlien alien63 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*11,0,2,5);
		BlueAlien alien64 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*11,0,2,5);
		BlueAlien alien65 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*11,0,2,5);
		BlueAlien alien66 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*11,0,2,5);
		BlueAlien alien67 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*7,0,2,5);
		BlueAlien alien68 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*7,0,2,5);
		BlueAlien alien69 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*7,0,2,5);
		BlueAlien alien70 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*7,0,2,5);
		BlueAlien alien71 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*10,0,2,5);
		BlueAlien alien72 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*9,0,2,5);
		BlueAlien alien73 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*9,0,2,5);
		BlueAlien alien74 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*9,0,2,5);
		
		
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
		gp.alienList.add(alien31);
		gp.alienList.add(alien32);
		gp.alienList.add(alien33);
		gp.alienList.add(alien34);
		gp.alienList.add(alien35);
		gp.alienList.add(alien36);
		gp.alienList.add(alien37);
		gp.alienList.add(alien38);
		gp.alienList.add(alien39);
		gp.alienList.add(alien40);
		gp.alienList.add(alien41);
		gp.alienList.add(alien42);
		gp.alienList.add(alien43);
		gp.alienList.add(alien44);
		gp.alienList.add(alien45);
		gp.alienList.add(alien46);
		gp.alienList.add(alien47);
		gp.alienList.add(alien48);
		gp.alienList.add(alien49);
		gp.alienList.add(alien50);
		gp.alienList.add(alien51);
		gp.alienList.add(alien52);
		gp.alienList.add(alien53);
		gp.alienList.add(alien54);
		gp.alienList.add(alien55);
		gp.alienList.add(alien56);
		gp.alienList.add(alien57);
		gp.alienList.add(alien58);
		gp.alienList.add(alien59);
		gp.alienList.add(alien60);
		gp.alienList.add(alien61);
		gp.alienList.add(alien62);
		gp.alienList.add(alien63);
		gp.alienList.add(alien64);
		gp.alienList.add(alien65);
		gp.alienList.add(alien66);
		gp.alienList.add(alien67);
		gp.alienList.add(alien68);
		gp.alienList.add(alien69);
		gp.alienList.add(alien70);
		gp.alienList.add(alien71);
		gp.alienList.add(alien72);
		gp.alienList.add(alien73);
		gp.alienList.add(alien74);
	}
	
    public void setBlueAliensLevel3() {
    	BlueAlien alien = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*57,0,3,5);
		BlueAlien alien1 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*57,0,3,5);
		BlueAlien alien2 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*57,0,3,5);
		BlueAlien alien3 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*57,0,3,5);
		BlueAlien alien4 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*57,0,3,5);
		BlueAlien alien5 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*57,0,3,5);
		BlueAlien alien6 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*57,0,3,5);
		BlueAlien alien7 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*57,0,3,5);
		BlueAlien alien8 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*57,0,3,5);
		BlueAlien alien9 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*57,0,3,5);
		BlueAlien alien10 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*57,0,3,5);
		
		BlueAlien alien11 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*47,1,3,5);
		BlueAlien alien12 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*48,1,3,5);
		BlueAlien alien13 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*49,1,3,5);
		BlueAlien alien14 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*50,1,3,5);
		
		BlueAlien alien15 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*45,1,3,5);
		BlueAlien alien16 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*44,1,3,5);
		BlueAlien alien17 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*43,1,3,5);
		BlueAlien alien18 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*42,1,3,5);
		
		BlueAlien alien19 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*40,1,3,5);
		BlueAlien alien20 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*39,1,3,5);
		BlueAlien alien21 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*38,1,3,5);
		BlueAlien alien22 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*37,1,3,5);
		
		BlueAlien alien23 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*35,0,3,5);
		BlueAlien alien24 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*35,0,3,5);
		BlueAlien alien25 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*35,0,3,5);
		BlueAlien alien26 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*35,0,3,5);
		BlueAlien alien27 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*35,0,3,5);
		
		BlueAlien alien28 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*35,0,3,5);
		BlueAlien alien29 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*35,0,3,5);
		BlueAlien alien30 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*35,0,3,5);
		BlueAlien alien31 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*35,0,3,5);
		BlueAlien alien32 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*35,0,3,5);
		
		BlueAlien alien33 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*32,0,3,5);
		BlueAlien alien34 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*32,0,3,5);
		BlueAlien alien35 = new BlueAlien(this.gp,gp.tileSize*4,gp.tileSize*32,0,3,5);
		BlueAlien alien36 = new BlueAlien(this.gp,gp.tileSize*5,gp.tileSize*32,0,3,5);
		BlueAlien alien37 = new BlueAlien(this.gp,gp.tileSize*6,gp.tileSize*32,0,3,5);
		BlueAlien alien38 = new BlueAlien(this.gp,gp.tileSize*7,gp.tileSize*32,0,3,5);
		BlueAlien alien39 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*32,0,3,5);
		BlueAlien alien40 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*32,0,3,5);
		
		BlueAlien alien41 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*11,0,3,5);
		BlueAlien alien42 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*10,0,3,5);
		BlueAlien alien43 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*9,0,3,5);
		BlueAlien alien44 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*8,0,3,5);
		BlueAlien alien45 = new BlueAlien(this.gp,gp.tileSize*-1,gp.tileSize*7,0,3,5);
		BlueAlien alien46 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*11,0,3,5);
		BlueAlien alien47 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*11,0,3,5);
		BlueAlien alien48 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*11,0,3,5);
		BlueAlien alien49 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*11,0,3,5);
		BlueAlien alien50 = new BlueAlien(this.gp,gp.tileSize*0,gp.tileSize*7,0,3,5);
		BlueAlien alien51 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*7,0,3,5);
		BlueAlien alien52 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*7,0,3,5);
		BlueAlien alien53 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*7,0,3,5);
		BlueAlien alien54 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*10,0,3,5);
		BlueAlien alien55 = new BlueAlien(this.gp,gp.tileSize*3,gp.tileSize*9,0,3,5);
		BlueAlien alien56 = new BlueAlien(this.gp,gp.tileSize*2,gp.tileSize*9,0,3,5);
		BlueAlien alien57 = new BlueAlien(this.gp,gp.tileSize*1,gp.tileSize*9,0,3,5);
		
		BlueAlien alien58 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*11,0,3,5);
		BlueAlien alien59 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*10,0,3,5);
		BlueAlien alien60 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*9,0,3,5);
		BlueAlien alien61 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*8,0,3,5);
		BlueAlien alien62 = new BlueAlien(this.gp,gp.tileSize*8,gp.tileSize*7,0,3,5);
		BlueAlien alien63 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*11,0,3,5);
		BlueAlien alien64 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*11,0,3,5);
		BlueAlien alien65 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*11,0,3,5);
		BlueAlien alien66 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*11,0,3,5);
		BlueAlien alien67 = new BlueAlien(this.gp,gp.tileSize*9,gp.tileSize*7,0,3,5);
		BlueAlien alien68 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*7,0,3,5);
		BlueAlien alien69 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*7,0,3,5);
		BlueAlien alien70 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*7,0,3,5);
		BlueAlien alien71 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*10,0,3,5);
		BlueAlien alien72 = new BlueAlien(this.gp,gp.tileSize*12,gp.tileSize*9,0,3,5);
		BlueAlien alien73 = new BlueAlien(this.gp,gp.tileSize*11,gp.tileSize*9,0,3,5);
		BlueAlien alien74 = new BlueAlien(this.gp,gp.tileSize*10,gp.tileSize*9,0,3,5);
		
		
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
		gp.alienList.add(alien31);
		gp.alienList.add(alien32);
		gp.alienList.add(alien33);
		gp.alienList.add(alien34);
		gp.alienList.add(alien35);
		gp.alienList.add(alien36);
		gp.alienList.add(alien37);
		gp.alienList.add(alien38);
		gp.alienList.add(alien39);
		gp.alienList.add(alien40);
		gp.alienList.add(alien41);
		gp.alienList.add(alien42);
		gp.alienList.add(alien43);
		gp.alienList.add(alien44);
		gp.alienList.add(alien45);
		gp.alienList.add(alien46);
		gp.alienList.add(alien47);
		gp.alienList.add(alien48);
		gp.alienList.add(alien49);
		gp.alienList.add(alien50);
		gp.alienList.add(alien51);
		gp.alienList.add(alien52);
		gp.alienList.add(alien53);
		gp.alienList.add(alien54);
		gp.alienList.add(alien55);
		gp.alienList.add(alien56);
		gp.alienList.add(alien57);
		gp.alienList.add(alien58);
		gp.alienList.add(alien59);
		gp.alienList.add(alien60);
		gp.alienList.add(alien61);
		gp.alienList.add(alien62);
		gp.alienList.add(alien63);
		gp.alienList.add(alien64);
		gp.alienList.add(alien65);
		gp.alienList.add(alien66);
		gp.alienList.add(alien67);
		gp.alienList.add(alien68);
		gp.alienList.add(alien69);
		gp.alienList.add(alien70);
		gp.alienList.add(alien71);
		gp.alienList.add(alien72);
		gp.alienList.add(alien73);
		gp.alienList.add(alien74);
	}
      
      
     


}
