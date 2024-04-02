class A2HasTeen extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intAge1;
    int intAge2;
    int intAge3;

  // get user input
    intAge1 = readInt("What is the first age ? ");
    intAge2 = readInt("What is the second age ? ");
    intAge3 = readInt("What is the third age ? ");

    System.out.println(intAge1);
    System.out.println(intAge2);
    System.out.println(intAge3);

  // true or false age
    if((intAge1 <= 19 && intAge1 >= 13) || (intAge2 <= 19 && intAge2 >= 13) || (intAge3 <= 19 && intAge3 >= 13)){
      System.out.println("True ");
    }
    else{
      System.out.println("False ");
    }

  }
}
