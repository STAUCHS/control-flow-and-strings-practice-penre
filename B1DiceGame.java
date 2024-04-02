import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
  
  // random object

  Random diceroll = new Random();

  // declare variables

  int intDiceOne;
  int intDiceTwo;

  // roll 100 times

  for (int dice = 0; dice > 100; dice++){
    intDiceOne = diceroll.nextInt(1,6);
    intDiceTwo = diceroll.nextInt(1,6);

  // if statements

  if(intDiceOne + intDiceTwo == 2){
    System.out.println("snake eyes ");

  }
  
  if(intDiceOne + intDiceTwo == 7){
    System.out.println("lucky seven ");



  }



    
    
  }
}
}

