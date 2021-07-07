public class dimInternationalInfo {

    private int id_international_info;
    private int id_citizenship;
    private int id_citizenship1;
    private int id_nationality;
    private String gamesPlayed;
    private String national_team_caps;
    private String most_recent_injury;

    public dimInternationalInfo(int id_international_info, int id_citizenship, int id_citizenship1,
                                int id_nationality, String gamesPlayed, String national_team_caps,
                                String most_recent_injury) {
        this.id_international_info = id_international_info;
        this.id_citizenship = id_citizenship;
        this.id_citizenship1 = id_citizenship1;
        this.id_nationality = id_nationality;
        this.gamesPlayed = gamesPlayed;
        this.national_team_caps = national_team_caps;
        this.most_recent_injury = most_recent_injury;
    }

    public dimInternationalInfo(dimInternationalInfo info){
        setId_international_info(info.getId_international_info());
        setId_citizenship(info.getId_citizenship());
        setId_citizenship1(info.getId_citizenship1());
        setId_nationality(info.getId_nationality());
        setGamesPlayed(info.getGamesPlayed());
        setNational_team_caps(info.getNational_team_caps());
        setMost_recent_injury(info.getMost_recent_injury());
    }

    public int getId(int id_citizenship, int id_citizenship1,
                     int id_nationality, String gamesPlayed, String national_team_caps,
                     String most_recent_injury) {

        if (this.id_citizenship == id_citizenship &&
                this.id_citizenship1 == id_citizenship1 &&
                this.id_nationality == id_nationality &&
                this.gamesPlayed.equals(gamesPlayed) &&
                this.national_team_caps.equals(national_team_caps) &&
                this.most_recent_injury.equals(most_recent_injury))

            return this.id_international_info;

        return -1;
    }

    public int getId_international_info() {
        return id_international_info;
    }

    public void setId_international_info(int id_international_info) {
        this.id_international_info = id_international_info;
    }

    public int getId_citizenship() {
        return id_citizenship;
    }

    public void setId_citizenship(int id_citizenship) {
        this.id_citizenship = id_citizenship;
    }

    public int getId_citizenship1() {
        return id_citizenship1;
    }

    public void setId_citizenship1(int id_citizenship1) {
        this.id_citizenship1 = id_citizenship1;
    }

    public int getId_nationality() {
        return id_nationality;
    }

    public void setId_nationality(int id_nationality) {
        this.id_nationality = id_nationality;
    }

    public String getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(String gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getNational_team_caps() {
        return national_team_caps;
    }

    public void setNational_team_caps(String national_team_caps) {
        this.national_team_caps = national_team_caps;
    }

    public String getMost_recent_injury() {
        return most_recent_injury;
    }

    public void setMost_recent_injury(String most_recent_injury) {
        this.most_recent_injury = most_recent_injury;
    }

    public dimInternationalInfo clone(){
        return new dimInternationalInfo(this);
    }
}
