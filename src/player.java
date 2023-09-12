import java.util.Scanner;

 public class player {

  protected int number = 9;

   public void guess() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your guess");
       number = sc.nextInt();
   }//THis collects data of the user



}

