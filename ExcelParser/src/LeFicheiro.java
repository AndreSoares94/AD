import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class LeFicheiro {

    public static String tiraEspacosInicio(String str){
        String ret = "";
        if (!str.isEmpty() && str.charAt(0) == ' ') {
            ret = str.substring(1);
        } else {
            ret = str;
        }

        return ret;
    }

    public static String trataDatas(String data, String split){

        if(data.length()>4){
            String[] dat = data.split(split);
            StringBuilder sb = new StringBuilder();
            sb.append(dat[2]).append("-").append(dat[1]).append("-").append(dat[0]);
            return sb.toString();
        }
        return data;
    }

    public static String trataDatas1(String data, String split){

        if(data.length()>4){
            String[] dat = data.split(split);
            StringBuilder sb = new StringBuilder();
            sb.append(dat[2]).append("-").append(dat[0]).append("-").append(dat[1]);
            return sb.toString();
        }
        return data;
    }

    public static String trataDatasMes(String data){

        if(data.length()>4){
            String[] dat = data.split(", ");
            String[] dat2 = dat[0].split(" ");
            switch (dat2[0]){

                case "Jan":
                    dat2[0] = "01";
                    break;
                case "Feb":
                    dat2[0] = "02";
                    break;
                case "Mar":
                    dat2[0] = "03";
                    break;
                case "Apr":
                    dat2[0] = "04";
                    break;
                case "May":
                    dat2[0] = "05";
                    break;
                case "Jun":
                    dat2[0] = "06";
                    break;
                case "Jul":
                    dat2[0] = "07";
                    break;
                case "Aug":
                    dat2[0] = "08";
                    break;
                case "Sep":
                    dat2[0] = "09";
                    break;
                case "Oct":
                    dat2[0] = "10";
                    break;
                case "Nov":
                    dat2[0] = "11";
                    break;
                case "Dec":
                    dat2[0] = "12";
                    break;

                default:
                    break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(dat[1]).append("-").append(dat2[0]).append("-").append(dat2[1]);
            return sb.toString();
        }
        return data;
    }

    public static void leFicheiro(MarketValues marketValues) throws IOException{

        List<String> testes = new ArrayList<>();

        String fullName, playerName, affiliation, league, jersey, birthDay, age, birthPlace, height, citizenship1,
                citizenship2, position, position2, foot, agent, joinedClub, lastExtension, contractExpiration,
                playerSponsor, youthClub1, youthClub2, youthClub3, youthClub4, youthClub5, youthClub6, youthClub7,
                nationality, gamesPlayed, marketValue, lastUpdateDate, accumulatedTransferSums, highestMarketValue,
                highestMarketValueDate, nationalityTeamCaps, mostRecentInjury;

        File file = new File("../MarketValues.xlsx");   //creating a new file instance
        FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file
        //creating Workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Iterator<Sheet> sheets = wb.iterator();
        XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
        Iterator<Row> itr = sheet.iterator();    //iterating over excel file
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (sheets.hasNext()) {
            Sheet sh = sheets.next();
            String name = sh.getSheetName();
            System.out.println("\nFicheiro " + name + "\n");
            itr = sh.rowIterator();
            Row row = itr.next();
            while (itr.hasNext()) {
                row = itr.next();
                Conteudo conteudo;
                System.out.println(i);

                boolean nulls = false;
                if(row.getCell(0) == null || row.getCell(0).toString().isEmpty()) {
                    fullName = "";
                }
                else
                    fullName = row.getCell(0).toString();
                if(row.getCell(1) == null || row.getCell(1).toString().isEmpty()){
                    playerName = "";
                }
                else {
                    playerName = row.getCell(1).toString();
                }
                if(row.getCell(2) == null || row.getCell(2).toString().isEmpty()){
                    affiliation = "";
                }
                else
                    affiliation = row.getCell(2).toString();
                if(row.getCell(3) == null || row.getCell(3).toString().isEmpty()){
                    league = "";
                }
                else
                    league = row.getCell(3).toString();
                if(row.getCell(4) == null || row.getCell(4).toString().isEmpty()){
                    jersey = "";
                }
                else
                    jersey = row.getCell(4).toString().substring(1);
                if(row.getCell(5) == null || row.getCell(5).toString().isEmpty()){
                    birthDay = "";
                }
                else {
                    birthDay = trataDatas1(row.getCell(5).toString(),"/");
                }
                if(row.getCell(6) == null || row.getCell(6).toString().isEmpty()){
                    age = "";
                }
                else
                    age = row.getCell(6).toString();
                if(row.getCell(7) == null || row.getCell(7).toString().isEmpty()){
                    birthPlace = "";
                }
                else
                    birthPlace = row.getCell(7).toString();
                if(row.getCell(8) == null || row.getCell(8).toString().isEmpty()){
                    height = "";
                }
                else
                    height = row.getCell(8).toString();
                if(row.getCell(9) == null || row.getCell(9).toString().isEmpty()){
                    citizenship1 = "";
                }
                else
                    citizenship1 = row.getCell(9).toString();
                if(row.getCell(10) == null || row.getCell(10).toString().isEmpty()){
                    citizenship2 = "";
                }
                else
                    citizenship2 = row.getCell(10).toString();
                if(row.getCell(11) == null || row.getCell(11).toString().isEmpty()){
                    position = "";
                }
                else{
                    position = row.getCell(11).toString();
                }
                if(row.getCell(12) == null || row.getCell(12).toString().isEmpty()){
                    position2 = "";
                }
                else {
                    position2 = row.getCell(12).toString();
                }
                if(row.getCell(13) == null || row.getCell(13).toString().isEmpty()){
                    foot = "";
                }
                else
                    foot = row.getCell(13).toString();
                if(row.getCell(14) == null || row.getCell(14).toString().isEmpty()){
                    agent = "";
                }
                else
                    agent = row.getCell(14).toString();
                if(row.getCell(15) == null || row.getCell(15).toString().isEmpty()){
                    joinedClub = "";
                }
                else {
                    joinedClub = trataDatasMes(row.getCell(15).toString());
                }
                if(row.getCell(16) == null || row.getCell(16).toString().isEmpty()){
                    lastExtension = "";
                }
                else
                    lastExtension = row.getCell(16).toString();
                if(row.getCell(17) == null || row.getCell(17).toString().isEmpty()){
                    contractExpiration = "";
                }
                else {
                    contractExpiration = trataDatas(row.getCell(17).toString(), "\\.");
                }
                if(row.getCell(18) == null || row.getCell(18).toString().isEmpty()){
                    playerSponsor = "";
                }
                else
                    playerSponsor = row.getCell(18).toString();
                if(row.getCell(19) == null || row.getCell(19).toString().isEmpty()){
                    youthClub1 = "";
                }
                else
                    youthClub1 = row.getCell(19).toString();
                if(row.getCell(20) == null || row.getCell(20).toString().isEmpty()){
                    youthClub2 = "";
                }
                else
                    youthClub2 = row.getCell(20).toString();
                if(row.getCell(21) == null || row.getCell(21).toString().isEmpty()){
                    youthClub3 = "";
                }
                else
                    youthClub3 = row.getCell(21).toString();
                if(row.getCell(22) == null || row.getCell(22).toString().isEmpty()){
                    youthClub4 = "";
                }
                else
                    youthClub4 = row.getCell(22).toString();
                if(row.getCell(23) == null || row.getCell(23).toString().isEmpty()){
                    youthClub5 = "";
                }
                else
                    youthClub5 = row.getCell(23).toString();
                if(row.getCell(24) == null || row.getCell(24).toString().isEmpty()){
                    youthClub6 = "";
                }
                else
                    youthClub6 = row.getCell(24).toString();
                if(row.getCell(25) == null || row.getCell(25).toString().isEmpty()){
                    youthClub7 = "";
                }
                else
                    youthClub7 = row.getCell(25).toString();
                if(row.getCell(26) == null || row.getCell(26).toString().isEmpty()){
                    nationality = "";
                }
                else
                    nationality = row.getCell(26).toString();
                if(row.getCell(27) == null || row.getCell(27).toString().isEmpty()){
                    gamesPlayed = "";
                }
                else
                    gamesPlayed = row.getCell(27).toString();
                if(row.getCell(28) == null || row.getCell(28).toString().isEmpty()){
                    marketValue = "";
                }
                else
                    marketValue = row.getCell(28).toString();
                if(row.getCell(29) == null || row.getCell(29).toString().isEmpty()){
                    lastUpdateDate = "";
                }
                else
                    lastUpdateDate = trataDatasMes(row.getCell(29).toString());
                if(row.getCell(30) == null || row.getCell(30).toString().isEmpty()){
                    accumulatedTransferSums = "";
                }
                else
                    accumulatedTransferSums = row.getCell(30).toString();
                if(row.getCell(31) == null || row.getCell(31).toString().isEmpty()){
                    highestMarketValue = "";
                }
                else
                    highestMarketValue = row.getCell(31).toString();
                if(row.getCell(32) == null || row.getCell(32).toString().isEmpty()){
                    highestMarketValueDate = "";
                }
                else
                    highestMarketValueDate = trataDatas1(row.getCell(32).toString(),"/");
                if(row.getCell(33) == null || row.getCell(33).toString().isEmpty()){
                    nationalityTeamCaps = "";
                }
                else
                    nationalityTeamCaps = row.getCell(33).toString();
                if(row.getCell(34) == null || row.getCell(34).toString().isEmpty()){
                    mostRecentInjury = "";
                }
                else
                    mostRecentInjury = row.getCell(34).toString();

                conteudo = new Conteudo(fullName,playerName,affiliation,league,jersey,birthDay,age,birthPlace,
                        height,citizenship1,citizenship2,position,position2,foot,agent,joinedClub,lastExtension,
                        contractExpiration,playerSponsor,youthClub1,youthClub2,youthClub3,youthClub4,youthClub5,
                        youthClub6,youthClub7,nationality,gamesPlayed,marketValue,lastUpdateDate,accumulatedTransferSums,
                        highestMarketValue,highestMarketValueDate,nationalityTeamCaps,mostRecentInjury);

                marketValues.addConteudo(conteudo.clone());

                i++;
            }
            System.out.println("Fim do " + name);
        }
    }


    public static void main(String[] args) throws IOException {

        MarketValues marketValues = new MarketValues();

        leFicheiro(marketValues);

        //System.out.println("\n");
        System.out.println(marketValues.tamanho());

        List<String> dim_place = new ArrayList<>();
        List<String> dim_age = new ArrayList<>();
        List<String> dim_foot = new ArrayList<>();
        List<String> dim_affiliation = new ArrayList<>();
        List<String> dim_league = new ArrayList<>();
        List<String> dim_jersey = new ArrayList<>();
        List<String> dim_position = new ArrayList<>();
        List<String> dim_playerSponsor = new ArrayList<>();
        List<String> dim_agent = new ArrayList<>();
        List<String> dim_citizenship = new ArrayList<>();
        List<String> dim_clubyouth = new ArrayList<>();
        List<String> dim_nationality = new ArrayList<>();
        List<String> dim_date = new ArrayList<>();

        List<dimValues> dimValues = new ArrayList<>();
        List<dimContract> dimContract = new ArrayList<>();
        List<dimPersonalInfo> dimPersonalInfo = new ArrayList<>();
        List<dimClub> dimClub = new ArrayList<>();
        List<dimYouthClub> dimYouthClub = new ArrayList<>();
        List<dimInternationalInfo> dimInternationalInfo = new ArrayList<>();

        scriptsTabelas.dim_place(marketValues, dim_place);
        System.out.println("--------------");
        scriptsTabelas.dim_age(marketValues, dim_age);
        System.out.println("--------------");
        scriptsTabelas.dim_foot(marketValues, dim_foot);
        System.out.println("--------------");
        scriptsTabelas.dim_affiliation(marketValues, dim_affiliation);
        System.out.println("--------------");
        scriptsTabelas.dim_league(marketValues, dim_league);
        System.out.println("--------------");
        scriptsTabelas.dim_jersey(marketValues, dim_jersey);
        System.out.println("--------------");
        scriptsTabelas.dim_position(marketValues, dim_position);
        System.out.println("--------------");
        scriptsTabelas.dim_sponsor(marketValues, dim_playerSponsor);
        System.out.println("--------------");
        scriptsTabelas.dim_agent(marketValues, dim_agent);
        System.out.println("--------------");
        scriptsTabelas.dim_citizenship(marketValues, dim_citizenship);
        System.out.println("--------------");
        scriptsTabelas.dim_clubyouth(marketValues, dim_clubyouth);
        System.out.println("--------------");
        scriptsTabelas.dim_nationality(marketValues, dim_nationality);
        System.out.println("--------------");
        scriptsTabelas.dim_date(marketValues, dim_date);
        System.out.println("--------------");
        scriptsTabelas.dim_values(marketValues, dimValues, dim_date);
        System.out.println("--------------");
        scriptsTabelas.dim_contract(marketValues, dimContract, dim_date, dim_agent,dim_playerSponsor);
        System.out.println("--------------");
        scriptsTabelas.dim_personal_info(marketValues, dimPersonalInfo, dim_date, dim_place, dim_age, dim_foot);
        System.out.println("--------------");
        scriptsTabelas.dim_club(marketValues, dimClub, dim_affiliation, dim_league, dim_jersey, dim_position);
        System.out.println("--------------");
        scriptsTabelas.dim_youthClub(marketValues, dimYouthClub, dim_clubyouth);
        System.out.println("--------------");
        scriptsTabelas.dim_international_info(marketValues, dimInternationalInfo, dim_citizenship, dim_nationality);
        System.out.println("--------------");
        scriptsTabelas.fact_table(marketValues, dimValues, dimContract, dimPersonalInfo, dimClub, dimYouthClub, dimInternationalInfo,
                                    dim_place, dim_age, dim_foot, dim_affiliation, dim_league, dim_jersey, dim_position,
                                    dim_playerSponsor, dim_agent, dim_citizenship, dim_clubyouth, dim_nationality, dim_date);
        System.out.println("--------FIM------");

        System.out.println("Fim do processamento dos dados e das criação dos scripts");
    }
}
