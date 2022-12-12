package com.xworkz.ipl.dto;

import com.xworkz.ipl.AbstractAuditDTO;

public class IplDTO extends AbstractAuditDTO{
	
	private String teamName;
	private String captainName;
	private boolean wonerAlive;
	private int wins;
	private int loss;
	private String ownerWifename;
	private float ratings;
	private int ranking;
	private int noOfPlayers;
	private int noOfSponoers;
	
	public IplDTO() {
		System.out.println("calling no arg constractor of IplDTO");
	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", wonerAlive=" + wonerAlive
				+ ", wins=" + wins + ", loss=" + loss + ", ownerWifename=" + ownerWifename + ", ratings=" + ratings
				+ ", ranking=" + ranking + ", noOfPlayers=" + noOfPlayers + ", noOfSponoers=" + noOfSponoers + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isWonerAlive() {
		return wonerAlive;
	}

	public void setWonerAlive(boolean wonerAlive) {
		this.wonerAlive = wonerAlive;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public String getOwnerWifename() {
		return ownerWifename;
	}

	public void setOwnerWifename(String ownerWifename) {
		this.ownerWifename = ownerWifename;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getNoOfSponoers() {
		return noOfSponoers;
	}

	public void setNoOfSponoers(int noOfSponoers) {
		this.noOfSponoers = noOfSponoers;
	}

	

}
