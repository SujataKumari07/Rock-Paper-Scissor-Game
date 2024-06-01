import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame {
public static void main(String[] args) {
    int yourChoice, computerChoice, rock, paper, scissor;
    Scanner input = new Scanner (System.in);
    Random rnd = new Random();  
    rock = 0; 
    paper = 1;
    scissor = 2;
    System.out.println("ROCK - PAPER - SCISSOR GAME");
    System.out.println("Enter your choice (0=rock, 1=paper, 2=scissor)");
    yourChoice = input.nextInt();
        while (yourChoice > 2) {
        System.out.println("give number between 0 and 2");
        yourChoice = input.nextInt();
    }
       
    if (yourChoice == rock)
       {
         System.out.println("You chose ROCK");
       }
    else
    {
        if(yourChoice== paper)
        {
          System.out.println("You chose PAPER");
        }
        else
        {
          System.out.println("You chose SCISSOR");
        }
	}
    computerChoice = rnd.nextInt(3);
    if(computerChoice == rock)
    {
    System.out.println("Computer chose ROCK");
    }
    else
    {
       if(computerChoice == paper)
       {
          System.out.println("Computer chose PAPER");
       }
       else
       {
          System.out.println("Computer chose SCISSOR");
       }
    }
    while (yourChoice == computerChoice) {
     System.out.println("draw try again");
        yourChoice = input.nextInt();
        while (yourChoice > 2) {
            System.out.println("give number between 0 and 2");
            yourChoice = input.nextInt();
        }
        computerChoice = rnd.nextInt(3);
        if (yourChoice == rock)
        {
        System.out.println("You chose ROCK");
        }
        else
        {
        if(yourChoice== paper)
        {
        System.out.println("You chose PAPER");
        }
        else
         {
            System.out.println("You chose SCISSOR");
        }
		}      
                       
        if(computerChoice == rock)
        {
            System.out.println("Computer chose ROCK");
        }
        else
         {
            if(computerChoice == paper)
        {
         System.out.println("Computer chose PAPER");
        }
        else
            {
                System.out.println("Computer chose SCISSOR");
            }
         }
     } 
    if (computerChoice==rock)
    {
        if (yourChoice==paper)
        {  
            System.out.println("You Won!");
         }
        else 
         {
             System.out.println("Computer Won!");
        }
        }
    else if (computerChoice==paper)
    {
    if (yourChoice==rock)
        {
            System.out.println("Computer Won!");
         }
    else
        {
            System.out.println("You Won!");
        }
    }
    else if (yourChoice==rock)
    {
    System.out.println("You Won!");
    }
    else
    {
    System.out.println("Computer Won!");
    } 
    }
}
