package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	      int operator, n1, n2;
	      System.out.println("1-ADD \n2-SUB \n3-MULTIPLY \n4-DIVIDE");
	      System.out.println("Choose Your Operation");
	      Scanner sc = new Scanner(System.in);
	      operator = sc.nextInt();
	      System.out.println("Enter First Number");
	      n1 = sc.nextInt();
	      System.out.println("Enter Second Number");
	      n2 = sc.nextInt();
	      
	      int result = 0;
	      switch(operator)
	      {
	      case 1:
	    	  result = n1 + n2;
	    	  System.out.println("Addition: "+result);
	    	  break;
	      case 2:
	    	  result = n1 - n2;
	    	  System.out.println("Substraction: "+result);
	    	  break;
	      case 3:
	    	  result = n1 * n2;
	    	  System.out.println("Multiplication: "+result);
	    	  break;
	      case 4:
	    	  result = n1 / n2;
	    	  System.out.println("Division: "+result);
	    	  break;	
	      default:
	    	  System.out.println("Invalid Operation");
	      }
	}

}
