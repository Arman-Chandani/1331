public class Collatz {
  public static void main (String[] args) {
    int collatzNum = 2;
    int numSteps = 0;
    int highestNumReached = collatzNum;
    int initValue = collatzNum;
    System.out.println(collatzNum);

    while(collatzNum > 1) {
      if((collatzNum % 2) == 0) {
        collatzNum = (collatzNum / 2);
      } else
          collatzNum = ((collatzNum * 3) + 1);

    if(collatzNum > highestNumReached) {
      highestNumReached = collatzNum;
    }
    System.out.println(collatzNum);
    numSteps = (numSteps + 1);

    }
    System.out.println("Initial value:" + initValue);
    System.out.println("Number of steps:" + numSteps);
    System.out.println("Highest number reached:" + highestNumReached);
    String numStepsString = null;

    switch (numSteps) {
      case 0: numStepsString = "No steps required";
              break;
      case 1: numStepsString = "Only took one step!";
              break;
      case 2: numStepsString = "Two steps";
              break;
      case 3: numStepsString = "Three steps";
              break;
      case 4: numStepsString = "Four steps";
              break;
      default: numStepsString = "Wow, " + numSteps + " steps was a lot of steps!";
              break;
    }
    System.out.println(numStepsString);
  }
}
