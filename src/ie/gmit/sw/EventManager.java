package ie.gmit.sw;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventManager implements KeyListener {
// added event manager class
	protected Sprite player;
	
	public EventManager(Sprite player) {
		this.player = player;
	}
	
	
	
	public void keyPressed(KeyEvent e) {
	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		player.setDirection(Direction.RIGHT);
	} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		player.setDirection(Direction.LEFT);
	} else if (e.getKeyCode() == KeyEvent.VK_UP) {
		player.setDirection(Direction.UP);
	} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		player.setDirection(Direction.DOWN);
	} else if (e.getKeyCode() == KeyEvent.VK_Z) {
		toggleView();
	} else if (e.getKeyCode() == KeyEvent.VK_X) {
		player.move();
	} else {
		return;
	}
 }



	private void toggleView() {
		// TODO Auto-generated method stub
		
	}



	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	} 
}
