import java.util.ArrayList;
import java.util.List;

public class MarketValues {

    private List<Conteudo> marketValues;

    public MarketValues(){
        this.marketValues = new ArrayList<>();
    }

    public MarketValues(List<Conteudo> marketValues){
        this.marketValues = new ArrayList<>();

        for (Conteudo c : marketValues)
            this.marketValues.add(c.clone());
    }

    public void addConteudo(Conteudo c){
        this.marketValues.add(c.clone());
    }

    public List<Conteudo> getMarketValues() {

        List<Conteudo> ret = new ArrayList<>();

        for (Conteudo c : marketValues)
            ret.add(c.clone());

        return ret;
    }

    public void setMarketValues(List<Conteudo> marketValues) {
        this.marketValues = new ArrayList<>();

        for (Conteudo c : marketValues)
            this.marketValues.add(c.clone());
    }

    public int tamanho(){
        return this.marketValues.size();
    }
}
