package trial;

import java.util.Scanner;

public class trial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i = 1,j=1;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a number");
		a=s.nextInt();
		a=a-1;
		b=a;
		
		while(a>0) {
			for(int k=1;k<j;k++)
				System.out.print(" ");
			
			System.out.print("*");
		if(i<=b) {
			for(int l=1;l<=b;l++)
				System.out.print("  ");
		}
		System.out.print("*");
		
		System.out.println();
			b--;
			a--;
			j++;
		}
		j=j+1;
		for(int k=1;k<j;k++)
			System.out.print(" ");
		System.out.print("*");
		
	}
}


