/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void fibonacciSeries(int n){ //to print n fibonacci numbers
    
        System.out.print("1 1 ");
        int x = 1, y = 1;
        int temp;
        for(int i=2;i<n;i++){
            System.out.print(String.valueOf(x + y) + " ");
            temp = x;
            x = y;
            y = temp + y;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		fibonacciSeries(10);
	}
}
