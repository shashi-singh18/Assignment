// Write a program that accepts the names of three political parties and the number 
// of votes each received in the last mayoral election. Display the percentage of 
// the vote each party received.   

import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //input for political parties
        String party1 = sc.next();
        String party2 = sc.next();
        String party3 = sc.next();
        
        //input for number of votes
        double votes1 = sc.nextInt();
        double votes2 = sc.nextInt();
        double votes3 = sc.nextInt();
        
        //calculating total votes
        double totalVotes = votes1 + votes2 + votes3;
        
        //calculating each party received the votes
        double perc1 = (votes1/totalVotes) * 100;
        double perc2 = (votes2/totalVotes) * 100;
        double perc3 = (votes3/totalVotes) * 100;
        
        System.out.printf(party1 + " received: " + "%.2f", perc1);
        System.out.println("% vote");
        System.out.printf(party2 + " received: " + "%.2f", perc3);
        System.out.println("% vote");
        System.out.printf(party3 + " received: " + "%.2f", perc2);
        System.out.println("% vote");
    }
}
