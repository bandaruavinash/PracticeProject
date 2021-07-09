package P1;
import java.io.*;
import java.util.Scanner;

public class Player1 extends Player  {
	public static void main(String []args) {
		Player p= new Player();
	Scanner sc=new Scanner(System.in);
		String pid,pn,pz;
		int n,r,number;
		System.out.println("Enter 1 to enter to the program or any other number to exit the program");
		number=sc.nextInt();	

	while(number==1) {		
	System.out.println("1. Create player's profile");
	System.out.println("2. Display player details");
	System.out.println("3. Exit");
	System.out.println("Enter the Choice");
	int ch= sc.nextInt();

	switch(ch) {
	
	      case 1:
	        System.out.println("Enter Player Id");
	       pid=sc.nextLine();
	       pn=sc.nextLine();
	      sc.nextLine();
	       n=sc.nextInt(); 
	       r=sc.nextInt();
	       sc.nextLine();
	      pz= sc.nextLine();
	       p=new Player(pid,pn,n,r,pz);
	        break;
	      case 2:
	       System.out.println(p.getPlayerId());
	       System.out.println(p.getPlayerName());
	       System.out.println(p.getMatchesPlayed());
	       System.out.println(p.getRunScored());
	       System.out.println(p.getPlayingZone());
	        break;
	      case 3:
	        System.out.println("Thanks for visiting BCCI");
	        break;
	
	}
	System.out.println("Enter 1 to continue the program");
	number=sc.nextInt();
	if(number==1)
	{
		continue;
	}
	else 
		break;
	
	}
	}
}
