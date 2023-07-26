package main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	private GamePanel gamePanel;
	public boolean upPressed,downPressed,leftPressed,rightPressed,spacePressed;
	
	
	public KeyHandler(GamePanel gp) {
		this.gamePanel = gp;
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		if (code == KeyEvent.VK_W) {
			upPressed = true;
		}
        if (code == KeyEvent.VK_S) {
			downPressed = true;
		}
        if (code == KeyEvent.VK_A) {
	        leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {
	        rightPressed = true;
        }
        if (code == KeyEvent.VK_SPACE) {
	        spacePressed = true;
        }
        if (code == KeyEvent.VK_P) {
        	gamePanel.togglePause();
        	if(gamePanel.paused == true) {
        		gamePanel.stopGameMusic();
        	}
        	else if(gamePanel.paused == false) {
        		gamePanel.startGameMusic();
        	}
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_W) {
			upPressed = false;
		}
        if (code == KeyEvent.VK_S) {
			downPressed = false;
		}
        if (code == KeyEvent.VK_A) {
	        leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {
	        rightPressed = false;
        }
        if (code == KeyEvent.VK_SPACE) {
	        spacePressed = false;
		
	}

}
}
