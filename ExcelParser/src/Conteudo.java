import java.util.ArrayList;
import java.util.List;

public class Conteudo {

    private String fullname;
    private String palyername;
    private String affiliation;
    private String league;
    private String jersey;
    private String birthDay;
    private String age;
    private String bithPlace;
    private String height;
    private String citizenship1;
    private String citizenship2;
    private String position;
    private String position2;
    private String foot;
    private String agent;
    private String joinedClub;
    private String lastExtension;
    private String contractExpiration;
    private String playerSponsor;
    private String youthClub1;
    private String youthClub2;
    private String youthClub3;
    private String youthClub4;
    private String youthClub5;
    private String youthClub6;
    private String youthClub7;
    private String nationality;
    private String gamesPlayed;
    private String marketValues;
    private String lastUpdateDate;
    private String accumulatedTransferSums;
    private String highestMarketValue;
    private String highestMarketValueDate;
    private String nationalTeamCaps;
    private String mostRecentInjury;

    public Conteudo() {
        this.fullname = "";
        this.palyername = "";
        this.affiliation = "";
        this.league = "";
        this.jersey = "";
        this.birthDay = "";
        this.age = "";
        this.bithPlace = "";
        this.height = "";
        this.citizenship1 = "";
        this.citizenship2 = "";
        this.position = "";
        this.position2 = "";
        this.foot = "";
        this.agent = "";
        this.joinedClub = "";
        this.lastExtension = "";
        this.contractExpiration = "";
        this.playerSponsor = "";
        this.youthClub1 = "";
        this.youthClub2 = "";
        this.youthClub3 = "";
        this.youthClub4 = "";
        this.youthClub5 = "";
        this.youthClub6 = "";
        this.youthClub7 = "";
        this.nationality = "";
        this.gamesPlayed = "";
        this.marketValues = "";
        this.lastUpdateDate = "";
        this.accumulatedTransferSums = "";
        this.highestMarketValue = "";
        this.highestMarketValueDate = "";
        this.nationalTeamCaps = "";
        this.mostRecentInjury = "";
    }

    public Conteudo(String fullname, String palyername, String affiliation, String league, String jersey,
                    String birthDay, String age, String bithPlace, String height, String citizenship1,
                    String citizenship2, String position, String position2, String foot, String agent,
                    String joinedClub, String lastExtension, String contractExpiration, String playerSponsor,
                    String youthClub1, String youthClub2, String youthClub3, String youthClub4, String youthClub5,
                    String youthClub6, String youthClub7, String nationality, String gamesPlayed, String marketValues,
                    String lastUpdateDate, String accumulatedTransferSums, String highestMarketValue,
                    String highestMarketValueDate, String nationalTeamCaps, String mostRecentInjury) {
        this.fullname = fullname;
        this.palyername = palyername;
        this.affiliation = affiliation;
        this.league = league;
        this.jersey = jersey;
        this.birthDay = birthDay;
        this.age = age;
        this.bithPlace = bithPlace;
        this.height = height;
        this.citizenship1 = citizenship1;
        this.citizenship2 = citizenship2;
        this.position = position;
        this.position2 = position2;
        this.foot = foot;
        this.agent = agent;
        this.joinedClub = joinedClub;
        this.lastExtension = lastExtension;
        this.contractExpiration = contractExpiration;
        this.playerSponsor = playerSponsor;
        this.youthClub1 = youthClub1;
        this.youthClub2 = youthClub2;
        this.youthClub3 = youthClub3;
        this.youthClub4 = youthClub4;
        this.youthClub5 = youthClub5;
        this.youthClub6 = youthClub6;
        this.youthClub7 = youthClub7;
        this.nationality = nationality;
        this.gamesPlayed = gamesPlayed;
        this.marketValues = marketValues;
        this.lastUpdateDate = lastUpdateDate;
        this.accumulatedTransferSums = accumulatedTransferSums;
        this.highestMarketValue = highestMarketValue;
        this.highestMarketValueDate = highestMarketValueDate;
        this.nationalTeamCaps = nationalTeamCaps;
        this.mostRecentInjury = mostRecentInjury;
    }

