
package montecarlo;
import java.util.Random;
import java.util.Scanner;
 
public class MonteCarlo {

    public static void main(String[] args) {
		Random dice =new Random();
		int n,number_win=0;
		Scanner input = new Scanner(System.in);
 
		System.out.println("Enter number of round:");
		n= input.nextInt();
 
		for(int i=1;i<=n;i++) {
 
			int sum=0,initial_sum=0;
 
 
			int num1= 1+dice.nextInt(6);
			int num2= 1+dice.nextInt(6);
			sum = num1+num2;
 
			if(sum==7 || sum==11) {
				System.out.println("You won");
				number_win++;
			}
			else if(sum==2 || sum==3 || sum==12) {
				System.out.println("You Lost");
			}
			else {
				initial_sum=sum;
				while(true) {
					num1= 1+dice.nextInt(6);
				    num2= 1+dice.nextInt(6);
 
				    sum = num1+num2;
 
				    if(sum==initial_sum) {
				    	number_win++;
				    	System.out.println("You won");
				    	break;
				    }
				    else if(sum==7) {
				    	System.out.println("You lost");
				    	break;
				    }
				}
			}
 
 
		}
 
 
 
 
		System.out.println("Probability of win:"+(double)number_win/n);
 
 
	}
    
}
