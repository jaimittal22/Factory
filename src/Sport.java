public class Sport {
    int players;
    String season;
    String name;
    int popularity;

    public Sport(int pplayers, int ppopularity, String pname, String pseason) {
        name = pname;
        players = pplayers;
        season = pseason;
        popularity = ppopularity;
    }
    public void popularity(){
        if(popularity > 1000000){
            System.out.println("this is a famous sport");
        }
        else {
            System.out.println("this is not a famous sport");
        }

    }

    public void print(){
        System.out.println("this is the sport of " + name+" in the " + season+ " season");
        System.out.println("with an average viewership of " + popularity +" and " + players +" people on the court at once");

    }
}

