import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
  
  // declare random number and variable

    Random secretnumber = new Random();
    
    int intRandomNumber;
    int intGuess;

  // generate random number from 1 to 100

    intRandomNumber = secretnumber.nextInt(100,1);

  // guess random number
    intGuess = readInt("What is the random number? ");

    if(intGuess > intRandomNumber){
      System.out.println("too high");

    }

    if(intGuess < intRandomNumber){
      System.out.println("too low");

    }
    
    if(intGuess == intRandomNumber){
      System.out.println("congratulations ");
    }

    
  
    
  }
}
