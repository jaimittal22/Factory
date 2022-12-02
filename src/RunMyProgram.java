public class RunMyProgram {
    public static void main(String[] args) {
        Avatar joker = new Avatar();
        joker.print();

        Avatar batman = new Avatar();
        batman.power = "money";
        batman.role = "hero";
        batman.weakness = "nelson";
        batman.print();

        Avatar captainamerica = new Avatar(300,300,15,20,170,300,"america","hero","also america");
        captainamerica.print();

//        System.out.println("hello world");
//        City beijing = new City();
//        beijing.name = "Beijing";
//        beijing.pop = 21500000;
//        beijing.aveTemp = 65;
//        beijing.continent = "Asia";
//        beijing.print();
//
//        City chicago = new City();
//        chicago.print();
//        chicago.name = "Chicago";
//        chicago.pop = 10;
//        chicago.aveTemp = 4;
//        chicago.continent = "Europe";
//        chicago.print();
//
//        Sport Squash = new Sport(2, 20000,"Squash", "winter" );
//        Squash.name = "Squash";
//        Squash.players = 2;
//       Squash.season = "winter";
//      Squash.popularity = 200000;
//        Squash.print();
//
//
////        Student francisco = new Student();
////        francisco.age=12;
////        francisco.name="Francisco";
////        francisco.grade=3;
////        francisco.isBoarder=true;
////        francisco.print();
////
////        Student ralph = new Student();
////        ralph.age=17;
////        ralph.name="Ralph";
////        ralph.grade=1;
////        ralph.isBoarder=false;
////        ralph.print();
////
////        Student nelson = new Student();
////        nelson.age=16;
////        nelson.name="Nelson";
////        nelson.grade=2;
////        nelson.isBoarder=true;
////        nelson.print();
////
////        Student francisca = new Student();
////        nelson.age=46;
////        nelson.name="Francisca";
////        nelson.grade=1;
////        nelson.isBoarder=true;
////        nelson.print();
//
//
//
//
//
////        System.out.println(francisco.age);
////        System.out.println(francisco.name);
////        System.out.println(francisco.grade);
////        System.out.println(francisco.isBoarder);
    }
}
