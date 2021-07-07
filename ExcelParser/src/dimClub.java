public class dimClub {

    private int id_club;
    private int id_affiliation;
    private int id_league;
    private int id_jersey;
    private int id_position;
    private int id_position1;

    public dimClub(int id_club, int id_affiliation, int id_league, int id_jersey, int id_position, int id_position1) {
        this.id_club = id_club;
        this.id_affiliation = id_affiliation;
        this.id_league = id_league;
        this.id_jersey = id_jersey;
        this.id_position = id_position;
        this.id_position1 = id_position1;
    }

    public dimClub(dimClub club){
        setId_club(club.getId_club());
        setId_affiliation(club.getId_affiliation());
        setId_league(club.getId_league());
        setId_jersey(club.getId_jersey());
        setId_position(club.getId_position());
        setId_position1(club.getId_position1());
    }

    public int getId(int id_affiliation, int id_league, int id_jersey, int id_position, int id_position1) {

        if (this.id_affiliation == id_affiliation &&
                this.id_league == id_league &&
                this.id_jersey == id_jersey &&
                this.id_position == id_position &&
                this.id_position1 == id_position1)

            return this.id_club;

        return -1;
    }

    public int getId_club() {
        return id_club;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public int getId_affiliation() {
        return id_affiliation;
    }

    public void setId_affiliation(int id_affiliation) {
        this.id_affiliation = id_affiliation;
    }

    public int getId_league() {
        return id_league;
    }

    public void setId_league(int id_league) {
        this.id_league = id_league;
    }

    public int getId_jersey() {
        return id_jersey;
    }

    public void setId_jersey(int id_jersey) {
        this.id_jersey = id_jersey;
    }

    public int getId_position() {
        return id_position;
    }

    public void setId_position(int id_position) {
        this.id_position = id_position;
    }

    public int getId_position1() {
        return id_position1;
    }

    public void setId_position1(int id_position1) {
        this.id_position1 = id_position1;
    }

    public dimClub clone(){
        return new dimClub(this);
    }
}
