package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q06 {

	/*
	Examine the following iterative implementation of a method that computes the square root
	of a given value using the Babylonian method:
	 */
	public static double sqrt ( double x) {
		double xOld = x;
		double xNew = x / 2;
		while ( Math .abs( xOld - xNew ) > 0.001) { // absolute value
			xOld = xNew ;
			xNew = ( xNew + (x / xNew )) / 2;
			System .out. println ( xOld );
		}
		return xNew ;
	}
	
	//Your task is to write a recursive implementation of the above method.
	//You should use a helper method as part of your recursive implementation.
	
	public static double sqrtR( double x) {
		double xOld = x;
		double xNew = x / 2;
		return sqrtHelper(x, xNew, xOld);
	}

	public static double sqrtHelper(double x, double xNew, double xOld){
		if (Math.abs(xOld - xNew) < 0.001){
			return xNew;
		}
		xOld = xNew;
		xNew = (xNew + (x / xNew)) / 2;
		System.out.println(xOld);
		return sqrtHelper(x, xNew, xOld);

	}


	public static void main ( String[] args ) {
		System.out.println(sqrt(5)); //given method
		System.out.println("");
		System.out.println(sqrtR(5)); //your recursive method
		
	}

}
