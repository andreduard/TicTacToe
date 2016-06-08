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
 char array2[]={'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
 int numberOfClicks=0;
 
 public void setClick(int position, char XorO)
 {
  System.out.println(position);
  array2[position]=XorO; // ADD 1 OR 2 TO ARRAY POSITION
  System.out.println(array2[position]);
  numberOfClicks++; // INCREMENT GAME TURNS

 }
 
 
 //RESET ARRAY AND THE NUMBER OF TURNS COUNT
 public void resetGame()
 {
    numberOfClicks=0;
    char array[] ={'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
    System.arraycopy(array, 1, array2, 1, 9);
    currentBoard();

 }
 
public  String currentBoard()
{
   //System.out.println( "\n\n" );
   //System.out.println(  "\n\n" );
   System.out.println(  "\n\n\t\t" + array2 [1] + "   | " +array2 [2]+ "  | " + array2 [3]);
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  " \t\t ___|____|___ " );
   System.out.println(  "\n\n\t\t" + array2 [4] + "   | " + array2 [5] + "  | " + array2 [6]);
   System.out.println(  " \t\t    |    |   " );
   System.out.println(  " \t\t ___|____|___ " );
   System.out.println(  "\n\n\t\t" + array2 [7] + "   | " +  array2 [8] + "  | " + array2 [9]);
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
    if (array2[1]=='X' && array2[2]=='X' && array2[3]=='X')
        return 1;
    if (array2[1]=='O' && array2[2]=='O' && array2[3]=='O')
        return 2;
    if (array2[4]=='X' && array2[5]=='X' && array2[6]=='X')
        return 1;
    if (array2[4]=='O' && array2[5]=='O' && array2[6]=='O')
        return 2;
    if (array2[7]=='X' && array2[8]=='X' && array2[9]=='X')
        return 1;
    if (array2[7]=='O' && array2[8]=='O' && array2[9]=='O')
        return 2;
  
   
  // VERT TEST

    if (array2[1]=='X' && array2[4]=='X' && array2[7]=='X')
        return 1; 
    if (array2[1]=='O' && array2[4]=='O' && array2[7]=='O')
     return 2; 
    if (array2[2]=='X' && array2[5]=='X' && array2[8]=='X')
        return 1;
    if (array2[2]=='O' && array2[5]=='O' && array2[8]=='O')
        return 2;
    if (array2[3]=='X' && array2[6]=='X' && array2[9]=='X')
        return 1;
    if (array2[3]=='O' && array2[6]=='O' && array2[9]=='O')
        return 2;
   
  //DIAGONAL TEST
  
    if (array2[1]=='X' && array2[5]=='X' && array2[9]=='X')
        return 1;
    if (array2[1]=='O' && array2[5]=='O' && array2[9]=='O')
        return 2;
    if (array2[3]=='X' && array2[5]=='X' && array2[7]=='X')
        return 1;
    if (array2[3]=='O' && array2[5]=='O' && array2[7]=='O')
        return 2;
  
  if (numberOfClicks==9)
   return 3; 

  return 0; 
 }
  
}