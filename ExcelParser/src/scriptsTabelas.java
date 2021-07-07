import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class scriptsTabelas {

    public static void dim_place(MarketValues marketValues, List<String> dim_place){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_place.contains(c.getBithPlace()))
                dim_place.add(c.getBithPlace());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarPlace.sql"));

            int i = 1;
            for (String s : dim_place) {

                String query = "insert into dim_place values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_age(MarketValues marketValues, List<String> dim_age){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_age.contains(c.getAge()))
                dim_age.add(c.getAge());
        }
        String test;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarAge.sql"));

            int i = 1;
            for (String s : dim_age) {

                test = s;
                if(s.equals("NA"))
                    test="null";

                String query = "insert into dim_age values (" + i++ + ", " + test + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_foot(MarketValues marketValues, List<String> dim_foot){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_foot.contains(c.getFoot()))
                dim_foot.add(c.getFoot());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarFoot.sql"));

            int i = 1;
            for (String s : dim_foot) {

                String query = "insert into dim_foot values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_affiliation(MarketValues marketValues, List<String> dim_affiliation){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_affiliation.contains(c.getAffiliation()))
                dim_affiliation.add(c.getAffiliation());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarAffiliation.sql"));

            int i = 1;
            for (String s : dim_affiliation) {

                String query = "insert into dim_affiliation values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_league(MarketValues marketValues, List<String> dim_league){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_league.contains(c.getLeague()))
                dim_league.add(c.getLeague());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarLeague.sql"));

            int i = 1;
            for (String s : dim_league) {

                String query = "insert into dim_league values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_jersey(MarketValues marketValues, List<String> dim_jersey){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_jersey.contains(c.getJersey()))
                dim_jersey.add(c.getJersey());
        }

        String test;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarJersey.sql"));

            int i = 1;
            for (String s : dim_jersey) {

                test = s;
                if(s.equals("A"))
                    test="null";

                String query = "insert into dim_jersey values (" + i++ + ", " + test + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_position(MarketValues marketValues, List<String> dim_position){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_position.contains(c.getPosition()))
                dim_position.add(c.getPosition());
            if(!dim_position.contains(c.getPosition2()))
                dim_position.add(c.getPosition2());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarPosition.sql"));

            int i = 1;
            for (String s : dim_position) {

                String query = "insert into dim_position values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_sponsor(MarketValues marketValues, List<String> dim_sponsor){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_sponsor.contains(c.getPlayerSponsor()))
                dim_sponsor.add(c.getPlayerSponsor());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarSponsor.sql"));

            int i = 1;
            for (String s : dim_sponsor) {

                String query = "insert into dim_player_sponsor values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_agent(MarketValues marketValues, List<String> dim_agent){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_agent.contains(c.getAgent()))
                dim_agent.add(c.getAgent());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarAgent.sql"));

            int i = 1;
            for (String s : dim_agent) {

                String query = "insert into dim_agent values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_nationality(MarketValues marketValues, List<String> dim_nationality){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_nationality.contains(c.getNationality()))
                dim_nationality.add(c.getNationality());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarNationality.sql"));

            int i = 1;
            for (String s : dim_nationality) {

                String query = "insert into dim_nationality values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_citizenship(MarketValues marketValues, List<String> dim_citizenship){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_citizenship.contains(c.getCitizenship1()))
                dim_citizenship.add(c.getCitizenship1());
            if(!dim_citizenship.contains(c.getCitizenship2()))
                dim_citizenship.add(c.getCitizenship2());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarCitizenship.sql"));

            int i = 1;
            for (String s : dim_citizenship) {

                String query = "insert into dim_citizenship values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_clubyouth(MarketValues marketValues, List<String> dim_clubyouth){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_clubyouth.contains(c.getYouthClub1()))
                dim_clubyouth.add(c.getYouthClub1());
            if(!dim_clubyouth.contains(c.getYouthClub2()))
                dim_clubyouth.add(c.getYouthClub2());
            if(!dim_clubyouth.contains(c.getYouthClub3()))
                dim_clubyouth.add(c.getYouthClub3());
            if(!dim_clubyouth.contains(c.getYouthClub4()))
                dim_clubyouth.add(c.getYouthClub4());
            if(!dim_clubyouth.contains(c.getYouthClub5()))
                dim_clubyouth.add(c.getYouthClub5());
            if(!dim_clubyouth.contains(c.getYouthClub6()))
                dim_clubyouth.add(c.getYouthClub6());
            if(!dim_clubyouth.contains(c.getYouthClub7()))
                dim_clubyouth.add(c.getYouthClub7());
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarClubYouth.sql"));

            int i = 1;
            for (String s : dim_clubyouth) {

                String query = "insert into dim_clubyouth values (" + i++ + ", \"" + s + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_date(MarketValues marketValues, List<String> dim_date){

        for (Conteudo c : marketValues.getMarketValues()){

            if(!dim_date.contains(c.getBirthDay()))
                dim_date.add(c.getBirthDay());
            if(!dim_date.contains(c.getJoinedClub()))
                dim_date.add(c.getJoinedClub());
            if(!dim_date.contains(c.getContractExpiration()))
                dim_date.add(c.getContractExpiration());
            if(!dim_date.contains(c.getLastUpdateDate()))
                dim_date.add(c.getLastUpdateDate());
            if(!dim_date.contains(c.getHighestMarketValueDate()))
                dim_date.add(c.getHighestMarketValueDate());
        }

        String test;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarDate.sql"));

            int i = 1;
            for (String s : dim_date) {

                test = s;
                if(s.equals("NA")) {
                    test = "null";
                    String query = "insert into dim_date values (" + i++ + ", " + test + ");\n";
                    fos.write(query.getBytes());
                    fos.flush();
                }
                else {
                    String query = "insert into dim_date values (" + i++ + ", '" + test + "');\n";
                    fos.write(query.getBytes());
                    fos.flush();
                }
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_values(MarketValues marketValues, List<dimValues> values, List<String> dim_date){

        int count;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarValues.sql"));

            int i = 1;
            String market;
            String market1;
            String market2;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimValues value = new dimValues(count, c.getMarketValues(),
                        1+dim_date.indexOf(c.getLastUpdateDate()),
                        c.getAccumulatedTransferSums(), c.getHighestMarketValue(),
                        1+dim_date.indexOf(c.getHighestMarketValueDate()));

                values.add(value.clone());

                market = c.getMarketValues();
                if(market.equals("NA"))
                    market = "null";
                market1 = c.getAccumulatedTransferSums();
                if(market1.equals("NA"))
                    market1 = "null";
                market2 = c.getHighestMarketValue();
                if(market2.equals("NA"))
                    market2 = "null";

                String query = "insert into dim_values values (" + count + ", " + market + ", " +
                        (1+dim_date.indexOf(c.getLastUpdateDate())) + ", " + market1 + ", " +
                        market2 + ", " + (1+dim_date.indexOf(c.getHighestMarketValueDate())) + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_personal_info(MarketValues marketValues, List<dimPersonalInfo> infos, List<String> dim_date, List<String> dim_place,
                                         List<String> dim_age, List<String> dim_foot){

        int count;
        String height;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarPersonalInfo.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimPersonalInfo info = new dimPersonalInfo(count, c.getFullname(), c.getPalyername(), 1+dim_date.indexOf(c.getBirthDay()),
                        1+dim_place.indexOf(c.getBithPlace()), 1+dim_age.indexOf(c.getAge()), c.getHeight(), 1+dim_foot.indexOf(c.getFoot()));

                infos.add(info.clone());

                height = c.getHeight();
                if(height.equals("NA"))
                    height = "null";

                String query = "insert into dim_personal_info values (" + count + ", \"" + c.getFullname() + "\", \"" +
                        c.getPalyername() + "\", " + (1+dim_date.indexOf(c.getBirthDay())) + ", " + (1+dim_place.indexOf(c.getBithPlace())) + ", " +
                        (1+dim_age.indexOf(c.getAge())) + ", " + height + ", " + (1+dim_foot.indexOf(c.getFoot())) + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_club(MarketValues marketValues, List<dimClub> clubs, List<String> dim_affiliation, List<String> dim_league,
                                         List<String> dim_jersey, List<String> dim_position){

        int count;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarClub.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimClub club = new dimClub(count, 1+dim_affiliation.indexOf(c.getAffiliation()),
                        1+dim_league.indexOf(c.getLeague()), 1+dim_jersey.indexOf(c.getJersey()),
                        1+dim_position.indexOf(c.getPosition()), 1+dim_position.indexOf(c.getPosition2()));

                clubs.add(club.clone());

                String query = "insert into dim_club values (" + count + ", " + (1+dim_affiliation.indexOf(c.getAffiliation())) + ", " +
                        (1+dim_league.indexOf(c.getLeague())) + ", " + (1+dim_jersey.indexOf(c.getJersey())) + ", " +
                        (1+dim_position.indexOf(c.getPosition())) + ", " + (1+dim_position.indexOf(c.getPosition2())) + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_contract(MarketValues marketValues, List<dimContract> contracts, List<String> dim_date, List<String> dim_agent,
                                         List<String> dim_player_sponsor){

        int count;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarContract.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimContract contract = new dimContract(count, 1+dim_agent.indexOf(c.getAgent()),
                        1+dim_date.indexOf(c.getJoinedClub()), c.getLastExtension(),
                        1+dim_date.indexOf(c.getContractExpiration()),
                        1+dim_player_sponsor.indexOf(c.getPlayerSponsor()));

                contracts.add(contract.clone());

                String query = "insert into dim_contract values (" + count + ", " + (1+dim_agent.indexOf(c.getAgent())) + ", " +
                        (1+dim_date.indexOf(c.getJoinedClub())) + ", \"" + c.getLastExtension() + "\", " +
                        (1+dim_date.indexOf(c.getContractExpiration())) + ", " + (1+dim_player_sponsor.indexOf(c.getPlayerSponsor())) + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_youthClub(MarketValues marketValues, List<dimYouthClub> youthClubs, List<String> dim_clubyouth){

        int count;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarYouthClub.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimYouthClub youthClub = new dimYouthClub(count, 1+dim_clubyouth.indexOf(c.getYouthClub1()), 1+dim_clubyouth.indexOf(c.getYouthClub2()),
                        1+dim_clubyouth.indexOf(c.getYouthClub3()), 1+dim_clubyouth.indexOf(c.getYouthClub4()), 1+dim_clubyouth.indexOf(c.getYouthClub5()),
                        1+dim_clubyouth.indexOf(c.getYouthClub6()), 1+dim_clubyouth.indexOf(c.getYouthClub7()));

                youthClubs.add(youthClub.clone());

                String query = "insert into dim_youthClub values (" + count + ", " + (1+dim_clubyouth.indexOf(c.getYouthClub1())) + ", " +
                        (1+dim_clubyouth.indexOf(c.getYouthClub2())) + ", " + (1+dim_clubyouth.indexOf(c.getYouthClub3())) + ", " +
                        (1+dim_clubyouth.indexOf(c.getYouthClub4())) + ", " + (1+dim_clubyouth.indexOf(c.getYouthClub5())) + ", " +
                        (1+dim_clubyouth.indexOf(c.getYouthClub6())) + ", " + (1+dim_clubyouth.indexOf(c.getYouthClub7())) + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void dim_international_info(MarketValues marketValues, List<dimInternationalInfo> infos,
                                              List<String> dim_citizenship, List<String> dim_nationality){

        int count;
        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarInternationalInfo.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                count = i++;

                dimInternationalInfo info = new dimInternationalInfo(count, 1+dim_citizenship.indexOf(c.getCitizenship1()),
                        1+dim_citizenship.indexOf(c.getCitizenship2()), 1+dim_nationality.indexOf(c.getNationality()),
                        c.getGamesPlayed(), c.getNationalTeamCaps(), c.getMostRecentInjury());

                infos.add(info.clone());

                String query = "insert into dim_international_info values (" + count + ", " + (1+dim_citizenship.indexOf(c.getCitizenship1())) + ", " +
                        (1+dim_citizenship.indexOf(c.getCitizenship2())) + ", " + (1+dim_nationality.indexOf(c.getNationality())) + ", " +
                        c.getGamesPlayed() + ", " + c.getNationalTeamCaps() + ", \"" +
                        c.getMostRecentInjury() + "\");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void fact_table(MarketValues marketValues, List<dimValues> values ,List<dimContract> contract,
                                  List<dimPersonalInfo> personalInfo, List<dimClub> club,
                                  List<dimYouthClub> youthClub, List<dimInternationalInfo> internationalInfo,
                                  List<String> dim_place, List<String> dim_age, List<String> dim_foot,
                                  List<String> dim_affiliation, List<String> dim_league, List<String> dim_jersey,
                                  List<String> dim_position, List<String> dim_playerSponsor, List<String> dim_agent,
                                  List<String> dim_citizenship, List<String> dim_clubyouth, List<String> dim_nationality,
                                  List<String> dim_date){

        try {
            FileOutputStream fos = new FileOutputStream(new File("povoarFactTable.sql"));

            int i = 1;
            for (Conteudo c : marketValues.getMarketValues()) {

                int id_personal_info = -1;
                int id_club = -1;
                int id_contract = -1;
                int id_values = -1;
                int id_youthclub = -1;
                int id_internationalinfo = -1;

                for (dimPersonalInfo id : personalInfo)
                    if((id_personal_info = id.getId(c.getFullname(), c.getPalyername(),
                            1+dim_date.indexOf(c.getBirthDay()),1+dim_place.indexOf(c.getBithPlace()),
                            1+dim_age.indexOf(c.getAge()), c.getHeight(), 1+dim_foot.indexOf(c.getFoot())))!=-1)
                        break;

                for (dimClub id : club)
                    if((id_club = id.getId(1+dim_affiliation.indexOf(c.getAffiliation()), 1+dim_league.indexOf(c.getLeague()),
                            1+dim_jersey.indexOf(c.getJersey()),1+dim_position.indexOf(c.getPosition()),
                            1+dim_position.indexOf(c.getPosition2())))!=-1)
                        break;

                for (dimContract id : contract)
                    if((id_contract = id.getId(1+dim_agent.indexOf(c.getAgent()), 1+dim_date.indexOf(c.getJoinedClub()),
                            c.getLastExtension(),1+dim_date.indexOf(c.getContractExpiration()),
                            1+dim_playerSponsor.indexOf(c.getPlayerSponsor())))!=-1)
                        break;

                for (dimValues id : values)
                    if((id_values = id.getId(c.getMarketValues(), 1+dim_date.indexOf(c.getLastUpdateDate()),
                            c.getAccumulatedTransferSums(),c.getHighestMarketValue(),
                            1+dim_date.indexOf(c.getHighestMarketValueDate())))!=-1)
                        break;

                for (dimYouthClub id : youthClub)
                    if((id_youthclub = id.getId(1+dim_clubyouth.indexOf(c.getYouthClub1()), 1+dim_clubyouth.indexOf(c.getYouthClub2()),
                            1+dim_clubyouth.indexOf(c.getYouthClub3()), 1+dim_clubyouth.indexOf(c.getYouthClub4()),
                            1+dim_clubyouth.indexOf(c.getYouthClub5()), 1+dim_clubyouth.indexOf(c.getYouthClub6()),
                            1+dim_clubyouth.indexOf(c.getYouthClub7())))!=-1)
                        break;

                for (dimInternationalInfo id : internationalInfo)
                    if((id_internationalinfo = id.getId(1+dim_citizenship.indexOf(c.getCitizenship1()),
                            1+dim_citizenship.indexOf(c.getCitizenship2()), 1+dim_nationality.indexOf(c.getNationality()),
                            c.getGamesPlayed(), c.getNationalTeamCaps(), c.getMostRecentInjury()))!=-1)
                        break;

                String query = "insert into fact_table values (" + i++ + ", " + id_personal_info + ", " +
                        id_club + ", " + id_contract + ", " + id_values + ", " + id_youthclub + ", " +
                        id_internationalinfo + ");\n";
                fos.write(query.getBytes());
                fos.flush();
            }

            fos.flush();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
