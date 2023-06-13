package com.software_design.cricbuzz_cricinfo;

import java.util.Date;

public class Match {

    Team teamA;
    Team teamB;
    Date matchDate;
    String venue;
    Team tossWinner;
    InningDetails[] inningDetails;
    MatchType matchType;

    public Match(Team teamA, Team teamB, Date matchDate, String venue, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.venue = venue;
        this.inningDetails = new InningDetails[2];
        this.matchType = matchType;
    }
}
