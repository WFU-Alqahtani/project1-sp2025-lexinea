import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String[] games = {"Mario Kart 8", "Donkey Kong", "Pac-Man", "Splatoon 2", "Kirby's Dreamland"};
       // String[] items = setupStore(store); //method call for setupStore
       //creating Item array for the setupStore method
       Item[] store = new Item[5];

        ArrayList<String> gameList = new ArrayList<String>();

        //adding the games into the gameList
        //gameList.add(games[0]); //Mario Kart
        //gameList.add(games[1]); //Donkey Kong
        //gameList.add(games[2]); //Pac-Man
        // gameList.add(games[3]); //Splatoon 2
        //gameList.add(games[4]); //Kirby's Dreamland

        System.out.println();

    }

    //Creating the setupStore method to return the array of games
    public static Item[] setupStore () {
        //creating the Item array for the setupStore method
        Item[] store = new Item[5];
        store[0] = new Item ("Mario Kart 8", 60.0); //name of video game, price of video game
        store[1] = new Item ("Donkey Kong", 35.0);
        store[2] = new Item ("Pac-Man", 40.0);
        store[3] = new Item ("Splatoon 2", 55.0);
        store[4] = new Item ("Kirby's Dreamland", 30.0);
        return store;
    }

    //Creating the createCart method
    public static void createCart ( ) {

    }

    //Creating the printReceiptInOrder method
    public static void printReceiptInOrder () {
        System.out.println("            Receipt");
        System.out.println("===============================");
        System.out.println(" Item                    Price");


    }
}