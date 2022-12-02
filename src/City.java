public class City {
    int pop;
    String continent;
    String name;
    int aveTemp;
public City(){
    name = "Chicago";
    pop = 1000;
    continent = "Ohio";
    aveTemp = 20;
    pop = 1000;
    print();
}
    public void print(){
        System.out.println("the city " + name + " in " +  continent);
        System.out.println("with an average temp of " + aveTemp + " and a pop of " + pop+ " people");

    }
}
