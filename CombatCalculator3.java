import java.util.Scanner;

public class CombatCalculator3
{
    public static void main(String[] args)
    { 
        
        //Declare variable for user input and initialize with a new Scanner object
        Scanner input = new Scanner(System.in);
        /*Monster data variables*/
        //Declare variable for monster's name and initialize it to “goblin”
        String MonsterName = "goblin";
        //Declare variable for monster's health and initialize it 100
        int MonsterHealth = 100;
        //Declare variable for monster's attack power and initialize it to 15
        int MonsterAttackPower = 15;
        
        /*Hero data variables*/
        //Declare variable for Hero's health and initialize it to 100
        int HeroHealth = 100;
        //Declare variable for Hero's attack power and initialize it to 12
        int HeroAttackPower = 12;
        //Declare variable for Hero's magic power and initialize it to 0
        int HeroMagicPower = 0;
        
        /*ReportCombatStats*/
        //Print the Monster’s name
        System.out.println("You are fighting a " + MonsterName);
        //Print the Monster’s health
        System.out.println("Monster HP: " + MonsterHealth);
        //Print the Player’s health
        System.out.println("Your HP: " + HeroHealth);
        //Print the Player’s magic points
        System.out.println("Your MP: " + HeroMagicPower);
        
        /*Combat menu prompt*/
        //Print option 1: Sword Attack
        System.out.println("1) Sword Attack");
        //Print option 2: Cast Spell
        System.out.println("2) Cast Spell");
        //Print option 3: Charge Mana
        System.out.println("3) Charge Mana");
        //Print option 4: Run Away
        System.out.println("4) Run Away");
        //Prompt player for action
        System.out.println("Action?");
        //Declare variable for user input (as number) and acquire value from Scanner object
        int Action = input.nextInt();
    }
}