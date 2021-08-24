package myRPG;

import java.util.Scanner;

public class myRpg {
	
	// declaring variables
	static int skill;
	static int charisma;
	
	//toString method to return our character's attributes
	public String toString() {
		String attributes = "Your charisma is " + charisma + ", your skill is " + skill + "!";
		return attributes;
	}
	//geek class constructor
	public void geek() {
		skill = 75;
		charisma = 35;
	}
	// coolGuy class constructor
	public void coolGuy() {
		skill = 50;
		charisma = 50;
	}
	// owner class constructor
	public void owner() {
		skill = 35;
		charisma = 75;
	}
	// main method
	public static void main(String[] args) {	
		//creating new character
		myRpg me = new myRpg();
		
		// requesting user input to pick a class
		@SuppressWarnings("resource")
		Scanner classchoice = new Scanner(System.in);
		System.out.println("Please pick a class:");
		System.out.println("1 - Geek");
		System.out.println("2 - Cool Guy");
		System.out.println("3 - Owner");
		int choice;
		choice = classchoice.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("You're now playing as the Geek!");
				me.geek();
				break;
			case 2: 
				System.out.println("You're now playing as the Cool Guy!");
				me.coolGuy();
				break;
			case 3:
				System.out.println("You're now playing as an owner!");
				me.owner();
				break;
			default:
				System.out.println("This is not a valid option");
				break;
			}	
		System.out.println(me.toString());
		
		// first question
		System.out.println("*************************************************************");
		System.out.println("You've matched with that sweet girl on an online dating app, you : ");
		System.out.println("1 - Engage the conversation with an original pick-up line");
		System.out.println("2 - Engage the conversation politely");
		System.out.println("3 - Wait for her to contact you");
		@SuppressWarnings("resource")
		Scanner firstQuestion = new Scanner(System.in);
		int firstAnswer = firstQuestion.nextInt();
			switch(firstAnswer) {
			case 1:
				System.out.println("She appreciated it!");
				charisma+=20;
				skill +=10;
				break;
			case 2:
				System.out.println("Nothing fancy but the conversation started!");
				skill +=10;
				break;
			case 3:
				System.out.println("Come on, man!");
				skill -= 15;
				charisma -=15;
				break;
			default:
				System.out.println("This is not a valid option");
				break;		
			}
		System.out.println(me.toString());		
		
		//second question
		System.out.println("*************************************************************");
		System.out.println("Now that the conversation started, it's time to think about a date: ");
		System.out.println("1 - No hesitation, you ask her out on the coming days");
		System.out.println("2 - You hold on a bit to know more about her, then proceed to ask her out");
		System.out.println("3 - Wait for her to ask you out");	
		@SuppressWarnings("resource")
		Scanner secondQuestion = new Scanner(System.in);
		int secondAnswer = secondQuestion.nextInt();
			switch(secondAnswer) {
			case 1:
				System.out.println("Well done mate, no time to waste!");
				charisma+=20;
				skill +=10;
				break;
			case 2:
				System.out.println("Lucky you, she's all about waiting too!");
				skill +=10;
				break;
			case 3:
				System.out.println("Who does that?");
				skill -= 15;
				charisma -=15;
				break;
			default:
				System.out.println("This is not a valid option");
				break;	
			}
		
		System.out.println(me.toString());	
		
		//third question
		System.out.println("*************************************************************");
		System.out.println("Now it's time to think about a place to date her:");
		System.out.println("1 - Your local park");
		System.out.println("2 - Your local bar");
		System.out.println("3 - Your place");	
		@SuppressWarnings("resource")
		Scanner thirdQuestion = new Scanner(System.in);
		int thirdAnswer = thirdQuestion.nextInt();
			switch(thirdAnswer) {
			case 1:
				System.out.println("She likes nature too!");
				charisma+=15;
				break;
			case 2:
				System.out.println("She likes drinking too!");
				skill +=10;
				break;
			case 3:
				System.out.println("Really?");
				skill -= 10;
				charisma -=10;
				break;
			default:
				System.out.println("This is not a valid option");
				break;	
			}
		System.out.println(me.toString());		
		System.out.println("*************************************************************");
		
		// did the class change?
		if (charisma >= 75 && skill >= 35) {
			System.out.println("You are an owner!");
		}else if (charisma >= 50 && skill >= 50) {
			System.out.println("You are a cool guy!");		
		}else {
			System.out.println("You are a nerd!");
		}
		
		
	}

}
