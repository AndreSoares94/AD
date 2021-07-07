public class dimValues {

    private int id_values;
    private String market_values;
    private int id_last_update_date;
    private String accumulated_transfer_sums;
    private String highest_market_value;
    private int id_highest_market_value_date;

    public dimValues(int id_values, String market_values, int id_last_update_date, String accumulated_transfer_sums,
                     String highest_market_value, int id_highest_market_value_date) {
        this.id_values = id_values;
        this.market_values = market_values;
        this.id_last_update_date = id_last_update_date;
        this.accumulated_transfer_sums = accumulated_transfer_sums;
        this.highest_market_value = highest_market_value;
        this.id_highest_market_value_date = id_highest_market_value_date;
    }

    public dimValues(dimValues values){
        setId_values(values.getId_values());
        setMarket_values(values.getMarket_values());
        setId_last_update_date(values.getId_last_update_date());
        setAccumulated_transfer_sums(values.getAccumulated_transfer_sums());
        setHighest_market_value(values.getHighest_market_value());
        setId_highest_market_value_date(values.getId_highest_market_value_date());
    }

    public int getId(String market_values, int id_last_update_date, String accumulated_transfer_sums,
                     String highest_market_value, int id_highest_market_value_date) {
        if(this.market_values.equals(market_values) &&
                this.id_last_update_date == id_last_update_date &&
                this.accumulated_transfer_sums.equals(accumulated_transfer_sums) &&
                this.highest_market_value.equals(highest_market_value) &&
                this.id_highest_market_value_date == id_highest_market_value_date)

            return this.id_values;

        return -1;
    }

    public int getId_values() {
        return id_values;
    }

    public void setId_values(int id_values) {
        this.id_values = id_values;
    }

    public String getMarket_values() {
        return market_values;
    }

    public void setMarket_values(String market_values) {
        this.market_values = market_values;
    }

    public int getId_last_update_date() {
        return id_last_update_date;
    }

    public void setId_last_update_date(int id_last_update_date) {
        this.id_last_update_date = id_last_update_date;
    }

    public String getAccumulated_transfer_sums() {
        return accumulated_transfer_sums;
    }

    public void setAccumulated_transfer_sums(String accumulated_transfer_sums) {
        this.accumulated_transfer_sums = accumulated_transfer_sums;
    }

    public String getHighest_market_value() {
        return highest_market_value;
    }

    public void setHighest_market_value(String highest_market_value) {
        this.highest_market_value = highest_market_value;
    }

    public int getId_highest_market_value_date() {
        return id_highest_market_value_date;
    }

    public void setId_highest_market_value_date(int id_highest_market_value_date) {
        this.id_highest_market_value_date = id_highest_market_value_date;
    }

    public dimValues clone() {
        return new dimValues(this);
    }
}
