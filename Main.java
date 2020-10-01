import java.util.Scanner;
/**
 * Determines the animal
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String feathers = input.nextLine();
    
    //ask user if animal swims
    if (feathers.equals("yes")){
      System.out.println("Does the animal swim? (yes/no)");
      String swim = input.nextLine();
      if (swim.equals("yes")){
        System.out.println("This is a duck");
      }else {
        System.out.println("This is a hen");
      }
    }else {
      //ask user if animal has legs
      System.out.println("Does the animal have legs? (yes/no)");
      String legs = input.nextLine();
      if (legs.equals("yes")){
        System.out.println("This is a lizard");
      }else {
        System.out.println("This is a snake");
      }
    }
    
  }
}
