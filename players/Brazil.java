package com.players;

import com.descriptions.OpponentInterface;

public class Brazil extends Opponents implements OpponentInterface {
	

	public Brazil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brazil(String opponentName, String opponentFlag) {
		super(opponentName, opponentFlag);
		opponentName = "Brazil";
		opponentFlag = "Gold/Green";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void throwsRock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void throwsScissor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void throwsPaper() {
		// TODO Auto-generated method stub

	}

}
