
import java.util.ArrayList;
import java.util.Scanner;

public class Application {


    private ArrayList<Enemy> enemies;
    private ArrayList<Room> rooms;




    public static void main(String[] args) {
        System.out.println("Welcome to Fantasy Adventure");
        System.out.println("Please enter your name...");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Please Select from the number of your preferred character");
        System.out.println("1. Knight");
        System.out.println("2. Wizard");
        System.out.println("3. Cleric");
        System.out.println("4. Witch");
        int choice = sc.nextInt();
        Player player = pickCharacter(choice, name);
        System.out.println("You have chosen the " + player.getClass() + " - " + player.getStory());

    }

    private static Player pickCharacter(int i, String name){
        ArrayList<Player> characterList;
        Knight knight = new Knight(name);
        Wizard wizard = new Wizard(name);
        Cleric cleric = new Cleric(name);
        Witch witch = new Witch(name);
        characterList = new ArrayList<Player>();
        characterList.add(knight);
        characterList.add(wizard);
        characterList.add(cleric);
        characterList.add(witch);
        return characterList.get(i -1);
    }
    
}
