/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Andres
 */
/**
 *
 * @author Andres
 */
import java.util.Scanner;

public class Controller {
    
 private Model newModel = new Model();
 private int result=0;
 private boolean whosGo=false; // SET PLAYER O TO GO FIRST
 private int spot;
  
  public void goAgain()
 {
    String ch; 
    System.out.println ("Would you like to play again (Enter 'yes')? ");
    Scanner in =new Scanner(System.in);
    ch=in.nextLine();
    
    if("yes".equals(ch)){
        newModel.resetGame();
        play();
    }
    else{ 
        System.exit(0);}
    
}
  
public void play()
{
    System.out.println(  "Player X will go first" );
    
    newModel.currentBoard();              // display current board

    for(int x=0; x<10; x++){
               
        if (whosGo==false){
                        
            System.out.println(  "\n\n Player X choose a position.");
                        
            Scanner in =new Scanner (System.in);
            spot=in.nextInt();

            newModel.setClick(spot,'X');       //set the X in the position of the array

            result=newModel.getResult();
            newModel.currentBoard();

            whosGo=true;  // CHANGE TO NEXT PLAYER
                     
            }
                    
        else{         
            System.out.println(  "\n\n Player O choose a position.");

            Scanner in =new Scanner (System.in);
            spot=in.nextInt();
            
            newModel.setClick(spot,'O');       

            result=newModel.getResult();
            newModel.currentBoard();

            whosGo=false; // CHANGE TO NEXT PL|AYER 
         
        }
             
        if(result == 1){
            System.out.println("X Win ");   //SAY HOW WIN
            goAgain();}     //STAR AGAIN
        else if(result == 2){
            System.out.println("O Win ");
            goAgain();}
        else if (result!=0){
            System.out.println(" Draw ");
            goAgain();}
         
    } 
}

}