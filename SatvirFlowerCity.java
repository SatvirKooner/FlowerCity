/*
 * Name: Satvir Kooner
 * Date: April 19th, 2015
 * Teacher: Ms.Arif
 * Description: A game that takes place in Flower City. Greenman vs Dr.Dioxide.
 * 
 * */

import javax.swing.*;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SatvirFlowerCity
{
	String user;
	int score = 0;
	final long startTime;

	public static void main (String[] args)
	{
		new SatvirFlowerCity ();
	}


	public SatvirFlowerCity ()
	{
		//creating JFrame for the JProgressBar which is going to be the loading bar
		JFrame frame = new JFrame();
		//loading bar
		JProgressBar loading = new JProgressBar();
		//setting it to visible but it is not visible yet since it is not on a visible JFrame
		loading.setVisible(true);
		//adding it to the frame
		frame.add(loading);
		//adjusting
		frame.setSize(200,75);
		frame.setResizable(false);
		//now the loading bar and the JFrame are visible
		frame.setVisible(true);
		//position it in the center of the screen
		frame.setLocationRelativeTo(null);
		//dont allow the user to close teh loading bar
		frame.setDefaultCloseOperation(0);
		//allow the loading percentage to be visible
		loading.setStringPainted(true);

		//this loop goes from 1-5 adding 20% every 250ms
		for(int i =1; i<=5; i++)
		{
			loading.setValue(i*20);
			try{
				Thread.sleep(250);
			}catch(Exception e){

			}
		}

		//closes the frame automatically
		frame.dispose(); 

		//gets time at startup
		startTime = System.currentTimeMillis();
		setup ();
		intro ();
		stage1();

	}


	public void setup ()
	{

		JOptionPane.showMessageDialog(null, "Welcome to Flower City we hope you enjoy \nyour stay and have a great time here."  );
		int opt =1;
	       //while loop checking if it is empty or if they are not sure they want the username
		while(user == null || user.trim().isEmpty() || opt ==1  ){

			user = JOptionPane.showInputDialog(null, "Please choose a username: ");
			/*   try { 
       while(user.contains(" "))
       user = user.replace(" ","");
       } catch(Exception e){
       }*/                              
			if(user != null && (!user.trim().isEmpty())){
				// An array of type Object holds the two options "Yes", or "No I am not sue" this will be used in the OptionDialog
				Object[] options = { "Yes, I am sure", "No, I want to change it" };
				opt = JOptionPane.showOptionDialog(null, ("Are you sure you want "+user+" as your name."), "Choosing a name",
						JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION ,
						null, options, options[0]);
				//handles escape button or exit button
				if(opt ==-1){
					JOptionPane.showMessageDialog(null, "Do not close this window. ");
					opt = 1;
				}
				//handles if they want to change it
				else if(opt!=0)
					JOptionPane.showMessageDialog(null, "Please choose a new username.");
			}else{
				JOptionPane.showMessageDialog(null, "Error! Invalid Input!");
			}

		}


		printSlow ("FLower City", 75);
		printSlow("Instructions:",50);
		printSlow("1. Read the story and questions",50);
		printSlow("2. Put in the type of data that is requested",50);
		printSlow("3. Try not to make mistakes as they reduce your score",50);
		printSlow("4. However, most importantly ENJOY!",40);
		printSlow("Good Luck!",50);

	}



	public void intro() {
	
		astroBoy();
		System.out.println();
		System.out.println(getDate());
		System.out.println ("             .=.,        ");
		System.out.println ("            ;c =\\\\        ");
		System.out.println ("          __|  _/       ");
		System.out.println ("        .'-'-._/-'-._      ");
		System.out.println ("       /..   ____    \\\\    ");
		System.out.println ("      /' _  [<_->] )  \\\\      ");
		System.out.println ("     (  / \\\\--\\\\_>/-/'._ )        ");
		System.out.println ("      \\\\-;_/\\\\__;__/ _/ _/           ");
		System.out.println ("       '._}|==o==\\\\{_\\\\/              ");
		System.out.println ("        /  /-._.--\\\\  \\\\_                  ");
		System.out.println ("       // /   /|   \\\\ \\\\ \\\\                    ");
		System.out.println ("      / | |   | \\\\;  |  \\\\ \\\\                     ");
		System.out.println ("     / /  | :/   \\\\: \\\\   \\\\_\\\\                       ");
		System.out.println ("    /  |  /.'|   /: |    \\\\ \\\\                         ");
		System.out.println ("    |  |  |--| . |--|     \\\\_\\\\                           ");
		System.out.println ("    / _/   \\\\ | : | /___--._) \\\\                             ");
		System.out.println ("   |_(---'-| >-'-| |       '-'                                ");
		System.out.println ("       /_/     \\\\_\\\\               ");

		printSlow ("Welcome " + user + " we have been awaiting your arrival.", 40);
		printSlow ("Dr. Dioxide has been stirring up quite a mess in Flower City.", 40);
		printSlow ("The people have been waiting for you to save them. \nFrankly, I just can't keep up with it all.", 40);
		pause (1000);

		printSlow ("\n" + user + ": Waait... ", 100);
		printSlow (user + ": Where am I...? Who are you? ", 50);
		pause (1000);

		printSlow ("\n" + "Oh my... It appears that the damage is quite extensive...", 40);
		printSlow ("See it is quite a long story.\n", 30);
		pause (1000);

		printSlow ("There was once  a time in Flower City.", 40);
		printSlow ("When there was peace and people knew how to care for the enviornment.", 30);
		printSlow ("But then came one of the worst villains this city has ever seen.", 40);
		printSlow ("His name..", 150);
		printSlow ("Carbon.. Dioxide", 100);
		printSlow ("You were in a battle against him when you fell unconcious \nfrom  his global warminator.\n", 40);
		pause(1000);
	
		printSlow (user+": oh.. yeahh I am beginning to remember now..\n",40);
		pause(500);

		printSlow("\nThat's right you are known as Greenman to the city. And to me you are " +user+". \n Well if you are feeling better I think we better get started on saving the world.\n ",50);
		pause(4000);
	}

	public void stage1(){
			//apps refers to apartments
		apps(); 
		
		printSlow("In Greenman's lab:", 50);
		printSlow("The city has fallen to ruins under the wrath of Dr. Dioxide. The lands is filled with garbage, nuclear waste and depleteded resources.",25);
		printSlow("Your Mission: Find Dr. Dioxide's lab and stop him from destroying the environment. ", 25);
		printSlow("Start by finding his lab's location.",50);

		printSlow("\nWhat do you choose to do: ",40);
		printSlow("\n\ta) Run outside and just hope you find your way to his lab.",40);
		printSlow("\n\tb) Study the map for the best location that would fit Dr.Dioxide's purpose. \n\t   While having Enviro boy prepare for the effects outside.",40);
		printSlow("\n\tc) Don't worry about it my sidekick or somebody else will handle it\n",40);
		//Q1 refers to question 1
		char inputQ1 = 'g';

		inputQ1 = IBIO.inputChar("Which option do you choose? ");
		while(!(isValid(inputQ1,"abc"))){
			System.out.println("That inpput is invalid.\n");
			inputQ1 = IBIO.inputChar("Which option do you choose? ");
		}

		if (inputQ1 == 'a' || inputQ1 == 'A')
		{                    
			printSlow("You run outside and are not prepared for the extremity of the damage Dr.Dioxide \nhas caused with his evil devices. You are stunned by the immense heat being produced \nfrom the Global Warminator",50);
			printSlow("By acting without thinking you failed this city!",40);
			pause(3000);
			gameOver();    

		} else if (inputQ1 =='b' || inputQ1 =='B')
		{
			score +=50; 
			stage2();
		} else if (inputQ1 =='c' || inputQ1 =='C')
		{
			printSlow("You failed your duties as a citizen and as a hero. By turning a blind eye to Dr.Dioxide you let him destroy the world.",50);
			pause(2000);
			gameOver();
			;

		}

	}

	public void stage2(){
		printSlow("", 50);
		printSlow("The city has fallen to ruins under the wrath of Dr. Dioxide. The lands is filled with garbage, nuclear waste and depleteded resources.",25);
		printSlow("Your Mission: Find Dr. Dioxide's lab and stop him from destroying the environment. ", 25);
		printSlow("Start by finding his lab's location.",50);
		printSlow("\nTo find his lab you need to get your map but your desk... it is a mess from luncg.\nFirst Organize your desk by throwing away the waste in its proper place.",25);
		printSlow("\nTask: Match the items with the correct method of disposal. \nYou can make a MAXIMUM of 10 mistakes\n",25);

		printSlow("Hint: Not only organic materials can be composted. There may also be different possibilities for one item. ",25);
		printSlow("1. Empty Tim Horton's coffee cup \t A) Compost it",25);
		printSlow("2. Empty Box of pizza \t\t\t B) Recycle it",25);
		printSlow("3. Banana peel  \t\t\t C) Throw it in the trash",25);
		printSlow("4. Used paper napkins ",25);
		printSlow("5. Wooden spoon \t ",25);
		printSlow("6. Candy wrapper \t  ",25);
		printSlow("7. Newspaper \t \n",25);

		int i =0;
		//All references of merits refers to tries or merits meaning things they do that are good
		int merits =10;
		String originalList = "1234567";
		String list = originalList;
		// array holds the garbage item names
		String[] garbage =
			{ 
				"empty Tim Horton's coffee cup",
				"empty box of pizza",
				"banana peel",
				"used paper napkins",
				"wooden spoon",
				"candy wrapper",
				"empty juice box"
			};

		int item =0;
		i=0;
		for(int z =1; z<=7; z++){
			do{
				if (merits<1)
					gameOver();
				if (!(list.contains(""+item)) && originalList.contains(""+item) && item !=0)
				{
					printSlow("You have already dealt with the "+garbage[item-1]+ "no need to do it again.\n",25);
				}

				else if(i>0)
					printSlow("That is not a valid input.\n",25);
				if(list.length()<=6)
					item = IBIO.inputInt("What do you want to dispose of next? (1-7): ");
				else
					item = IBIO.inputInt("What do you want to dispose of first? (1-7): ");

				i++;
			} while(!(isValid(item,list)));

			i =0;
			int x=1;
			while(x==1){
				char dispose;
				do{
					if (merits<1)
						gameOver();
					if(i>0)
						printSlow("That is not a valid input.\n",25);
					dispose = IBIO.inputChar("What should you do with the "+garbage[item-1]+ "? (a-c): ");
					i++;
				} while(!(isValid(dispose,"abcABC")));


				switch (item){

				case 1: 
					if(dispose == 'B' || dispose =='b' || dispose == 'C' || dispose =='c')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("1","");
						score +=25; 
						//They get 25 points for getting it right. This is written here and not at a later point because if they do not complete this stage they should get atleast partial points.
						x++;
					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				case 2: 
					if(dispose == 'B' || dispose =='b')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("2","");
						score +=25; 
						x++;

					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!\n",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				case 3: 
					if(dispose == 'A' || dispose =='a')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("3","");
						score +=25; 
						x++;

					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!\n",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				case 4: 
					if(dispose == 'A' || dispose =='a')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("4","");
						score +=25; 
						x++;
					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!\n",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				case 5: 
					if(dispose == 'C' || dispose =='c')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("5","");
						score +=25; 
						x++;

					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);


					}
					break;

				case 6: 
					if(dispose == 'B' || dispose =='b')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("6","");
						score +=25; 
						x++;


					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!\n",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				case 7: 
					if(dispose == 'B' || dispose =='b')
					{
						printSlow("That is the correct method of disposal!\n" ,25);
						list = list.replace("7","");
						score +=25; 
						x++;

					} 
					else 
					{
						printSlow("That is the incorrect method of disposal!\n",25);
						merits--;
						printSlow("You have "+merits+" tries left.\n",25);

					}
					break;

				} 
				i=0;
			}   
			item =0;


		}
		score += (merits*25);
		//Adds 25 points per merit point. This is scoring based on skill.
		stage3();

	}
	
	public void stage3(){
		printSlow("You successfully cleaned your desk.\n\nNow that you have found the map on your desk you can use it to find Dr. Diocide's lab",25);
		printSlow("After analysing the map and having Enviro Boy analysing the weather patterns you found an unusal cloud." ,25);
		printSlow("It was an X shaped cloud forming where an old factory used to be. \n",30);
		pause(1000);

		printSlow(user+": Dr.Dioxide must have his lab hidden under this X", 30);
		printSlow(user+": He likes to play games so this must be his way of luring us there",30);
		printSlow(user+": We will have to be extra careful Enviro Boy. We must outplay his every move.\n",30);
		pause(1000);

		printSlow("Enviro Boy: Alright let's get to his lab as fast as we can.",30);
		printSlow("Enviro Boy: But. Wait... How far away is the lab?\n",30);
		pause(1000);

		int x = (int) (Math.random()*20)+1;
		int y = (int) (Math.random()*20)+1;
		printSlow(user+": Hmmmmm... Well the lab is located "+x+" km north and "+y+" km east of here . \n",25);
		int distance;
		int roundedDistance;
		int merits = 5;
		double realDistance =Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		int distanceup= (int) Math.ceil(realDistance);
		if(distanceup-realDistance <0.5)
			roundedDistance = distanceup;

		else
			roundedDistance= (int) Math.floor(realDistance);


		int g =0;
		do{
			if(g>0){
				printSlow("That is incorrect. \n",25);
				merits--;
				System.out.println("You have "+merits+" more tries left.");
				if (merits ==0)
					gameOver();
			}
			distance = IBIO.inputInt("Enviro Boy: How many kilometres would that be diagonally? (Use pythagorean theorem and round to the nearest whole number): ");
			g++;
		} while(distance != roundedDistance);
		score+= merits*50; 
		printSlow("That is correct nice one!",40);
		int ans ;
		int i = 0;
		do{
			if(i>0)
			printSlow("Inccorect/Invalid answer.",50);
			ans = IBIO.inputInt("\nSystem: To progress to the next task please answer the following question: 8/(3-1) = ?\n");
			i++;
		} while(ans !=4);
	  
		pause(500);
		printSlow("Progressing to next stage...",45);
		stage4(roundedDistance);

	}

	public void stage4(int distance){

		printSlow("Enviro Boy: So, how do we get there? I mean we have to get there within 30 minutes...",50);
		printSlow("Enviro Boy: However, we also want to be enviromentally friendly\n" , 30);
		pause(500);

		printSlow(user+": Well let's think about this.", 30);
		printSlow(user+": We also want to be enviromentally friendly" , 30);   
		printSlow(user+": List our options Enviro Boy\n", 30);
		pause(500);

		printSlow("Enviro Boy: Well we can drive our car there.",30);
		printSlow("Enviro Boy: Or we can ride our bicycles there.",30);
		printSlow("Enviro Boy: If not we can always walk there.\n",30);
		pause(500);

		printSlow(user+": If we took our car there that would not be great for the environment but it would be pretty fast.", 30);
		printSlow(user+": If we rode our bicycles there then we would signigicantly reduce our environmental impact and it would be moderatly fast",30);
		printSlow(user+": If we walked there that would be great for the environment but it would be pretty slow.\n", 30);
		pause(300);

		printSlow("Enviro Boy: So which method do you want to take?\n",30);
		pause(300);
		String response;
		String[] modeOfTransport =  {"Bicycle", "Walk", "Car"};
		int indexOfTransport;
		do {
			response = IBIO.inputString("System: Which method do you choose?(Type Bicycle/Walk/Car) \n");
		}while(!(isValid(response, modeOfTransport)));


		if( response.equalsIgnoreCase("Bicycle"))
		{
			printSlow("Enviro Boy: good choice "+user+"! That is a clean mode of transportation and will take us there quick enough!",30);
			indexOfTransport =0;
			Lock();
			score+=100;
			stage5();
			
		}
		else if (response.equalsIgnoreCase("Walk"))
				{
			printSlow("Enviro Boy: That was close! Although walking is a clean mode of transportation it will take us quite a while to arrive at our destintion!",30);
			indexOfTransport =1;
			pedestrian();
			score +=30;
			stage5();

				}
		else
				{
			if(distance<=6)
			{

				printSlow("Enviro Boy: That was a good choice! ",30);
				printSlow("Enviro Boy: Although driving can be harmful for the environment in this case since the ditance was "+distance+" km, it would make sense.\n",30);
				score+=100;

			}

			else{

				printSlow("Enviro Boy: That was an okay choice although no tthe best! ",30);
				printSlow("Enviro Boy: Driving can be harmful for the environment and although it is useful for long distances",30);
				printSlow("Enviro Boy: in this case since the distance was "+distance+" km,so it would not  make sense to drive.\n",40);
				score+=30;

			}
			indexOfTransport =2;
			pause(500);
			printSlow("Loading stage 5...",50);
			disaster();
			stage5();
				}


		
	}
	
	// The Lock method is only if they use a bicycle and shows thema realistic problem but not so realistic cause and solution.
	public void Lock(){

		printSlow("\n"+user+": Oh no! It appears that there is a combination lock on my bicycle! This must have definately been the work of Dr.Dioxide!\n",40);
		printSlow(user+": I know! I will crack this code!\n",40);

		printSlow("Task: Crack the combination! You will be given clues for each number and will have to crack the code one number at a time!",30);
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		int guess4 = 0;

		int digit1 = (int) (Math.random()*9)+1;
		int digit2 = digit1 % 3;
		int digit3 = (int) (digit2 / (Math.PI));
		int digit4 = (int) (Math.random()*9)+1;


		printSlow("Hint #1: The combination is a 4 digit number.",20);
		printSlow("Hint #2: The digits can be from 1-9.",20);
		printSlow("Hint #3: The first digit is "+isEven(digit1),20);
		// i is used to say "inavlid input".

		char ask = IBIO.inputChar("\nWould you like to guess the first digit now? (y=I will guess/n=wait/n)");

		while(!(isValid(ask,"yYnN"))){
			printSlow("Invalid input!",30);
			ask = IBIO.inputChar("Would you like to guess the first digit now? (y=I will guess/n=wait/n)");
		}

		if (ask =='y' || ask =='Y')
		{
			guess1 = IBIO.inputInt("What number do you think the first digit is?");
			while((!(isValid(guess1,"123456789")))){
				printSlow("Inavlid input. Please try again!",40);
				guess1 = IBIO.inputInt("What number do you think the first digit is?");
			}
			if (guess1 == digit1)
			{
				printSlow("Congratulations, you got it right!",40);
				score += 50;
			}

		}

		if (ask =='n'|| ask == 'N' || guess1 != digit1)
		{
			if (ask=='y' || ask == 'Y')
				printSlow("That was wrong!",30);
			printSlow("Continuing with more hints!",30);
			printSlow("Hint #4: The first digit is "+properties(digit1),20);
		}

		do
		{
			if(!(isValid(guess1,"123456789")))
				printSlow("Invalid Input! Please try again!",30);
			guess1 = IBIO.inputInt("What number do you think the first digit is?");
		}
		while(guess1 != digit1);


		printSlow("You got the first digit! It is "+digit1,30);
		printSlow("Try to guess the second digit now.",35);
		printSlow("The second digit is "+isEven(digit2),35);
		printSlow("It is also "+properties(digit2)+"\n",35);

		guess2 = IBIO.inputInt("What number do you think the second digit is?\n");

		while(guess2 != digit2)
		{
			if(!(isValid(guess1,"123456789")))
				printSlow("Invalid Input! Please try again!",30);
			guess2 = IBIO.inputInt("What number do you think the second digit is?\n");
		}


		printSlow("You got the second digit! It is "+digit2,30);
		printSlow("Try to guess the third digit now.",35);
		printSlow("The third digit is "+isEven(digit3),35);
		printSlow("It is also the second digit divided by 3.\n",35);

		guess3 = IBIO.inputInt("What number do you think the third digit is?\n");
		while(guess3 != digit3)
		{
			if(!(isValid(guess3,"123456789")))
				printSlow("Invalid Input! Please try again!",30);
			guess3 = IBIO.inputInt("What number do you think the third digit is?\n");
		}

		printSlow("You got the third digit! It is "+digit3,30);
		printSlow("Try to guess the third digit now.",35);
		printSlow("The fourth digit is "+isEven(digit4),35);
		printSlow("It is also "+properties(digit4)+"\n",35);

		guess4 = IBIO.inputInt("What number do you think the fourth digit is?\n");

		while(guess4 != digit4)
		{
			if(!(isValid(guess4,"123456789")))
				printSlow("Invalid Input! Please try again!",30);
			guess4 = IBIO.inputInt("What number do you think the fourth digit is?\n");
		}

		//no score for partial correct. This must be fully completed to get any points.
		score+= 200;
	}
	
	
	//Random task that is run only if they walk
	public void pedestrian()
	{
		printSlow("You are walking down the street when you notice a group of teens,",40);
		printSlow("they are walking around the streets throwing their garbage around.",35);
		printSlow("You are in a hurry and need to get to Dr. Dioxide's lab.",35);
		printSlow("What do you choose to do?\n",40);

		printSlow("a)\tYou can ignore them and continue walking to his lab.",30);
		printSlow("\t  They probably wont do it again anyways right?\n",30);

		printSlow("b)\tYou can choose to pick up the litter for them.",30);
		printSlow("  \tAs long as someone is picking up the litter it should be fine right?",30);

		printSlow("c)\tYou stop them and talk to them about that they just did.",30);
		printSlow("  \tThey seem like they do  not know that littering can be harmful.",30);
		printSlow("  \tThis seems like a good idea too..",30);

		char choice = IBIO.inputChar("What do you choose to do?\n");

		while(!(isValid(choice, "aAbBcC")))
		{
			printSlow("That is an invalid input!",30);
			choice = IBIO.inputChar("What do you choose to do?\n");
		}

		if (choice == 'a' || choice == 'A')
		{
			printSlow("By doing nothing about the teens littering you show them that it is okay to litter.",40);
			printSlow("The teens develop a habit of littering and accelerate the climate temperatures. increase",40);
			printSlow("By being lazy and ignoring this issue you have failed the city and its people.\n",30);

			gameOver();
		}

		else if (choice == 'b' || choice == 'B')
		{
			printSlow("You helped the teenagers out by picking up the litter but you did not teach them a lesson.",40);
			printSlow("They continued to litter and this has a negative impact on the environment.",40);
			printSlow("You were however lucky, the city managed to sustain itself (barely) and you should not make any more mistakes!\n",40);
		}

		else
		{
			printSlow("By stopping and talking to these teens you showed them just how big of an issue littering can be.",40);
			printSlow("They fully understood what you were trying to say anf apoligized for their actions",40);
			printSlow("You restored the city's faith in your abilities. Congratulations!\n",50);
		}
	}
	//This method is run only if they use a car and shows the harmful effects of pollution
	public void disaster()
	{
		printSlow("Dr.Dioxide has started his new machine the Pollutanator 2000.",40);
		printSlow("He is planning on using it to to turn all the oxygen into carbon Dioxide and thus end all the wild life!",40);
		printSlow("By using a car to get to his lab you sparked a large scale reaction of his Pollutanator 2000",50);
		printSlow("Luckily, you wrote down the names of 4 plants that are highly efficient at photosynthesis and will convert all the Carbon Dioxide into Oxygen.",40);
		printSlow("However, they are all scrambled up; you have to unscramble them.\n",40);

		printSlow("Mission: Unscramble the names of the plants to stop Dr.Dioxide and to save this city!",40);
		printSlow("You can make only 12 mistakes. Good luck!\n",40);

		printSlow("Plant 1: oBlom lroeFw",40);

		int merits = 12;

		String plant1 = IBIO.inputString("What is the unscrambled name of the plant?(case sensitive)");

		while(plant1.contains(" "))
			plant1 = plant1.replace(" ","");

		while(!(plant1.equals("BloomFlower"))){
			merits--;
			if(merits <1)
				gameOver();
			printSlow("That is the wrong answer!",50);
			printSlow("Please try to unscramble it again.",50);
			printSlow("You have "+merits+" tries left.\n",50);

			plant1 = IBIO.inputString("What is the unscrambled name of the plant?(case sensitive)\n");

		}
		
		printSlow("That is correct!\n",45);

		printSlow("Plant 2: der rseo",40);

		String plant2 = IBIO.inputString("What is the unscrambled name of the second plant?(case insensitive)");

		while(plant2.contains(" "))
			plant2 = plant2.replace(" ","");

		while(!(plant2.equalsIgnoreCase("RedRose"))){
			merits--;
			if(merits <1)
				gameOver();
			printSlow("That is the wrong answer!",50);
			printSlow("Please try to unscramble it again.",50);
			printSlow("You have "+merits+" tries left.\n",50);

			plant1 = IBIO.inputString("What is the unscrambled name of the second plant?(case insensitive)\n");

		}
		
		printSlow("That is correct!\n",45);
		
		printSlow("Plant 3: reet alepp",40);

		String plant3 = IBIO.inputString("What is the unscrambled name of the third plant?(case insensitive)");

		while(plant3.contains(" "))
			plant3 = plant3.replace(" ","");

		while(!(plant3.equalsIgnoreCase("AppleTree"))){
			merits--;
			if(merits <1)
				gameOver();
			printSlow("That is the wrong answer!",50);
			printSlow("Please try to unscramble it again.",50);
			printSlow("You have "+merits+" tries left.\n",50);

			plant1 = IBIO.inputString("What is the unscrambled name of the third plant?(case insensitive)\n");

		}
		
		printSlow("That is correct!\n",45);

		score+= 5 * merits;

	}

	public void stage5()
	{       
		printSlow("Enviro Boy: Alas.. We finally arrived at Dr.Dioxide's lab\n",45);    

		printSlow(user+": Great! You begin by trying to search his computer I'll look around and see what I can find.\n",45);   

		printSlow("Enviro Boy: But how will we get passed his dog?",40);

		printSlow(user+": Hmm I think we can...\n",40);

		printSlow("a)\tRun past the dog and hope it doesn't chase you.",40);
		printSlow("b)\tSneak past it when he is sleeping.",40);
		printSlow("c)\tThrow him some chocolate to distract him and carry on.",40);

		char answer = IBIO.inputChar(" Which option do you choose?(a/b/c)");

		while(!(isValid(answer, "aAbBcC")))
		{
			printSlow("Invalid input!",40);
			answer = IBIO.inputChar(" Which option do you choose?(a/b/c)");
		}

		if (answer == 'a' || answer == 'A')
		{
			printSlow("By not thinking about the potential consequence that you actions could have you attempted to run past the dog..",50);
			printSlow("Needless to say it did not end well..",50);
			printSlow("You failed this city!",50);
			gameOver();

		}

		else if (answer == 'b' || answer == 'B')
		{
			printSlow("You thought this plan through it seems...",50);
			printSlow("You were able to sneak right past the dog without him noticing!",50);
			printSlow("Congratulations! You are one step closer to a greener city!\n",50);
			score += 20;
		}



		else
		{
			printSlow("You thought this plan would work it seems...",50);
			printSlow("You calmed down the dog for a while!",50);
			printSlow("However, you did not do good with the dog...",50);
			printSlow("The dog died of food posioning!\n",50);
		}
		stage6();
	}

	public void stage6()
	{
		
		computers();
		
		printSlow(user+": So Enviro Boy do you have any progress with the computers?",40);
		printSlow(user+": We have to get out of here before his dog wakes up again!\n",50);

		printSlow("Enviro Boy: Yes, I found his plan. He is going to launch his latest attack on the environment using his..",40);
		printSlow("Enviro Boy: GLobal Warminator...",80);
		printSlow("Enviro Boy: I can stop it right now using the computer but it is locked with a riddle!\n",30);

		printSlow(user+": Why don't you tell me it. Maybe I can help with it?\n",40);

		printSlow("Answer the riddle, do not get this wrong as you have only three chances..",50);
		printSlow("This is the final stage in the game so be very careful!\n",40);

		printSlow("Printing Riddle...",55);

		printSlow("I can kill yet I am essential for life",30);
		printSlow("I can save you when you feel as if you are burning",35);
		printSlow("Yet, that same burning is how I am produced",35);
		printSlow("I am everywhere, yet I am nowhere",35);
		printSlow("What am I? (case insensitive)",40);
		
		int merits =5;
		String response = IBIO.inputString("Enter what you believe the answer is?");
		while(response.equalsIgnoreCase("Carbon Dioxide"))
		{
			merits--;
			if(merits <1)
				gameOver();
			
			printSlow("That was wrong! You have "+merits+ " tries left.",45);
		    response = IBIO.inputString("Enter what you believe the answer is?");

		}
		score += 50;
		success();
	}

	//This method is used for clues for the digits.
	public String properties (int num)
	{
		String properties = "";
		if(num>5)
			properties +="greater than five.";
		else
			properties +="less than five.";

		printSlow(" The numner is "+(num%2)+"+ "+(num /2)+" x 2",50);
		return properties;
	}
	//this method is to get the date
	public String getDate(){
		Date d = new Date();
		SimpleDateFormat ft = 
				new SimpleDateFormat ("EEEE, MMMM, d, yyyy hh:mm a z"); //This formats the date as: Day of Week, Month, Day of Month, Year, Hour:Minute and Time Zone (AM/PM)
		ft.setTimeZone(TimeZone.getTimeZone("EST"));
		return ("Date: " + ft.format(d));
	}
	// Used to print test slowly;
	public void printSlow (String text, int delay)
	{

		for (int i = 0 ; i < text.length () ; i++)
		{
			System.out.print (text.charAt (i));

			try
			{
				Thread.sleep (delay);

			}

			catch (Exception e)
			{

			}
		}
		System.out.println ();
	}

	public String isEven(int num)
	{ 
		int remainder = num %2;

		if(remainder ==0)
			return "even";

		else
			return "odd";
	}

	public void pause (int time)
	{
		try
		{
			Thread.sleep (time);

		}

		catch (InterruptedException e)
		{

		}
	}

	public boolean isValid(String stringToCheck, String[] text)
	{

		for(int i =0 ; i<= text.length; i++){
			if(text[i].equalsIgnoreCase(stringToCheck))
				return true;

		}
		return false;

	}

	public boolean isValid(char charc, String check)
	{
		String text = check;
		String charToCheck  =""+ charc;

		if (text.contains(charToCheck))
			return  true;

		else
			return false;
	}

	public boolean isValid(int intToString, String check)
	{
		if(intToString<=9 && intToString>=0){
			String intToCheck  =""+ intToString;

			if (check.contains(intToCheck))
				return  true;

			else
				return false;

		}
		else 
			return false;
	}

	//method to handle losses.
	public void astroBoy(){

System.out.println("        ,                                           ");
System.out.println("        |'.             ,");
System.out.println("        |  '-._        / )");
System.out.println("      .'  .._  ',     /_'-,");
System.out.println("     '   /  _'.'_\\   /._)')");
System.out.println("    :   /  '_' '_'  /  _.'");
System.out.println("    |E |   |Q| |Q| /   /");
System.out.println("   .'  _\\  '-' '-'    /");
System.out.println(".'--.(S     ,__` )  /");
System.out.println("       '-.     _.'  /");
System.out.println("    __.--'----(   /");
System.out.println(" _.-'     :   __\\ /");
System.out.println("(      __.' :'  :Y");
System.out.println(" '.   '._,  : E :|");
System.out.println("   '.     ) :.__:|");
System.out.println("     \\    \\______/");
System.out.println("      '._L/_H____]");
System.out.println("      /_        /");
System.out.println("     /  '-.__.-')");
System.out.println("     :      /   /");
System.out.println("     :     /   /");
System.out.println("   ,/_____/----;");
System.out.println("   '._____)----'");
System.out.println("   /     /   /");
System.out.println("  /     /   /");
System.out.println(".'     /    \\");
System.out.println("(______(-.____)");


	}
	
	public void apps(){
System.out.println("                       ________            _______                                                                                          ");
System.out.println("         /\\ \\ \\ \\/_______/     ______/\\      \\  /\\ \\/ /\\ \\/ /\\  \\_____________");
System.out.println("        /\\ \\ \\ \\/______ /     /\\    /:\\\\      \\ ::\\  /::\\  /::\\ /____  ____ __");
System.out.println("       /\\ \\ \\ \\/_______/     /:\\\\  /:\\:\\\\______\\::/  \\::/  \\::///   / /   //");
System.out.println("      /\\ \\ \\ \\/_______/    _/____\\/:\\:\\:/_____ / / /\\ \\/ /\\ \\///___/ /___//___");
System.out.println("_____/___ \\ \\/_______/    /\\::::::\\\\:\\:/_____ / \\ /::\\  /::\\ /____  ____  ____");
System.out.println("         \\ \\/_______/    /:\\\\::::::\\\\:/_____ /   \\\\::/  \\::///   / /   / /   /");
System.out.println("          \\/_______/    /:\\:\\\\______\\/______/_____\\\\/ /\\ \\///___/ /___/ /_____");
System.out.println("\\          \\______/    /:\\:\\:/_____:/\\      \\ ___ /  /::\\ /____  ____  _/\\::::");
System.out.println("\\\\__________\\____/    /:\\:\\:/_____:/:\\\\      \\__ /_______/____/_/___/_ /  \\:::");
System.out.println("//__________/___/   _/____:/_____:/:\\:\\\\______\\ /                     /\\  /\\::");
System.out.println("///\\          \\/   /\\ .----.\\___:/:\\:\\:/_____ // \\                   /  \\/  \\:");
System.out.println("///\\\\          \\  /::\\\\ \\_\\ \\\\_:/:\\:\\:/_____ //:\\ \\                 /\\  /\\  /\\");
System.out.println("//:/\\\\          \\//\\::\\\\ \\ \\ \\\\/:\\:\\:/_____ //:::\\ \\               /  \\/  \\/+/");
System.out.println("/:/:/\\\\_________/:\\/:::\\`----' \\\\:\\:/_____ //o:/\\:\\ \\_____________/\\  /\\  / /");
System.out.println(":/:/://________//\\::/\\::\\_______\\\\:/_____ ///\\_\\ \\:\\/____________/  \\/  \\/+/\\");
System.out.println("/:/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/_____ ///\\//\\\\/:/ _____  ____/\\  /\\  / /  \\");
System.out.println(":/:///_/_/_/_//\\::/\\:\\///_/ /_//:/______/_/ :~\\/::/ /____/ /___/  \\/  \\/+/\\  /");
System.out.println("/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\  / \\\\:\\/:/ _____  ____/\\  /\\  / /  \\/");
System.out.println(":///_/_/_/_//\\::/\\:\\///_/ /_//:/____/\\:\\____\\\\::/ /____/ /___/  \\/  \\/+/\\  /\\");
System.out.println("///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\:\\/____/\\\\/____________/\\  /\\  / /  \\/  \\");
System.out.println("//_/_/_/_//\\::/\\:\\///_/ /_//::::::/\\:\\/____/  /----/----/--/  \\/  \\/+/\\  /\\  /");
System.out.println("/_/_/_/_/:\\/::\\ \\:/__  __ /\\:::::/\\:\\/____/ \\/____/____/__/\\  /\\  / /  \\/  \\/_");
System.out.println("_/_/_/_//\\::/\\:\\///_/ /_//\\:\\::::\\:\\/____/ \\_____________/  \\/  \\/+/\\  /\\  /");
System.out.println("/_/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\::::\\/____/   \\ _ _ _ _ _ /\\  /\\  / /  \\/  \\/___");
System.out.println("_/_/_//\\::/\\:\\///_/ /_//\\:\\:\\:\\              \\_________/  \\/  \\/+/\\  /\\  /   /");
System.out.println("/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\:\\:\\______________\\       /\\  /\\  / /  \\/  \\/___/_");
System.out.println("_/_//\\::/\\:\\///_/ /_//::\\:\\:\\:\\/______________/      /  \\/  \\/+/\\  /\\  /   /");
System.out.println("/_/:\\/::\\ \\:/__  __ /::::\\:\\:\\/______________/\\     /\\  /\\  / /  \\/  \\/___/___");
System.out.println("_//\\::/\\:\\///_/ /_//:\\::::\\:\\/______________/  \\   /  \\/  \\/+/\\  /\\  /   /   /");
System.out.println("/:\\/::\\ \\:/__  __ /:\\:\\::::\\/______________/    \\ /\\  /\\  / /  \\/  \\/___/___/");
System.out.println("/\\::/\\:\\///_/ /_//:\\:\\:\\                         \\  \\/\\\\\\/+/\\  /\\  /   /   /+/");
System.out.println("\\/::\\ \\:/__  __ /:\\:\\:\\:\\_________________________\\ ///\\\\\\/  \\/  \\/___/___/ /_");
System.out.println("::/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________////::\\\\\\  /\\  /   /   /+/");
System.out.println("::\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:\\/____\\\\\\/  \\/___/___/ /___");
System.out.println("/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________/:::\\    /\\/\\  /   /   /+/   /");
System.out.println("\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:::::\\  ///  \\/___/___/ /___/_");
System.out.println(":\\///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::::\\///\\  /   /  __________");
System.out.println("\\:/__  __ /:\\:\\:\\:\\/_________________________/:::\\:::::\\/  \\/___/__/\\");
System.out.println("///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::\\:::::\\  /   /  /::\\");
System.out.println("/__  __ /\\::\\:\\:\\/_________________________/_____::\\:::::\\/___/__/:/\\:\\");
System.out.println("/_/ /_//::\\::\\:\\/_____________________/\\/_/_/_/_/\\  \\           /::\\ \\:\\");
System.out.println("_  __ /:\\::\\:8\\/_____________________/\\/\\   /\\_\\\\/\\  \\ 8       /:/\\:\\ \\:\\");
System.out.println("/ /_//\\     \\|______________________//\\\\/\\::\\/__\\\\/\\  \\|______/::\\ \\:\\ \\:\\");
System.out.println(" __ /  \\  \\                        /:\\/:\\/\\_______\\/\\        /:/\\:\\ \\:\\/::\\");
System.out.println("/_//    8      -8  --  --  --  -- //\\::/\\\\/_/_/_/_/_/ --  --/::\\ \\:\\ \\::/\\:\\");
System.out.println("_ /     |\\  \\   |________________/:\\/::\\///__/ /__//_______/:/\\:\\ \\:\\/::\\ \\:\\");
System.out.println("__________\\     \\               //\\::/\\:/___  ___ /       /::\\ \\:\\ \\::/\\:\\ \\:\\");
System.out.println("::::::::::\\\\  \\  \\             /:\\/::\\///__/ /__//       /:/\\:\\ \\:\\/::\\ \\:\\ \\:");
	
	}
	
	public void success(){

		System.out.println("    _____.___.               __      __.__          ");
		System.out.println("    \\__  |   | ____  __ __  /  \\    /  \\__| ____         ");
		System.out.println("     /   |   |/  _ \\|  |  \\ \\   \\/\\/   /  |/    \\     ");
		System.out.println("     \\____   (  <_> )  |  /  \\        /|  |   |  \\       ");
		System.out.println("     / ______|\\____/|____/    \\__/\\  / |__|___|  /       ");
		System.out.println("     \\/                            \\/          \\/        ");
	
		printSlow("Congratulations "+user+". You beat the game!",50);
		char answer;
		int x =0;
		do {
			if(x>0)
				printSlow("Invalid Input.",30);

			answer = IBIO.inputChar("Do you want to play again? (y/n) ");
			x++;
		}
		while (!(isValid(answer,"yYnN")));
		if (answer == 'y' || answer == 'Y')
		{
			printSlow("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",1005);

			stage1();

		}
		else
		{
			printSlow(" Goodbye!",30);
			System.exit(0);

		}
	}

	public void computers (){
System.out.println("        ____________                                                                                                ");
System.out.println("     __/ ///////// /|                                                                                               ");
System.out.println("    /              ¯/|                                                                                              ");
System.out.println("   /_______________/ |                                                                                              ");
System.out.println("________________      |  __________  |  |                                                   ");
System.out.println("/               /|     | |          | |  |                                                  ");
System.out.println("/               / |     | |  Hacks   | |  |                                                 ");
System.out.println("/_______________/  |/\\   | |          | |  |                                               ");
System.out.println("(_______________(   |  \\  | |__________| | /                                               ");
System.out.println("(_______________(   |   \\ |______________|/ ___/\\                                 ");
System.out.println("(_______________(  /     |____>______<_____/     \\                                 ");
System.out.println("(_______________( /     / = ==== ==== ==== /|    _|_                                ");
System.out.println("(   RISC PC 600 (/     / ========= === ===/ /   ////                                ");
System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯      /     / ========= === ===/ /   /  /                    ");

	}
	public void gameOver(){

		System.out.println("    ________                        ________                     ");
		System.out.println(" /  _____/_____    _____   ____   \\_____  \\___  __ ___________ ");
		System.out.println("/   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\");
		System.out.println("\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/");
		System.out.println(" \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   ");
		System.out.println("        \\/     \\/      \\/     \\/          \\/          \\/         ");
		//prints score
		System.out.println("\n\nNice try "+user + " your score is " +score);
		char answer;
		int x =0;
		do {
			if(x>0)
				printSlow("Invalid Input.",30);

			answer = IBIO.inputChar("Do you want to play again? (y/n) ");
			x++;
		}
		while (!(isValid(answer,"yYnN")));
		if (answer == 'y' || answer == 'Y')
		{
			printSlow("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",1005);

			stage1();

		}
		else
		{
			printSlow(" Goodbye!",30);
			System.exit(0);

		}

	}
}

