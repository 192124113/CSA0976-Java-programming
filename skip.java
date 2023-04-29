import java.io.*;

import java.util.*;
class skip
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("M = ");
		int m = in.nextInt();
		System.out.println("N= ");
		int n = in.nextInt();
		System.out.println("k= ");
		int k = in.nextInt();
		System.out.println("Skipped no:");
		k++;
		for(int i=m;i<=n;i = i+k)
			{
				System.out.println( i );
			}
			System.out.println( );
	}
}