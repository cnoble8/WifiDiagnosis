/*This program is intended to walk someone through the steps of possibly restoring their WiFi connection*/

import java.util.Scanner; //needed to use Scanner class

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		String input;
		String upperInput;
		String invalidStatement = " Invalid Input. Please restart the program and enter a valid response.";
		String successStatement = " That is great!";
		String question = "Did this fix the issue?";
		String question2 = "Please enter Y for yes, or N for no.\n";
		char answer;
		
		Scanner keyboard = new Scanner(System.in); // creates scanner object
		
		System.out.println("Are you having difficulty connecting to your internet?");
		System.out.println();
		System.out.println(question2);
		
		input = keyboard.nextLine();
		upperInput = input.toUpperCase();
		answer = upperInput.charAt(0);
		
		if (answer == 'Y') {
			System.out.println("Refresh your Wifi connection.");
			System.out.println();
			System.out.println(question);
			System.out.println(question2);
			
			input = keyboard.nextLine();
			upperInput = input.toUpperCase();
			answer = upperInput.charAt(0);
			
				if (answer == 'Y') 
				{
					System.out.println(successStatement);
					System.exit(0);
			    }
				else if (answer == 'N') 
				{
					System.out.println("Unplug and replug your modem.");
					System.out.println();
					System.out.println(question);
					System.out.println(question2);
				
					input = keyboard.nextLine();
					upperInput = input.toUpperCase();
					answer = upperInput.charAt(0);
					
						if (answer == 'Y') 
						{
							System.out.println(successStatement);
						}
						else if (answer == 'N') 
						{
								System.out.println("Make sure the cables to your router are plugged in firmly and your router is getting power.");
								System.out.println();
								System.out.println(question);
								System.out.println(question2);
					
								input = keyboard.nextLine();
								upperInput = input.toUpperCase();
								answer = upperInput.charAt(0);
					
								if (answer == 'Y') 
								{
									System.out.println(successStatement);
									System.exit(0);
								}
								else if (answer == 'N') 
								{
									System.out.println("Move your computer closer to your router.");
									System.out.println();
									System.out.println(question);
									System.out.println(question2);
						
									input = keyboard.nextLine();
									upperInput = input.toUpperCase();
									answer = upperInput.charAt(0);
									
										if (answer == 'Y') 
										{
											System.out.println(successStatement);
											System.exit(0); 
										}
										else if (answer == 'N') 
										{
											System.out.println("Please contact your internet service provider. Make sure your ISP is hooked up to your router.");
											System.exit(0); 
										}
										else 
										{
											System.out.println(invalidStatement);
											System.exit(0); 
										}
								
								}
							else 
							{
								System.out.println(invalidStatement);
								System.exit(0); 
							}
						
					}
				else 
				{
					System.out.println(invalidStatement);
					System.exit(0);
				}
					
				}
			else 
			{
				System.out.println(invalidStatement);
				System.exit(0);
			}
				
			}
		else if (answer == 'N') 
		{
			System.out.println(successStatement);
			System.exit(0);
		}
		else 
		{
			System.out.println(invalidStatement);
			System.exit(0);
		}
	}

   }
