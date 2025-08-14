package repository;

import entity.Team;

public class TeamRepository {
	
	//should return MI team details
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Royal Challenge Banglore");
		team.setCaptainName("Virat Kohli");
		team.setCoachName("abc");
		team.setQualified(false);
		team.setnRR(4.3f);
		team.setShortName("RCB");
		return team;
	}
	
	// add similar methods for remaining 8 teams

}
