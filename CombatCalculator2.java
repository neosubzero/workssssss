public class CombatCalculator2
{
    public static void main(String[] args)
    { 
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
    }
}