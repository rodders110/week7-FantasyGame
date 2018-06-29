
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {



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
        Player player = Application.pickCharacter(choice, name);
        System.out.println("You have chosen the " + player.getClass() + " - " + player.getStory());
        boolean gameEnd = false;
        ArrayList<Room> activeRooms = new ArrayList<Room>(selectRooms());

        while(!gameEnd){
            if(activeRooms.size() != 0){
                System.out.println(player.getName() + " walks into a dark room where from out the dark comes a/an "
                        + activeRooms.get(1).getEnemy().getName() + "...");

                while(activeRooms.get(1).getEnemy().getHP() > 0 && player.getHp() > 0 ) {
                    System.out.println("What attack will you use?");
                    for(int j = 1; j < player.getAttacks().size(); ++j ){
                        System.out.println((j + " " + player.getAttacks().get(j).getName()));
                    }
                    int attackChoice = sc.nextInt() - 1;
                    IAttack attacker = (IAttack) player;
                    IDamageable victim = (IDamageable) activeRooms.get(1).getEnemy();
                    attacker.attack(victim, player.getAttacks().get(attackChoice));
                    System.out.println("Enemy HP is " + activeRooms.get(1).getEnemy().getHP());

                    IAttack enemy = (IAttack) activeRooms.get(1).getEnemy();
                    IDamageable hero = (IDamageable) player;

                    System.out.println("The " + activeRooms.get(1).getEnemy().getName() + " attacks using " + activeRooms.get(1).getEnemy().getAttacks().get(1).getName() );

                    enemy.attack(hero, activeRooms.get(1).getEnemy().getAttacks().get(1));
                    System.out.println("Your HP is now: "+ player.getHp());

                }
                if (activeRooms.get(1).getEnemy().getHP() < 0) {
                    System.out.println("The Enemy has been vanquished!!!!");
                } else{
                    System.out.println("You lost");
                }
            }


                gameEnd = true;

        }


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

    private static ArrayList<Room> selectRooms(){
        ArrayList<Room> rooms;

        ArrayList<Treasure> treasures;
        treasures = new ArrayList<Treasure>();
        treasures.add(Treasure.DIAMONDS);
        treasures.add(Treasure.GOLD);
        treasures.add(Treasure.RUBIES);

        ArrayList<Enemy> enemies;
        enemies = new ArrayList<Enemy>();
        Orc orc = new Orc();
        Dragon dragon = new Dragon();
        enemies.add(orc);
        enemies.add(dragon);

        rooms = new ArrayList<Room>();
        for(int i = 0; i < 4; i++){
            int pick1 = new Random().nextInt(enemies.size());
            int pick2 = new Random().nextInt(treasures.size());
            Room room = new Room(enemies.get(pick1), treasures.get(pick2));
            rooms.add(room);
        }

        return rooms;
    }

}
