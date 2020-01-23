package train;
import java.util.Scanner;
public class Encryption {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = input.nextInt();
		
		int fourtnum = number %10;
		int sum = number/10;
		int thirdnum =	sum % 10;
		int snum =	sum / 10;
		int secondnum = snum % 10;
		int firstnum = snum / 10;
				
		firstnum = (firstnum + 7 )% 10;
		secondnum = (secondnum + 7) % 10;
		thirdnum = (thirdnum + 7) % 10;
		fourtnum = (fourtnum + 7) % 10;
	
		firstnum = thirdnum;
		thirdnum =  firstnum;
		secondnum = fourtnum;
		fourtnum = secondnum;
		
		System.out.printf("The encrypted number is %d%d%d%d",firstnum,secondnum,thirdnum, fourtnum);
			
			}
	}

