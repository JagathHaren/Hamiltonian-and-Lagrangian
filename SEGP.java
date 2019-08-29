package myproject;

import java.util.Scanner;

public class SEGP {

	public static void main(String[] args) {
		int n,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n+1]; 
		int b[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<a[i+1])
			{
				b[j]= a[i+1];
				j++;
			}
		}
	    	b[j]=a[n-1];
		for(int i=0;i<j+1;i++)
			System.out.print(b[i]+" ");
        sc.close();
	}

}
