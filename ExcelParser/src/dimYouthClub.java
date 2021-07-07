public class dimYouthClub {

    private int id_youthClub;
    private int id_club1;
    private int id_club2;
    private int id_club3;
    private int id_club4;
    private int id_club5;
    private int id_club6;
    private int id_club7;

    public dimYouthClub(int id_youthClub, int id_club1, int id_club2, int id_club3, int id_club4,
                        int id_club5, int id_club6, int id_club7) {
        this.id_youthClub = id_youthClub;
        this.id_club1 = id_club1;
        this.id_club2 = id_club2;
        this.id_club3 = id_club3;
        this.id_club4 = id_club4;
        this.id_club5 = id_club5;
        this.id_club6 = id_club6;
        this.id_club7 = id_club7;
    }

    public dimYouthClub(dimYouthClub club){
        setId_youthClub(club.getId_youthClub());
        setId_club1(club.getId_club1());
        setId_club2(club.getId_club2());
        setId_club3(club.getId_club3());
        setId_club4(club.getId_club4());
        setId_club5(club.getId_club5());
        setId_club6(club.getId_club6());
        setId_club7(club.getId_club7());
    }

    public int getId(int id_club1, int id_club2, int id_club3, int id_club4,
                     int id_club5, int id_club6, int id_club7) {

        if (this.id_club1 == id_club1 &&
                this.id_club2 == id_club2 &&
                this.id_club3 == id_club3 &&
                this.id_club4 == id_club4 &&
                this.id_club5 == id_club5 &&
                this.id_club6 == id_club6 &&
                this.id_club7 == id_club7)

            return this.id_youthClub;

        return -1;
    }

    public int getId_youthClub() {
        return id_youthClub;
    }

    public void setId_youthClub(int id_youthClub) {
        this.id_youthClub = id_youthClub;
    }

    public int getId_club1() {
        return id_club1;
    }

    public void setId_club1(int id_club1) {
        this.id_club1 = id_club1;
    }

    public int getId_club2() {
        return id_club2;
    }

    public void setId_club2(int id_club2) {
        this.id_club2 = id_club2;
    }

    public int getId_club3() {
        return id_club3;
    }

    public void setId_club3(int id_club3) {
        this.id_club3 = id_club3;
    }

    public int getId_club4() {
        return id_club4;
    }

    public void setId_club4(int id_club4) {
        this.id_club4 = id_club4;
    }

    public int getId_club5() {
        return id_club5;
    }

    public void setId_club5(int id_club5) {
        this.id_club5 = id_club5;
    }

    public int getId_club6() {
        return id_club6;
    }

    public void setId_club6(int id_club6) {
        this.id_club6 = id_club6;
    }

    public int getId_club7() {
        return id_club7;
    }

    public void setId_club7(int id_club7) {
        this.id_club7 = id_club7;
    }

    public dimYouthClub clone(){
        return new dimYouthClub(this);
    }
}
