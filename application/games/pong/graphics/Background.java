package games.pong.graphics;

import java.awt.Color;
import java.awt.Graphics2D;

import com.game.Drawable;
import com.game.MyWindow;

public class Background implements Drawable
{

	@Override
	public void draw(final Graphics2D g)
	{
		g.setColor(Color.GRAY);

		g.fillRect(0, 0, 1048, 1048);

		g.setColor(Color.BLACK);
	}

}
