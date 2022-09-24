import java.util.Arrays;
import java.util.Scanner;


public class Game2
{
    public static void main(String[] args) 
	{
	
	
        Scanner input = new Scanner(System.in);

	number100(45);
	
	}

	

  public static int number100 (int a)
	{	
		Scanner input = new Scanner(System.in);
		
		int max = 100;
		int min = 0 ;	
		int b=100 ;
		
		int count = 0 ;
		
		do
		{
			System.out.println("Sayiniz -->  " + b + "  sayisindan buyukse 1 , kucukse 0'a bas. " );
			
			int x = input.nextInt();

			if(x==0)
			{	
				max = b ;
				b = (int)(Math.random()*(max-min))+min;	
					
			}
			
			if(x==1)
			{
				min = b ;
				b = (int)(Math.random()*(max-min))+min;	

			
			}
			
			




			count++;
		}while(b != a);
		

		
		
		System.out.println(count + " denemede buldu.");
		return b ;
	}

}


