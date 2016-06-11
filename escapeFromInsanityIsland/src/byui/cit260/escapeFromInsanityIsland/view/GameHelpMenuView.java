/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class GameHelpMenuView {
    
    private String helpMenu;
    private String promptMessage = "Enter your selection below";
    
    public GameHelpMenuView() {
        this.helpMenu = "\n"
                  + "\n------------------------------------------------"
                  + "\n| Help Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nG - What Is The Goal of The Game?"    
                  + "\nM - How to Move?" 
                  + "\nT - Tools Available to Construct"
                  + "\nC - Constructing Tools"
                  + "\nV - View Map"
                  + "\nA - Avoiding Traps/Beasts"
                  + "\nQ - Quit the game"
                  + "\n------------------------------------------------";
    }

    public void displayHelpMenu() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(helpMenu);
            //prompt for and get the players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // Take them back a screen
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
            
        } while (!done);
    }



    private String getHelpMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop whilean invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
               
        }
        return value; // return the value entered
                        
    }

    private boolean doAction(String choice) {
        choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": // See goal of game
                this.seeGoal();
                break;   
            case "M": // Get help on how to move
                this.howToMove();
                break;
            case "T": // See what tools are available
                this.toolsAvailable();
                break;
            case "C": // Get help on how to construct tools
                this.constructingTools();
                break;
            case "V": // See how to use map
                this.viewMap();
                break;
            case "A": // Learn about traps and beasts
                this.avoidingTrapsBeasts();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
    
    private void seeGoal() {
           HelpMenuItems seeGoal = new HelpMenuItems();
        seeGoal.displaySeeGoal();     
    }
        
    private void howToMove(){
           HelpMenuItems howToMove = new HelpMenuItems();
        howToMove.displayHowToMove();  
    }

    private void toolsAvailable() {
           HelpMenuItems toolsAvailable = new HelpMenuItems();
        toolsAvailable.displayToolsAvailable();
    }

    private void constructingTools() {
           HelpMenuItems constructingTools = new HelpMenuItems();
        constructingTools.displayConstructingTools();
    }
    
    private void viewMap() {
            HelpMenuItems viewMap = new HelpMenuItems();
        viewMap.displayViewMap();
    }

    private void avoidingTrapsBeasts() {
            HelpMenuItems avoidingTrapsBeasts = new HelpMenuItems();
        avoidingTrapsBeasts.displayAvoidingTrapsBeasts();
    }
}