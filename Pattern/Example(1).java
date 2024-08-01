package trial;

import java.util.Scanner;

public class trial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a number:");
		i=s.nextInt();
		for(int j=1;j<=i;j++)
		{
			k=(int)(Math.random()*10)+1;
			for(int n=1;n<=k;n++) {
				System.out.print("_");
			}
			System.out.print("A");
		}
	}

}
