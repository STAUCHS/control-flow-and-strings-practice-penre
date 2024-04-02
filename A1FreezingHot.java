class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
  
    int intTemp1;
    int intTemp2;

  // get user input
    intTemp1 = readInt("What is the first temperature? ");
    intTemp2 = readInt("What is the second temperature? ");

    System.out.println(intTemp1);
    System.out.println(intTemp2);

  // true or false 
    if(intTemp1 > 100){
      System.out.println("true ");
    }
    else{
      System.out.println("false ");
    }
    
    if(intTemp2 < 0){
      System.out.println("True ");
    }
    else{
      System.out.println("False ");
    }

  }
}