    public Conteudo(Conteudo c) {
        this.fullname = c.getFullname();
        this.palyername = c.getPalyername();
        this.affiliation = c.getAffiliation();
        this.league = c.getLeague();
        this.jersey = c.getJersey();
        this.birthDay = c.getBirthDay();
        this.age = c.getAge();
        this.bithPlace = c.getBithPlace();
        this.height = c.getHeight();
        this.citizenship1 = c.getCitizenship1();
        this.citizenship2 = c.getCitizenship2();
        this.position = c.getPosition();
        this.position2 = c.getPosition2();
        this.foot = c.getFoot();
        this.agent = c.getAgent();
        this.joinedClub = c.getJoinedClub();
        this.lastExtension = c.getLastExtension();
        this.contractExpiration = c.getContractExpiration();
        this.playerSponsor = c.getPlayerSponsor();
        this.youthClub1 = c.getYouthClub1();
        this.youthClub2 = c.getYouthClub2();
        this.youthClub3 = c.getYouthClub3();
        this.youthClub4 = c.getYouthClub4();
        this.youthClub5 = c.getYouthClub5();
        this.youthClub6 = c.getYouthClub6();
        this.youthClub7 = c.getYouthClub7();
        this.nationality = c.getNationality();
        this.gamesPlayed = c.getGamesPlayed();
        this.marketValues = c.getMarketValues();
        this.lastUpdateDate = c.getLastUpdateDate();
        this.accumulatedTransferSums = c.getAccumulatedTransferSums();
        this.highestMarketValue = c.getHighestMarketValue();
        this.highestMarketValueDate = c.getHighestMarketValueDate();
        this.nationalTeamCaps = c.getNationalTeamCaps();
        this.mostRecentInjury = c.getMostRecentInjury();
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPalyername() {
        return this.palyername;
    }

    public void setPalyername(String palyername) {
        this.palyername = palyername;
    }

    public String getAffiliation() {
        return this.affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getLeague() {
        return this.league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getJersey() {
        return this.jersey;
    }

    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBithPlace() {
        return this.bithPlace;
    }

    public void setBithPlace(String bithPlace) {
        this.bithPlace = bithPlace;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCitizenship1() {
        return this.citizenship1;
    }

    public void setCitizenship1(String citizenship1) {
        this.citizenship1 = citizenship1;
    }

    public String getCitizenship2() {
        return this.citizenship2;
    }

    public void setCitizenship2(String citizenship2) {
        this.citizenship2 = citizenship2;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition2() {
        return this.position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2;
    }

    public String getFoot() {
        return this.foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getAgent() {
        return this.agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getJoinedClub() {
        return this.joinedClub;
    }

    public void setJoinedClub(String joinedClub) {
        this.joinedClub = joinedClub;
    }

    public String getLastExtension() {
        return this.lastExtension;
    }

    public void setLastExtension(String lastExtension) {
        this.lastExtension = lastExtension;
    }

    public String getContractExpiration() {
        return this.contractExpiration;
    }

    public void setContractExpiration(String contractExpiration) {
        this.contractExpiration = contractExpiration;
    }

    public String getPlayerSponsor() {
        return this.playerSponsor;
    }

    public void setPlayerSponsor(String playerSponsor) {
        this.playerSponsor = playerSponsor;
    }

    public String getYouthClub1() {
        return this.youthClub1;
    }

    public void setYouthClub1(String youthClub1) {
        this.youthClub1 = youthClub1;
    }

    public String getYouthClub2() {
        return this.youthClub2;
    }

    public void setYouthClub2(String youthClub2) {
        this.youthClub2 = youthClub2;
    }

    public String getYouthClub3() {
        return this.youthClub3;
    }

    public void setYouthClub3(String youthClub3) {
        this.youthClub3 = youthClub3;
    }

    public String getYouthClub4() {
        return this.youthClub4;
    }

    public void setYouthClub4(String youthClub4) {
        this.youthClub4 = youthClub4;
    }

    public String getYouthClub5() {
        return this.youthClub5;
    }

    public void setYouthClub5(String youthClub5) {
        this.youthClub5 = youthClub5;
    }

    public String getYouthClub6() {
        return this.youthClub6;
    }

    public void setYouthClub6(String youthClub6) {
        this.youthClub6 = youthClub6;
    }

    public String getYouthClub7() {
        return this.youthClub7;
    }

    public void setYouthClub7(String youthClub7) {
        this.youthClub7 = youthClub7;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGamesPlayed() {
        return this.gamesPlayed;
    }

    public void setGamesPlayed(String gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getMarketValues() {
        return this.marketValues;
    }

    public void setMarketValues(String marketValues) {
        this.marketValues = marketValues;
    }

    public String getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getAccumulatedTransferSums() {
        return this.accumulatedTransferSums;
    }

    public void setAccumulatedTransferSums(String accumulatedTransferSums) {
        this.accumulatedTransferSums = accumulatedTransferSums;
    }

    public String getHighestMarketValue() {
        return this.highestMarketValue;
    }

    public void setHighestMarketValue(String highestMarketValue) {
        this.highestMarketValue = highestMarketValue;
    }

    public String getHighestMarketValueDate() {
        return this.highestMarketValueDate;
    }

    public void setHighestMarketValueDate(String highestMarketValueDate) {
        this.highestMarketValueDate = highestMarketValueDate;
    }

    public String getNationalTeamCaps() {
        return this.nationalTeamCaps;
    }

    public void setNationalTeamCaps(String nationalTeamCaps) {
        this.nationalTeamCaps = nationalTeamCaps;
    }

    public String getMostRecentInjury() {
        return this.mostRecentInjury;
    }

    public void setMostRecentInjury(String mostRecentInjury) {
        this.mostRecentInjury = mostRecentInjury;
    }

    @Override
    public Conteudo clone() {
        return new Conteudo(this);
    }


}
