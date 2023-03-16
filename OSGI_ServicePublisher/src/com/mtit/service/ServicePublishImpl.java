package com.mtit.service;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{
	
	//GAME SCORE FOR THE PLAYER
Scanner sc = new Scanner(System.in);
	
	BasketballPlayer player;
	String name;
	boolean doAgain;
	int calculator;
	
	@Override
	public void printBasketballTitle() {
		 System.out.print("LOGIN TO THE SYSTEM ");
		
		 Scanner input = new Scanner(System.in);
	        String username, password;
	        
	        do {
	            System.out.print("Enter username: ");
	            username = input.nextLine();
	            
	            System.out.print("Enter password: ");
	            password = input.nextLine();
	            
	            if (username.equals("admin") && password.equals("123")) {
	            	System.out.println("");
	            	System.out.println("");   
	            	System.out.println("");
	            	System.out.println("");   
	                System.out.println("");
	                System.out.println("");	         
	                System.out.println("");
	                System.out.println("");
	                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        		System.out.println("+++                                                                     +++");
	        		System.out.println("+++                       Login successful!                             +++");
	        		System.out.println("+++                                                                     +++");
	        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	                System.out.println("");
	                break;
	            } else {
	                System.out.println("Incorrect username or password. Please try again.");
	            }
	        } while (true);
	        

		    System.out.println("================================================================================================");
		    System.out.println("================================================================================================");
		    System.out.println("================================================================================================");
			System.out.println("                                                                                             ===");
			System.out.println("                                                                                             ===");
		 	System.out.println(" BBBBB     AAA     SSSSSSS  K     K  EEEEEEE TTTTTTTTT  BBBBBB    AAAAA    L        L        ===");
	        System.out.println(" B    B   A   A   S         K   K    E          T       B     B   A    A   L        L        ===");
	        System.out.println(" B    B  A     A  S         K K      E          T       B     B  A      A  L        L        ===");
	        System.out.println(" BBBBB   AAAAAAA  SSSSSSSS  K        EEEEE      T       BBBBBB   AAAAAAAA  L        L        ===");
	        System.out.println(" B    B  A     A         S  K K      E          T       B     B  A      A  L        L        ===");
	        System.out.println(" B    B  A     A         S  K   K    E          T       B     B  A      A  L        L        ===");
	        System.out.println(" BBBBB   A     A  SSSSSSS   K     K  EEEEEEE    T       BBBBBB   A      A  LLLLLL   LLLLLL   ===");
	        System.out.println("                                                                                             ===");
	        System.out.println("                                                                                             ===");
	        System.out.println("================================================================================================");
	        System.out.println("================================================================================================");
	        System.out.println("================================================================================================");
	        System.out.println("");
	        System.out.println("Do you want to calculate The statistic for PLAYER OR TEAM ? ");
	        System.out.println("");
	        System.out.println("  O   		             / " +"  "+ "  O    O    O    O    O  " );
	        System.out.println(" /|\\ 		            /  " +"  "+ " /|\\\\ /|\\\\ /|\\\\ /|\\\\ /|\\\\ ");
	        System.out.println("  |   		           /   " +"  " +"  |    |    |    |    |  ");
	        System.out.println(" / \\ 		          /"     +"  " +"     / \\\\ / \\\\ / \\\\ / \\\\ / \\\\ ");
	        System.out.println("      		         / "     +"  " +"                           " );
	        System.out.println(" ONE PERSON (PRESS 1)   /	   TEAM (PRESS 2)");
	        System.out.println("    		");
	        System.out.println("");
	        System.out.println("");
	}
	
	@Override
	public void printBasketballDescr() {
		
		System.out.println("");
		System.out.println("CALCULATION FORMULA");
		System.out.println("GS = P + 0.4 * FG - 0.7 * FGA - 0.4 * (FTA - FT) + 0.7 * OR + 0.3 * DR + S + 0.7 * A + 0.7 * B - 0.4 * PF - T");
		System.out.println("Points scored ");
		System.out.println("Field goals made");
		System.out.println("Free throws scored");
		System.out.println("");
		System.out.println();
		System.out.println("==============CHOOSE YOUR CALCULATOR=================");
		System.out.println("|  1. Calculate Basketball EFG Performance          |");
		System.out.println("|  2. Calculate Basketball Game Score               |");
		System.out.println("|  3. Calculate Basketball True Shooting Percentage |");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("");
	}
	@Override
	public void selectCalculator() {
		System.out.println("Select calculator from above :");
		calculator = sc.nextInt();
		if(calculator == 1) {
			
			System.out.println("You selected EFG Performance Calculator ");
		
		}
		else if(calculator == 2) {
			System.out.println("You selected Game Score Calculator – Basketball");
			
		}
		else if(calculator ==3) {
			System.out.println("You selected TS Calculator (True Shooting Percentage)");
			
		}else {
			System.out.println("Wrong input!");
		}
	}
	@Override
	public void getPlayerDetails() {
		
		player = new BasketballPlayer();
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("********** Player Details ****************");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("*********************************************************************");
		
		System.out.println("Enter name :");
		player.setName(sc.next());
		
		System.out.println("Enter age :");
		player.setAge(sc.nextInt());
		
		System.out.println("Enter height in meters :");
		player.setHeight(sc.nextDouble());
		
		System.out.println("Enter weight in kg :");
		player.setWeight(sc.nextDouble());
		
		double fitness;
		
		fitness = player.getWeight() / ( player.getHeight() * player.getHeight());
		
		System.out.println("Your fitness level is: " + fitness);
		
		if(fitness < 18.5 || fitness > 25) {
			System.out.println("Your health is not good");
			System.out.println("please contact your personal doctor");
		}
		else {
			System.out.println("Your health is in Healthy level");
			System.out.println("please contact your personal doctor");
		}
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("\n\n\n");
	}
	
	@Override
	public void getBasketballData() {
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("   -------------------------------------------------");
		System.out.println("********** Player Basketball Performance ****************");
		System.out.println("   --------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("*********************************************************************");
		
		System.out.print("Enter field Goals: ");
		player.setFieldGoals(sc.nextInt());
		
		System.out.print("Enter field Goal Attempts: ");
		player.setFieldGoalAttempts(sc.nextInt());
		
		System.out.print("Enter Point Scored: ");
		player.setPointScored(sc.nextInt());
		
		System.out.print("Enter free Throws: ");
		player.setFreeThrows(sc.nextInt());
		
		System.out.print("Enter free Throw Attemps: ");
		player.setFreeThrowAttemps(sc.nextInt());
		
		System.out.print("Enter assiste: ");
		player.setAssiste(sc.nextInt());
		
		System.out.print("Enter blocks: ");
		player.setBlocks(sc.nextInt());
		
		System.out.print("Enter steals: ");
		player.setSteals(sc.nextInt());
		
		System.out.print("Enter turnovers: ");
		player.setTurnovers(sc.nextInt());
		
		System.out.print("Enter defensiveRebounds: ");
		player.setDefensiveRebounds(sc.nextInt());
		
		System.out.print("Enter personalFouls: ");
		player.setPersonalFouls(sc.nextInt());
		
		System.out.print("Enter OffensiveRebounds: ");
		player.setOffensiveRebounds(sc.nextInt());
		;
	}
	@Override
	public void calculateStatistics() {
		player.calculateStatistics();
	}
	@Override
	public void displayResults() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++                                                               +++");
		System.out.println("+++                       Basketball Player details               +++");
		System.out.println("+++                                                               +++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("Player age is :"+player.getAge());
		System.out.println("Player height is :"+player.getHeight());
		System.out.println("Player weight is :"+player.getWeight());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++                                                               +++");
		System.out.println("+++                       Basketball Statistics                     +++");
		System.out.println("+++                                                               +++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println(" Player Name: "+player.getName());
		System.out.println("");
		System.out.println("Offensive Rebounds: "+player.getOffensiveRebounds());
		System.out.println("Field Goals: "+player.getFieldGoals());
		System.out.println("Field Goal Attempts: "+player.getFieldGoalAttempts());
		System.out.println("Point Scored: "+player.getPointScored());
		System.out.println("Free Throws: "+player.getFreeThrows());
		System.out.println("Free Throw Attemps: "+player.getFreeThrowAttemps());
		System.out.println("Assiste: "+player.getAssiste());
		System.out.println("Blocks: "+player.getBlocks());
		System.out.println("Steals: "+player.getSteals());
		System.out.println("Turnovers: "+player.getTurnovers());
		System.out.println("Defensive Rebounds: "+player.getDefensiveRebounds());
		System.out.println("Personal Fouls: "+player.getPersonalFouls());
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
		System.out.println("\n\n\n\n\n");	
	
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		double average = 0;
		
		String ef = decimalFormat.format(player.geteFGCalc());
		String gp = decimalFormat.format(player.getGamePerformcCalc());
		String ts = decimalFormat.format(player.getTrueShootingPercentageCalc());
		String av = decimalFormat.format(average);
	
		average = (player.geteFGCalc() + player.getGamePerformcCalc() + player.getTrueShootingPercentageCalc())/3;
	
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                                                                  ");
		System.out.println("                          SUMMARY                                 ");
		System.out.println("                                                                  ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+---------+---------------------+-------------------------------+-------------------+");
		System.out.println("| eFGCalc |  GamePerformcCalc   |  TrueShootingPercentageCalc   |  Average          |");
		System.out.println("+---------+---------------------+-------------------------------+-------------------+");
		System.out.println("|"+  ef + "%"     +"   | "+ gp             +"               |"+ ts                        +"                          |" +  average  +" |");
		System.out.println("|         |                     |                               |                   |");
		System.out.println("+---------+---------------------+-------------------------------+-------------------+");
		System.out.println("");
		System.out.println(" o eFGCalc: "+player.geteFGCalc() + "%");
		System.out.println(" o GamePerformcCalc: "+player.getGamePerformcCalc());
		System.out.println(" o TrueShootingPercentageCalc: "+player.getTrueShootingPercentageCalc());
		System.out.println("");
	}
}
  