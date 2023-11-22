package RandomNumber;
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        
        System.out.println("Well," + name + ",I am thinking of a number between 1 to 100!!");
        int myNumber = getRandomNumber(1,101);
        
        for(int i=0;i<6;i++)
        {
        	Scanner sc2= new Scanner(System.in);
        	System.out.println("Take a guess");
        	int yourGuess = sc2.nextInt();
        	
        	if(yourGuess == myNumber)
        	{
        		System.out.println("You guessed correctly");
        		break;
        	}
        	else if(yourGuess < myNumber)
        	{
        		System.out.println("Your guess is too low!");
        	}
        	else if(yourGuess > myNumber)
        	{
        		System.out.println("You guess is to high!!");
        	}
        	if(i >= 5)
        	{
        		System.out.println();
        		System.out.println("Nope, The number I was thinking of was "+ myNumber + "!");
        	}
        }
	}

	
	public static int getRandomNumber(int min,int max)
	{
		Random random = new Random();
		return random.ints(min,max).findFirst().getAsInt();
	}
}
