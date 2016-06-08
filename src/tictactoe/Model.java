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
class Model
{
 char boardArray[]={'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};	//The array that use the program during the game
 int numberOfClicks=0;
 
 public void setClick(int position, char XorO)
 {
  System.out.println(position);
  boardArray[position]=XorO; // ADD 1 OR 2 TO ARRAY POSITION
  numberOfClicks++; // INCREMENT GAME TURNS

 }
 
 
 //RESET ARRAY AND THE NUMBER OF TURNS COUNT
 public void resetGame()
 {
    numberOfClicks=0;
    char boardOrig[] ={'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};		//The original board that is use to resert the game
    System.arraycopy(boardOrig, 1, boardArray, 1, 9);
    currentBoard();

 }
 
public  String currentBoard()
{
   //System.out.println( "\n\n" );
   //System.out.println(  "\n\n" );
   System.out.println(  "\n\n\t\t" + boardArray [1] + "   | " +boardArray [2]+ "  | " + boardArray [3]);
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  " \t\t ___|____|___ " );
   System.out.println(  "\n\n\t\t" + boardArray [4] + "   | " + boardArray [5] + "  | " + boardArray [6]);
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  " \t\t ___|____|___ " );
   System.out.println(  "\n\n\t\t" + boardArray [7] + "   | " +  boardArray [8] + "  | " + boardArray [9]);
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  "\n\n" );
   return "currentBoard";
}
 
 // THIS METHOD CHECKS TO SEE WHICH PLAYER HAS WON IF ANY AND
 // RETURN A VAULE 
 // 1(IF X WINS) - 2(IF O WINS) - 3(IF NO ONE WINS) - 0 BY DEFAULT
 public int getResult()
 { 
  //HORI TEST
    if (boardArray[1]=='X' && boardArray[2]=='X' && boardArray[3]=='X')
        return 1;
    if (boardArray[1]=='O' && boardArray[2]=='O' && boardArray[3]=='O')
        return 2;
    if (boardArray[4]=='X' && boardArray[5]=='X' && boardArray[6]=='X')
        return 1;
    if (boardArray[4]=='O' && boardArray[5]=='O' && boardArray[6]=='O')
        return 2;
    if (boardArray[7]=='X' && boardArray[8]=='X' && boardArray[9]=='X')
        return 1;
    if (boardArray[7]=='O' && boardArray[8]=='O' && boardArray[9]=='O')
        return 2;
  
   
  // VERT TEST

    if (boardArray[1]=='X' && boardArray[4]=='X' && boardArray[7]=='X')
        return 1; 
    if (boardArray[1]=='O' && boardArray[4]=='O' && boardArray[7]=='O')
     return 2; 
    if (boardArray[2]=='X' && boardArray[5]=='X' && boardArray[8]=='X')
        return 1;
    if (boardArray[2]=='O' && boardArray[5]=='O' && boardArray[8]=='O')
        return 2;
    if (boardArray[3]=='X' && boardArray[6]=='X' && boardArray[9]=='X')
        return 1;
    if (boardArray[3]=='O' && boardArray[6]=='O' && boardArray[9]=='O')
        return 2;
   
  //DIAGONAL TEST
  
    if (boardArray[1]=='X' && boardArray[5]=='X' && boardArray[9]=='X')
        return 1;
    if (boardArray[1]=='O' && boardArray[5]=='O' && boardArray[9]=='O')
        return 2;
    if (boardArray[3]=='X' && boardArray[5]=='X' && boardArray[7]=='X')
        return 1;
    if (boardArray[3]=='O' && boardArray[5]=='O' && boardArray[7]=='O')
        return 2;
  
  if (numberOfClicks==9)
   return 3; 

  return 0; 
 }
  
}