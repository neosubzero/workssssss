import java.util.Scanner;

public class CombatCalculatorBonus
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
        
        /*LoopControl*/
        //Declare loop control variable and initialize it to true
        boolean LoopLoop = true;
        //While the loop control variable is true
        while (LoopLoop == true) {
        
        /*ReportCombatStats*/
        //Print the Monster’s name
        System.out.println("You are fighting a " + MonsterName);
        //Print the Monster’s health
        System.out.println("Monster HP: " + MonsterHealth);
        //Print the Player’s health
        System.out.println("Your HP: " + HeroHealth);
        //Print the Player’s magic points
        System.out.println("Your MP: " + HeroMagicPower);
        System.out.println();
        
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
        
        //Declare variable that will be used for retry answer
        int Answer;
        //Declare variable for action choices
        int Action = 0;
        //While Action is neither 1, 2, 3, and 4 OR while Action is 2 without having 3 or more mana
        while ((Action != 1 && Action != 2 && Action != 3 && Action != 4) || (Action == 2 && HeroMagicPower < 3)) {
        //Variable for user input (as number) and acquire value from Scanner object
        Action = input.nextInt();
        System.out.println();
       
        
            //If player chose option 1, (check with equality operator)
            if (Action == 1) {
                //Calculate damage & update monster health using subtraction
                //Calculation: new monster health is old monster health minus hero attack power
                 MonsterHealth = MonsterHealth - HeroAttackPower;
                //print attack text:
            System.out.println("You strike the " + MonsterName + " with your sword for " + HeroAttackPower + " damage");
            System.out.println();
            }
            
                //Else if player chose option 2, (check with equalit yoperator)
                else if (Action == 2) {
                    //If player has 3 or more magic points
                    if (HeroMagicPower >= 3) {
                    //Calculate damage & update monster health using division
                    //Calculation: new monster health is old monster health divided by two
                    MonsterHealth = MonsterHealth / 2;
                    //Reduce player's mana points by the spell cost using subtraction
                    //Calculation: new magic power is old magic power minus 3
                    HeroMagicPower = HeroMagicPower - 3;
                    //print spell message:
                    System.out.println("You cast the weaken spell on the monster.");
                    System.out.println();
                    }
                    else {
                    System.out.println("You don't have enough mana");
                    System.out.println();
                    }
                
                }
            
                    //Else if the player chose option 3, (check with equality operator)
                    else if (Action == 3) {
                        //Increment magic points and update players magic using addition
                        //Calculation: new hero magic is old hero magic plus one
                        HeroMagicPower = HeroMagicPower + 1;
                    //print charging message:
                    System.out.println("You focus and charge your magic power.");
                    System.out.println();
                    }
            
                        //Else if the player chose option 4, (check with equality operator)
                        else if (Action == 4) {
                            //Stop combat loop by setting control variable to false
                            LoopLoop = false;
                        //print retreat message:
                        System.out.println("You run away!");
                        System.out.println();
                        }
            
                            //Else the player chose incorrectly
                            else {
                            //print an error message:
                            System.out.println("I don't understand that command.");
                            System.out.println();
                            }
        }
        
        //If monsters health is above 0 and user did not choose action 4 
        if (MonsterHealth > 0 && Action != 4) {   
        //Have monster attack player and print message    
        HeroHealth = HeroHealth - MonsterAttackPower;
        System.out.println(MonsterName + " hits you for 15 damage");
        System.out.println();
        }
        
            //If monster's health is 0 or below
            if (MonsterHealth <= 0) {
            //Stop combat loop by setting control variable to false
            LoopLoop = false;
            //Print victory message: “You defeated the <monstername>!”
            System.out.println("You defeated the " + MonsterName);
            }
            
            //Player health is 0 or below
            if (HeroHealth <= 0) {
                System.out.println("You died");
                System.out.println("Try Again? 1) Yes or 2) No");
                //Stop combat loop
                LoopLoop = false;
                //Have user input assign to retry variable
                Answer = input.nextInt();
                
                //If user decides to retry
                if (Answer == 1) {
                    //Continue combat loop
                    LoopLoop = true;
                    //Reset data variables to initial
                    MonsterHealth = 100;
                    MonsterAttackPower = 15;
                    HeroHealth = 100;
                    HeroAttackPower = 12;
                    HeroMagicPower = 0;
                }
            }    
                
                
            
        
            
        }
    }
}