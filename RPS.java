package RockPaperScissors;
import java.util.Scanner;
import java.util.Random;
public class RPS {
     public static void main(String[] args)
     {
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("0 is for Rock");
    	 System.out.println("1 is for Paper");
    	 System.out.println("2 is for Scissor");
    	 int computer_choice;
    	 int computerwon=0;
    	 int my_choice;
    	 int me=0;
    	 int game=0;
    	 
    	 while (game<=5)
    	 {
    		 Random rand = new Random();
			computer_choice=rand.nextInt(2);
			my_choice=sc.nextInt();
			switch(my_choice)
			{
			case 0:
				System.out.println("You choose rock");
				break;
			case 1:
				System.out.println("You choose paper");
				break;
			case 2:
				System.out.println("You choose scissor");
				break;
			}
			switch (computer_choice) 
			{
			case 0:
				System.out.println("Computer choose rock");
				break;
			case 1:
				System.out.println("Computer choose paper");
				break;
			case 2:
				System.out.println("Computer choose scissor");
				break;
			}
    		if(computer_choice==my_choice)
    		{
    			System.out.println("Match tie");
    		}
    		else if (computer_choice==0 && my_choice==1) 
    		{
				System.out.println("I won!!! ");
				me++;
			}
    		else if (computer_choice==0 && my_choice==2) 
    		{
				System.out.println("Computer Won");
				computerwon++;
			}
    		else if (computer_choice==1 && my_choice==0) 
    		{
				System.out.println("Computer Won");
				computerwon++;
			}
    		else if (computer_choice==1 && my_choice==2) 
    		{
				System.out.println("I won!!!");
				me++;
			}
    		else if (computer_choice==2 && my_choice==0) 
    		{
				System.out.println("I won!!!");
				me++;
			}
    		else if (computer_choice==2 && my_choice==1) 
    		{
				System.out.println("Computer Won");
				computerwon++;
			}
    		if(game==5)
    		{
    			break;
    		}
    		game++;
    	 }
    	 System.out.println("--------------------------------");
    	 System.out.println("Computer"+":"+ computerwon);
    	 System.out.println("Me"+":"+ me);
    	 System.out.println("--------------------------------");
    	 if(computerwon>me)
    	 {
    		 System.out.println("Computer Won the Game");
    	 }
    	 else if(computerwon==me)
    	 {
		     System.out.println("Match tie");	
		 }
    	 else
    	 {
    		 System.out.println("I won the Game and computer need more practice");
    	 }
     }
}
