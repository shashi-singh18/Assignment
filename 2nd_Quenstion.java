// Write a program that calculates the amount of money a person would earn over a period 
// of time if their salary is one penny the first day, two pennies the second day, and 
// continues to double each day. This version of the program should determine how many 
// days a person would need to work before they received a million dollars per day in salary.


public class Main
{
	public static void main(String[] args) {
	    int targetEarning = 100000000;
	    int days = 1;
	    int currrentEarning = 1;
	    while(currrentEarning < targetEarning) {
	        currrentEarning = currrentEarning * 2;
	        days++;
	    }
	    System.out.println("Required number of days: " + days); 
	}
}
