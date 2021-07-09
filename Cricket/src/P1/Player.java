package P1;
import java.io.*;
public class Player {
	int choice;
	private String playerId;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private String playingZone;
	Player(){}
	Player(String pId,String pN,int matches,int runs,String Pz){
		this.playerId=pId;
		this.playerName=pN;
		this.matchesPlayed=matches;
		this.runScored=runs;
		this.playingZone=Pz;
	}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public String getPlayingZone() {
		return playingZone;
	}
	public void setPlayingZone(String playingZone) {
		this.playingZone = playingZone;
	}
	
}

	
	
	


