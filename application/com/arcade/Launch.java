package com.arcade;

import com.game.GameLoopImpl;
import com.game.ctrl.CtrlFactory;
import com.game.ctrl.KeyCtrlType;

public class Launch
{
	public static final KeyCtrlType	KEY_REQUEST_TYPE	= KeyCtrlType.Keyboard;
	public static final CtrlFactory	CTRL_FACTORY		= CtrlFactory.newCtrlFactory(KEY_REQUEST_TYPE);

	public static void main(final String[] args)
	{
		new GameLoopImpl(new Menu(CTRL_FACTORY));
	}
}