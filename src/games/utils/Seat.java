package games.utils;

import java.awt.Color;
import java.awt.event.KeyEvent;

public enum Seat {

   //
	P1(KeyEvent.VK_8, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_9, Color.RED, "Red"),
   //
	P2(KeyEvent.VK_W, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_D, KeyEvent.VK_Q, KeyEvent.VK_E, Color.BLUE, "Blue"),
   //
	P4(KeyEvent.VK_T, KeyEvent.VK_F, KeyEvent.VK_G, KeyEvent.VK_H, KeyEvent.VK_R, KeyEvent.VK_Y, new Color(0, 128, 0), "Green"),
   //
	P3(KeyEvent.VK_I, KeyEvent.VK_J, KeyEvent.VK_K, KeyEvent.VK_L, KeyEvent.VK_U, KeyEvent.VK_O, Color.YELLOW, "Yellow"),

   //
	P1_PlayerView(KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_8, KeyEvent.VK_4, KeyEvent.VK_7, KeyEvent.VK_9, Color.RED, "Red"),
   //
	P2_PlayerView(KeyEvent.VK_D, KeyEvent.VK_W, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_Q, KeyEvent.VK_E, Color.BLUE, "Blue"),
   //
	P4_PlayerView(KeyEvent.VK_F, KeyEvent.VK_G, KeyEvent.VK_H, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_Y, new Color(0, 128, 0), "Green"),
   //
	P3_PlayerView(KeyEvent.VK_I, KeyEvent.VK_J, KeyEvent.VK_K, KeyEvent.VK_L, KeyEvent.VK_U, KeyEvent.VK_O, Color.YELLOW, "YELLOW");

	public final int		UP, LEFT, DOWN, RIGHT;

	public final int		BTN1, BTN2;

	private String			name		= "";
	private boolean		playing	= false;
	private int				score		= 0;

	private final Color	color;

	private Seat(final int UP, final int LEFT, final int DOWN, final int RIGHT, final int BTN1, final int BTN2, final Color color, final String name) {
		this.UP = UP;
		this.LEFT = LEFT;
		this.DOWN = DOWN;
		this.RIGHT = RIGHT;
		this.BTN1 = BTN1;
		this.BTN2 = BTN2;
		this.color = color;
		this.name = name;
	}

	public Color getColor() {
		return this.color;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public boolean isPlaying() {
		return this.playing;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPlaying(final boolean playing) {
		this.playing = playing;
	}

	public void setScore(final int score) {
		this.score = score;
	}

}