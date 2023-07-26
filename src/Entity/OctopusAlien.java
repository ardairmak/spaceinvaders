package Entity;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OctopusAlien extends Alien{
	
	public OctopusAlien(GamePanel gp,int x,int y,int direction,int speed,int initialHealth) {
		super(gp,x,y,direction,speed,initialHealth);
		getImage();
	}
	
	public void getImage() {
		try {
			
			up = ImageIO.read(getClass().getResourceAsStream("/alien/octopus4.png"));
			down = ImageIO.read(getClass().getResourceAsStream("/alien/octopus3.png"));
			mid = ImageIO.read(getClass().getResourceAsStream("/alien/octopus2.png"));
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setOctopusAliensLevel1() {
		
		OctopusAlien alien = new OctopusAlien(this.gp,gp.tileSize*0,gp.tileSize*54,0,1,6);
		OctopusAlien alien1 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*52,0,1,6);
		OctopusAlien alien2 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*54,0,1,6);
		OctopusAlien alien3 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*52,0,1,6);
		OctopusAlien alien4 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*54,0,1,6);
		OctopusAlien alien5 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*52,0,1,6);
		OctopusAlien alien6 = new OctopusAlien(this.gp,gp.tileSize*12,gp.tileSize*54,0,1,6);
		
		OctopusAlien alien7 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*31,1,1,6);
		OctopusAlien alien8 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*30,-1,1,6);
		OctopusAlien alien9 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*29,1,1,6);
		
		OctopusAlien alien10 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*27,1,1,6);
		OctopusAlien alien11 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*26,1,1,6);
		OctopusAlien alien12 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*25,1,1,6);
		OctopusAlien alien13 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*24,1,1,6);
		OctopusAlien alien14 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*23,1,1,6);
		
		OctopusAlien alien20 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*26,1,1,6);
		OctopusAlien alien21 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*26,1,1,6);
		OctopusAlien alien22 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*25,1,1,6);
		OctopusAlien alien23 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*25,1,1,6);
		OctopusAlien alien24 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*24,1,1,6);
		OctopusAlien alien25 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*24,1,1,6);
		
		
		OctopusAlien alien15 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*22,-1,1,6);
		OctopusAlien alien16 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*21,-1,1,6);
		OctopusAlien alien17 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*20,-1,1,6);
		OctopusAlien alien18 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*19,-1,1,6);
		OctopusAlien alien19 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*18,-1,1,6);
		
		OctopusAlien alien26 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*21,-1,1,6);
		OctopusAlien alien27 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*21,-1,1,6);
		OctopusAlien alien28 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*20,-1,1,6);
		OctopusAlien alien29 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*20,-1,1,6);
		OctopusAlien alien30 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*19,-1,1,6);
		OctopusAlien alien31 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*19,-1,1,6);
		
		OctopusAlien alien32 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*17,1,1,6);
		OctopusAlien alien33 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*16,1,1,6);
		OctopusAlien alien34 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*15,1,1,6);
		OctopusAlien alien35 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*14,1,1,6);
		OctopusAlien alien36 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*13,1,1,6);
		
		OctopusAlien alien37 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*16,1,1,6);
		OctopusAlien alien38 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*16,1,1,6);
		OctopusAlien alien39 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*15,1,1,6);
		OctopusAlien alien40 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*15,1,1,6);
		OctopusAlien alien41 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*14,1,1,6);
		OctopusAlien alien42 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*14,1,1,6);
		
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
		
		
	}
	public void setOctopusAliensLevel2() {
		
		OctopusAlien alien = new OctopusAlien(this.gp,gp.tileSize*0,gp.tileSize*54,0,2,6);
		OctopusAlien alien1 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*52,0,2,6);
		OctopusAlien alien2 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*54,0,2,6);
		OctopusAlien alien3 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*52,0,2,6);
		OctopusAlien alien4 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*54,0,2,6);
		OctopusAlien alien5 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*52,0,2,6);
		OctopusAlien alien6 = new OctopusAlien(this.gp,gp.tileSize*12,gp.tileSize*54,0,2,6);
		
		OctopusAlien alien7 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*31,1,2,6);
		OctopusAlien alien8 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*30,-1,2,6);
		OctopusAlien alien9 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*29,1,2,6);
		
		OctopusAlien alien10 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*27,1,2,6);
		OctopusAlien alien11 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*26,1,2,6);
		OctopusAlien alien12 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*25,1,2,6);
		OctopusAlien alien13 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*24,1,2,6);
		OctopusAlien alien14 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*23,1,2,6);
		
		OctopusAlien alien20 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*26,1,2,6);
		OctopusAlien alien21 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*26,1,2,6);
		OctopusAlien alien22 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*25,1,2,6);
		OctopusAlien alien23 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*25,1,2,6);
		OctopusAlien alien24 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*24,1,2,6);
		OctopusAlien alien25 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*24,1,2,6);
		
		
		OctopusAlien alien15 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*22,-1,2,6);
		OctopusAlien alien16 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*21,-1,2,6);
		OctopusAlien alien17 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*20,-1,2,6);
		OctopusAlien alien18 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*19,-1,2,6);
		OctopusAlien alien19 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*18,-1,2,6);
		
		OctopusAlien alien26 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*21,-1,2,6);
		OctopusAlien alien27 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*21,-1,2,6);
		OctopusAlien alien28 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*20,-1,2,6);
		OctopusAlien alien29 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*20,-1,2,6);
		OctopusAlien alien30 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*19,-1,2,6);
		OctopusAlien alien31 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*19,-1,2,6);
		
		OctopusAlien alien32 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*17,1,2,6);
		OctopusAlien alien33 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*16,1,2,6);
		OctopusAlien alien34 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*15,1,2,6);
		OctopusAlien alien35 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*14,1,2,6);
		OctopusAlien alien36 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*13,1,2,6);
		
		OctopusAlien alien37 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*16,1,2,6);
		OctopusAlien alien38 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*16,1,2,6);
		OctopusAlien alien39 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*15,1,2,6);
		OctopusAlien alien40 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*15,1,2,6);
		OctopusAlien alien41 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*14,1,2,6);
		OctopusAlien alien42 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*14,1,2,6);
		
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
		
	}
    public void setOctopusAliensLevel3() {
    	
    	OctopusAlien alien = new OctopusAlien(this.gp,gp.tileSize*0,gp.tileSize*54,0,3,6);
		OctopusAlien alien1 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*52,0,3,6);
		OctopusAlien alien2 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*54,0,3,6);
		OctopusAlien alien3 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*52,0,3,6);
		OctopusAlien alien4 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*54,0,3,6);
		OctopusAlien alien5 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*52,0,3,6);
		OctopusAlien alien6 = new OctopusAlien(this.gp,gp.tileSize*12,gp.tileSize*54,0,3,6);
		
		OctopusAlien alien7 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*31,1,3,6);
		OctopusAlien alien8 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*30,-1,3,6);
		OctopusAlien alien9 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*29,1,3,6);
		
		OctopusAlien alien10 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*27,1,3,6);
		OctopusAlien alien11 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*26,1,3,6);
		OctopusAlien alien12 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*25,1,3,6);
		OctopusAlien alien13 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*24,1,3,6);
		OctopusAlien alien14 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*23,1,3,6);
		
		OctopusAlien alien20 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*26,1,3,6);
		OctopusAlien alien21 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*26,1,3,6);
		OctopusAlien alien22 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*25,1,3,6);
		OctopusAlien alien23 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*25,1,3,6);
		OctopusAlien alien24 = new OctopusAlien(this.gp,gp.tileSize*2,gp.tileSize*24,1,3,6);
		OctopusAlien alien25 = new OctopusAlien(this.gp,gp.tileSize*1,gp.tileSize*24,1,3,6);
		
		
		OctopusAlien alien15 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*22,-1,3,6);
		OctopusAlien alien16 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*21,-1,3,6);
		OctopusAlien alien17 = new OctopusAlien(this.gp,gp.tileSize*8,gp.tileSize*20,-1,3,6);
		OctopusAlien alien18 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*19,-1,3,6);
		OctopusAlien alien19 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*18,-1,3,6);
		
		OctopusAlien alien26 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*21,-1,3,6);
		OctopusAlien alien27 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*21,-1,3,6);
		OctopusAlien alien28 = new OctopusAlien(this.gp,gp.tileSize*9,gp.tileSize*20,-1,3,6);
		OctopusAlien alien29 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*20,-1,3,6);
		OctopusAlien alien30 = new OctopusAlien(this.gp,gp.tileSize*10,gp.tileSize*19,-1,3,6);
		OctopusAlien alien31 = new OctopusAlien(this.gp,gp.tileSize*11,gp.tileSize*19,-1,3,6);
		
		OctopusAlien alien32 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*17,1,3,6);
		OctopusAlien alien33 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*16,1,3,6);
		OctopusAlien alien34 = new OctopusAlien(this.gp,gp.tileSize*6,gp.tileSize*15,1,3,6);
		OctopusAlien alien35 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*14,1,3,6);
		OctopusAlien alien36 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*13,1,3,6);
		
		OctopusAlien alien37 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*16,1,3,6);
		OctopusAlien alien38 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*16,1,3,6);
		OctopusAlien alien39 = new OctopusAlien(this.gp,gp.tileSize*5,gp.tileSize*15,1,3,6);
		OctopusAlien alien40 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*15,1,3,6);
		OctopusAlien alien41 = new OctopusAlien(this.gp,gp.tileSize*4,gp.tileSize*14,1,3,6);
		OctopusAlien alien42 = new OctopusAlien(this.gp,gp.tileSize*3,gp.tileSize*14,1,3,6);
		
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
		
	}
   
      
      
     


}
