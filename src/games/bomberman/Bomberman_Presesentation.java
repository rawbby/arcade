package games.bomberman;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JPanel;

import environment.launch.Presentation;
import environment.model.Game;
import environment.model.KeyRequest;

public class Bomberman_Presesentation implements Presentation {

	Image img;

	/**
	 * @throws IOException
	 */
	public Bomberman_Presesentation() {
		img = Toolkit.getDefaultToolkit().getImage("res/games/bomberman/bomberman_Presesentation.png");
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(img, 0, 0, 1024,1024, null);
	}

	@Override
	public Game getGame(JPanel panel, KeyRequest KEYS) {
		return new Bomberman(panel, KEYS);
	}

}
