package trial;

import java.util.Scanner;

public class trial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		String st = "";
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		
		while(a>0)
		{
		b = a%2;
		st=b+" "+st;
		a=a/2;
		
		}
		System.out.print(st+"");
		
		}
		
		
		
		
	}


