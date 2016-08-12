package com.players;

public abstract class Opponents {

	protected String opponentName = null;
	protected String opponentFlag = null;

	public Opponents(String opponentName, String opponentFlag) {
		this.opponentName = opponentName;
		this.opponentFlag = opponentFlag;
	}

	public Opponents() {
	}

	public String getOpponentName() {
		return opponentName;
	}

	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}

	public String getOpponentFlag() {
		return opponentFlag;
	}

	public void setOpponentFlag(String opponentFlag) {
		this.opponentFlag = opponentFlag;
	}

}
