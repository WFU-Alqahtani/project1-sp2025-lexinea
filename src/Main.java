import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String[] games = {"Mario Kart 8", "Donkey Kong", "Pac-Man", "Splatoon 2", "Kirby's Dreamland"};
       // String[] items = setupStore(store); //method call for setupStore
        ArrayList<String> gameList = new ArrayList<String>();

        //adding the games into the gameList
        //gameList.add(games[0]); //Mario Kart
        //gameList.add(games[1]); //Donkey Kong
        //gameList.add(games[2]); //Pac-Man
        // gameList.add(games[3]); //Splatoon 2
        //gameList.add(games[4]); //Kirby's Dreamland

        System.out.println();

    }

    //Creating the setupStore method to return the array of list of games
    public static String[] setupStore () {
        String[] store = new String [5];
        store[0] = new String ("Mario Kart 8", 60); //name of video game, price of video game
        store[1] = new String ("Donkey Kong", 35);
        store[2] = new String ("Pac-Man", 40);
        store[3] = new String ("Splatoon 2", 55);
        store[4] = new String ("Kirby's Dreamland", 30);
        return store;
    }

    //Creating the createCart method
    public static void createCart ( ) {

    }

    //Creating the

}