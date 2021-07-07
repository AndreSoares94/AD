public class dimContract {

    public int id_contract;
    public int id_agent;
    public int id_joined_club;
    public String last_extension;
    public int id_contract_Expiration;
    public int id_player_sponsor;

    public dimContract(int id_contract, int id_agent, int id_joined_club, String last_extension,
                       int id_contract_Expiration, int id_player_sponsor) {
        this.id_contract = id_contract;
        this.id_agent = id_agent;
        this.id_joined_club = id_joined_club;
        this.last_extension = last_extension;
        this.id_contract_Expiration = id_contract_Expiration;
        this.id_player_sponsor = id_player_sponsor;
    }

    public dimContract(dimContract contract){
        setId_contract(contract.getId_contract());
        setId_agent(contract.getId_agent());
        setId_joined_club(contract.getId_joined_club());
        setLast_extension(contract.getLast_extension());
        setId_contract_Expiration(contract.getId_contract_Expiration());
        setId_player_sponsor(contract.getId_player_sponsor());
    }

    public int getId(int id_agent, int id_joined_club, String last_extension,
                       int id_contract_Expiration, int id_player_sponsor) {

        if(this.id_agent == id_agent &&
                this.id_joined_club == id_joined_club &&
                this.last_extension.equals(last_extension) &&
                this.id_contract_Expiration == id_contract_Expiration &&
                this.id_player_sponsor == id_player_sponsor)

            return this.id_contract;

        return  -1;
    }

    public int getId_contract() {
        return id_contract;
    }

    public void setId_contract(int id_contract) {
        this.id_contract = id_contract;
    }

    public int getId_agent() {
        return id_agent;
    }

    public void setId_agent(int id_agent) {
        this.id_agent = id_agent;
    }

    public int getId_joined_club() {
        return id_joined_club;
    }

    public void setId_joined_club(int id_joined_club) {
        this.id_joined_club = id_joined_club;
    }

    public String getLast_extension() {
        return last_extension;
    }

    public void setLast_extension(String last_extension) {
        this.last_extension = last_extension;
    }

    public int getId_contract_Expiration() {
        return id_contract_Expiration;
    }

    public void setId_contract_Expiration(int id_contract_Expiration) {
        this.id_contract_Expiration = id_contract_Expiration;
    }

    public int getId_player_sponsor() {
        return id_player_sponsor;
    }

    public void setId_player_sponsor(int id_player_sponsor) {
        this.id_player_sponsor = id_player_sponsor;
    }

    public dimContract clone(){
        return new dimContract(this);
    }
}
