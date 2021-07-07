public class dimPersonalInfo {

    private int id_personal_info;
    private String fullname;
    private String playername;
    private int id_birthday;
    private int id_place;
    private int id_age;
    private String height;
    private int id_foot;

    public dimPersonalInfo(int id_personal_info, String fullname, String playername, int id_birthday, int id_place,
                           int id_age, String height, int id_foot) {
        this.id_personal_info = id_personal_info;
        this.fullname = fullname;
        this.playername = playername;
        this.id_birthday = id_birthday;
        this.id_place = id_place;
        this.id_age = id_age;
        this.height = height;
        this.id_foot = id_foot;
    }

    public dimPersonalInfo(dimPersonalInfo info){
        setId_personal_info(info.getId_personal_info());
        setFullname(info.getFullname());
        setPlayername(info.getPlayername());
        setId_birthday(info.getId_birthday());
        setId_place(info.getId_place());
        setId_age(info.getId_age());
        setHeight(info.getHeight());
        setId_foot(info.getId_foot());
    }

    public int getId(String fullname, String playername, int id_birthday, int id_place,
                     int id_age, String height, int id_foot) {

        if (this.fullname.equals(fullname) &&
                this.playername.equals(playername) &&
                this.id_birthday == id_birthday &&
                this.id_place == id_place &&
                this.id_age == id_age &&
                this.height.equals(height) &&
                this.id_foot == id_foot)

            return this.id_personal_info;

        return -1;
    }

    public int getId_personal_info() {
        return id_personal_info;
    }

    public void setId_personal_info(int id_personal_info) {
        this.id_personal_info = id_personal_info;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getId_birthday() {
        return id_birthday;
    }

    public void setId_birthday(int id_birthday) {
        this.id_birthday = id_birthday;
    }

    public int getId_place() {
        return id_place;
    }

    public void setId_place(int id_place) {
        this.id_place = id_place;
    }

    public int getId_age() {
        return id_age;
    }

    public void setId_age(int id_age) {
        this.id_age = id_age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getId_foot() {
        return id_foot;
    }

    public void setId_foot(int id_foot) {
        this.id_foot = id_foot;
    }

    public dimPersonalInfo clone(){
        return new dimPersonalInfo(this);
    }
}
