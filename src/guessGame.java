public class guessGame
{

    player p1;
    player p2;
    player p3;
    public void startgame() {
        p1 = new player();
        p2 = new player();
        p3 = new player();

        int guessp1 = 0;     //This is where the users data is stored
        int guessp2 = 0;
        int guessp3 = 0;

        boolean player1isright = false;        //This is where the number is validated rt ot not
        boolean player2isright = false;
        boolean player3isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Im thinking of a number between 0 to 9...");
        while (true) {
            System.out.println("The number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 has guessed"+guessp1);
            guessp2 = p2.number;
            System.out.println("Player 2 has guessed"+guessp2);
            guessp3 = p3.number;
            System.out.println("Player 3 has guessed"+guessp3);

            if(guessp1 == targetNumber){                        //This will change the boolean as true if the value matches
                player1isright = true;
            } else if (guessp2 == targetNumber) {               //This will change the boolean as true if the value matches
                player2isright =true;
            } else if (guessp3 == targetNumber) {               //This will change the boolean as true if the value matches
                player3isright = true;
            }

            if (player1isright || player2isright || player3isright){        //This will display the output
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?"+player1isright);
                System.out.println("Player two got it right?"+player2isright);
                System.out.println("Player three got it right?"+player3isright);
                break;
            }
            else{
                System.out.println("Players will have to try again");
            }
        }
    }
}
