package gameDemo;

import java.util.Scanner;

public class Tutorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		clearScreen();
		boolean[] items = new boolean[4];
		for (int i = 0; i < items.length; i++) {
			items[i] = false;
		}
		items[3] = false;
		Spash.start(input);

		while (items[3] == false) {
			tutorialShack(input, items);
			village(input, items);
			bossHouse(input, items);
			bossFight(input, items);
		}
		input.close();
	}

	public static void tutorialShack(Scanner input, boolean[] items) {
		slowText("You awake on the floor of a damaged shack. The walls looked to have suffered");
		slowText("damage from a recent storm. You are unaware of where you are or where you came");
		slowText("from. You see a wooden door that has a rather large hole in it that is the only");
		slowText("source of light and a cupboard that has fallen onto its side.");
		sleep(4);
		while (true) {
			System.out.println();
			if (items[0] == true) {
				slowText("What would you like to do?");
				slowText("(leave)");
				slowTextN(">");
			} else {
				slowText("What would you like to do?");
				slowText("(leave, search the cupboard)");
				slowTextN(">");
			}
			String in = input.nextLine();
			in = in.toLowerCase();

			if (in.equals("leave")) {
				slowText("The door moves to the side with an eery creek. Wherever you are, it looks deserted!");
				sleep(2);
				break;
			} else if (in.equals("search the cupboard")) {
				slowText("You search the cupboard but to your surprise, you found a key. It's labelecd \"House 3\"");
				System.out.println();
				slowText("You picked up the key and added it to your items");
				items[0] = true;
				sleep(2);
			} else if (in.equals("end")) {
				System.exit(0);
			} else {
				slowText("Not a valid input, try again.");
				sleep(2);
			}
		}
	}

	public static void village(Scanner s, boolean[] items) {

		// initial description
		slowText("You look around and see a burnt desolate village. The sky is dark");
		slowText("without a moon or stars except for a single red beam that pierces");
		slowText("the sky. You feel the desire to move towards the light in every");
		slowText("inch of your body but you know you shouldn't.");

		// asks for initial action
		while (true) {
			System.out.println();
			slowText("What do you do in this village?");
			slowText("(look around the houses, go towards the light)");
			slowTextN(">");
			String action = s.nextLine();

			// to make sure any random capitalizations still work but making everything
			// lowercase and only looking for lowercase
			action = action.toLowerCase();
			if (action.equals("look around the houses")) {
				slowText("You ignore you desire to go towards the light and move toward the houses");
				int[] house = { 1, 1, 1 };
				houses(s, house, items);
				break;
			}
			// action to just quickly progress through game
			else if (action.equals("go towards the light")) {
				slowText("Your body walks toward the house where the origin of the light is.");
				sleep(2);
				return;
			} else if (action.equals("end")) {
				System.exit(0);

			} else {
				slowText("Not a valid input, try again.");
			}
		}
	}

	public static void houses(Scanner s, int[] a, boolean[] items) {
		String houseNum1 = "house 1, ";
		String houseNum2 = "house 2, ";
		String houseNum3 = "house 3, ";
		// what the options that are possible;
//		String finalOptions = "";
		boolean choice1 = false;
		boolean choice2 = false;
		boolean choice3 = false;

		if (a[0] == 0) {
			choice1 = true;
			houseNum1 = "";
		}
		if (a[1] == 0) {
			choice2 = true;
			houseNum2 = "";
		}
		if (a[2] == 0) {
			choice3 = true;
			houseNum3 = "";
		}
		// to makes sure the inputed options is correction. The loop will only end with
		// a return
		while (true) {
			System.out.println();
			slowText("Where do you want to go?");
			slowText("(" + houseNum1 + houseNum2 + houseNum3 + "go towards the light)");
			slowTextN(">");
			// gives user the options to chose
			String choice = s.nextLine();
			choice = choice.toLowerCase();
			// first house
			if (choice.equals("house 1")) {
				if (choice1 == true) {
					slowText("The house is no more!");
					houseNum1 = "";
				} else {
					slowText("You move towards the remnants of the house and see a door without a handle.");
					slowText("You push the door but it immediately falls towards the ground.");
					slowText("What can be seen is the stairs to the upper floor, almost completely destroyed");
					slowText("There is only one piece of furniture left, a cabinet, barely stable, with its");
					slowText("doors ajar.");
					// to makes sure the inputed options is correction. The loop will only end with
					// a return
					while (true) {
						System.out.println();
						while (true) {
							slowText("What do you want to do?");
							slowText("(look inside the cabinet)");
							slowTextN(">");
							String newChoice = s.nextLine();
							newChoice = newChoice.toLowerCase();

							if (newChoice.equals("look inside the cabinet")) {
								slowText(
										"You peer into the cabinet and see an object. A single doll. One that is strangely familiar.");
								slowText("The cabinet falls apart but not before something in your mind stirs.");
								while (true) {
									System.out.println();

									slowText("What do you want to do?");
									slowText("(remember, leave)");
									slowTextN(">");
									newChoice = s.nextLine();
									newChoice = newChoice.toLowerCase();

									if (newChoice.equals("remember")) {
										slowText("Within your mind a memory suddenly bursts forth");
										slowText(
												"The world is so cruel. Before I knew it, everything ended as the sun turned black and everything around");
										slowText(
												"me turned to ashes. I lost everything, my family, my friends, and my daughter. Everything disappeared");
										slowText(
												"as soon as the eternal night fell. When your mind returns to its senses, you notice the house around");
										slowText("you was gone, as if it was never there");
										a[0] = 0;
										houses(s, a, items);
										return;
									} else if (newChoice.equals("end")) {
										System.exit(0);
									} else if (newChoice.equals("leave")) {
										slowText(
												"As you leave, you turn around and notice the house is gone, as if it was never there");
										a[0] = 0;
										houses(s, a, items);
										return;
									} else {
										slowText("That is not a valid action");
									}
								}
							} // the following else-if statement immediately ends the ENTIRE program
							else if (newChoice.equals("end")) {
								System.exit(0);
							} else {
								slowText("That is not a valid action");
							}
						}
					}
				}
			} else if (choice.equals("house 2")) {
				if (choice2 == true) {
					slowText("The house is no more!");
					houseNum2 = "";
				} else {
					slowText("You head towards the second house. The house looks better than the other three despite");
					slowText("being burnt and on its last legs. You open the door and with a creek, it moves.");
					slowText(
							"Inside, the place is devastated, with broken wood everywhere except the item in the middle");
					while (true) {
						System.out.println();
						slowText("What do you want do?");
						slowText("(inspect object)");
						slowTextN(">");
						// what the user chooses as an
						String anotherChoice = s.nextLine();
						anotherChoice = anotherChoice.toLowerCase();
						// looks inside the cabinate
						if (anotherChoice.equals("inspect object")) {
							slowText("On the rug, there is a single piece of paper.");
							while (true) {
								System.out.println();
								slowText("What do you want to do?");
								slowText("(read it, leave)");
								slowTextN(">");
								anotherChoice = s.nextLine();
								anotherChoice = anotherChoice.toLowerCase();

								// checks and makes sure all of the possible options are done. Will continue
								// until a valid choice and path is done with a return

								if (anotherChoice.equals("read it")) {
									slowText("The paper almost completely burnt and you can only read a few word.");
									slowText("It reads: \"hope is dead\"");
									slowText(
											"When you finish a fire bursts forth and you quickly exit the house. By the time you");
									slowText("look back, all that’s left is the newly made ashes of the house");
									a[1] = 0;
									houses(s, a, items);
									return;
								} else if (anotherChoice.equals("leave")) {
									slowText("As you leave, a fire bursts forth and you quickly exit the house");
									slowText(
											"When you look back, all that’s left is the newly made ashes of the house");
									a[1] = 0;
									houses(s, a, items);
									return;
								} // the following else-if statement immediately ends the ENTIRE program
								else if (anotherChoice.equals("end")) {
									System.exit(0);
								} else {
									slowText("That is not a valid action");
								}
							}
						} else {
							slowText("That is not a valid action");
						}
					}
				}
			} else if (choice.equals("house 3")) {
				if (choice3 == true) {
					slowText("The house is no more!");
					houseNum3 = "";
				} else {
					slowText(
							"You head towards the third house. The house is smallest out of all the others as well as");
					slowText("the most damaged. It is consisting of a single room. Various");
					slowText("parts of the falls are broken and there is barely a roof on top of the house");
					slowText("You walk inside and immediately feel something watching you");
					while (true) {
						System.out.println();
						slowText("What do you do?");
						slowText("(run, talk, look around)");
						slowTextN(">");
						String anotherChoice = s.nextLine();
						anotherChoice = anotherChoice.toLowerCase();
						if (anotherChoice.equals("run")) {
							slowText(
									"You leave the house and once you do a shadowy hand burst forth from the ground crushing");
							slowText(
									"the house immediately. The hand quickly disappears and the broken fragements fall to");
							slowText("the ground when it does");
							a[2] = 0;
							houses(s, a, items);
							return;
						} else if (anotherChoice.equals("talk")) {
							slowText("You yell out: Who’s there!");
							slowText("A strange shadow formed in the center of the house. \"leave\" he says");
							slowText("You repeat \"Who are you?\"");
							slowText("\"I am the broken, one who's hope was shattered by HIM\"");
							slowText("\"by who?\" you ask");
							slowText(
									"\"He who-\" a sudden rumble cuts off the shadows voice \"it's useless, hope doesn't exist\"");
							slowText(
									"You try to speak but the rumble returned but with greater force. Furthermore, a great terror");
							slowText(
									"strikes you as you feel a great presence. You are unable to control your body. Against you");
							slowText(
									"commands, your body runs out of the house as quickly as possible. Once you leave the house a");
							slowText(
									"shadowy hand burst forth from the ground crushing the house immediately. The hand quickly");
							slowText("disappears and the broken fragments fall to the ground when it does");
							a[2] = 0;
							houses(s, a, items);
							return;
						} else if (anotherChoice.equals("end")) {
							System.exit(1);
						} else if (anotherChoice.equals("look around")) {
							slowText(
									"You look around and notice a wooden trap door on the floor. You walk uo and try to open it");
							slowText("but it is locked.");
							if (items[0] == true) {
								boolean read = false;
								slowText(
										"You unlock the trap door with your key you found and you go down. The room is almost");
								slowText("in pristine condition. You see a desk with a letter on it.");
								slowText("What do you want to do.");
								if (read == false) {
									slowText("(read letter, [locked])");
								} else {
									slowText("(read letter, search desk)");
								}
								slowTextN(">");
								anotherChoice = s.nextLine();
								anotherChoice = anotherChoice.toLowerCase();
								switch (anotherChoice) {
								case "read letter":
									slowText("You read the letter, or whats left of it at least:");
									slowText("To ... powerful amulet ... you need it ... in desk");
									slowText("That is all you can make out.");
									read = true;
									break;
								case "search desk":
									slowText(
											"You search the desk and find the amulet of health. This amulet will give you");
									slowText("plus 200% health.");
									slowText("you put on the amulet and go back");
									items[1] = true;
									break;
								default:
									slowText("Not a vaild input!");
								}
							}
						} else {
							slowText("That is not a valid action");
						}
					}
				}
			} // the following else-if statement immediately ends the ENTIRE program
			else if (choice.equals("go towards the light")) {
				slowText("You head towards the origin of the red beam in the sky");
				return;
			} else if (choice.equals("end")) {
				System.exit(1);
			} else {
				slowText("That is not a valid action");
			}
		}
	}

	public static void bossHouse(Scanner input, boolean[] items) {
		boolean opened = false;
		String in;
		System.out.println();
		slowText("You approach the building with the red beam shooting towards the sky.");
		sleep(2);

		while (true) {
			if (opened == false) {
				System.out.println();
				slowText("What do you want do?");
				slowText("(Look around, open door, [locked])");
				slowTextN(">");
			} else {
				System.out.println();
				slowText("What do you want do?");
				slowText("(Look around, open door, enter)");
				slowTextN(">");
			}

			in = input.nextLine();
			in = in.toLowerCase();

			if (in.equals("look around")) {
				slowText(
						"You look around and notice the building is in better shape then the others and it seem out of place. There");
				slowText(
						"is a huge bean of red light come through the top of the build. As you look at it, you feel scared and you");
				slowText("want to run but can't.");
				sleep(4);
			} else if (in.equals("open door")) {
				slowText("You grab the doorknob and slowly turn it.");
				sleep(1);
				slowText(
						"It opens with a bit of effort. The door screech like a hawk who has just found it's pray, and you are");
				slowText("blinded by red light. After shielding your eyes you can see inside.");
				opened = true;
				sleep(4);
			} else if (in.equals("enter")) {
				if (opened == false) {
					slowText("Not a valid input, try again.");
					sleep(2);
				} else {
					slowText("You cautiously walk through the door.");
					sleep(2);
					break;
				}
			} else if (in.equals("end")) {
				System.exit(0);
			} else {
				slowText("Not a valid input, try again.");
				sleep(2);
			}
		}

		System.out.println();
		slowText(
				"As you walk inside the house, you notice that the inside looks as nice as the outside. Simple wooden walls and clean wood floors.");
		slowText("Cleaned and maintained as a if nothing has ever happened inside.");
		System.out.println();
		slowText("This gives you greater fear rather than comfort");
		System.out.println();
		String searchDesk = "[locked], ";
		String seeDoor = "[locked]";
		boolean tryLeave = false;
		boolean didLeave = false;
		while (didLeave == false) {
			System.out.println();
			slowText("What will you do?");
			if (tryLeave == false) {
				slowText("(look around, " + searchDesk + seeDoor + ", leave)");
				slowTextN(">");
			} else {
				slowText("(look around, " + searchDesk + seeDoor + ")");
				slowTextN(">");
			}
			in = input.nextLine();
			in = in.toLowerCase();
			System.out.println();
			switch (in) {
			case "look around":
				slowText(
						"You look around not really noticing much beside a desk in the corner and a door directly across from you.");
				if (seeDoor == "[locked]") {
					seeDoor = "go through door";
				}
				if (searchDesk == "[locked], ") {
					searchDesk = "search desk, ";
				}
				break;
			case "leave":
				if (tryLeave == false) {
					slowText("As you turn around to leave, you see that the door is gone leaving only a plain wall.");
					tryLeave = true;
					break;
				} else {
					slowText("Not a valid input, try again.");
					break;
				}
			case "search desk":
				slowText("You search through the desk, not finding much but a letter.");
				searchDesk = "read letter, ";
				break;
			case "read letter":
				slowText("The letter is very old but you can make out some of it. What you can read goes as followed:");
				System.out.println();
				slowText("To whoever it would matter to,");
				System.out.println();
				slowText("        I have gone thought this over and over again but to no avail ... I keep dying ...");
				slowText("... keep waking back up ... looked further into ... found something ... We are in ...");
				slowText("... tried everything ... developed an item ... hidden it under the rug ...");
				slowText("... I hope you the best and I'll see you ...");
				System.out.println();
				slowText("Your truly, ...");
				System.out.println();
				slowText("That is all you can make out.");
				searchDesk = "lift rug, ";
				break;
			case "lift rug":
				slowText(
						"You lift the rug, or what’s left of it at least, and you see a wooden panel that been broken from age.");
				slowText("You open the panel and find a safe.");
				searchDesk = "open safe, ";
				break;
			case "open safe":
				slowText("The safe's latch has been rusted out from age and open relatively easily.");
				slowTextN("You look inside and find ");
				sleep(1);
				slowTextN(". ");
				sleep(1);
				slowTextN(". ");
				sleep(1);
				slowTextN(". ");
				sleep(1);
				slowText("an attack amulet. This amulet will increase your attack by 200%.");
				slowText("You put on the amulet.");
				items[2] = true;
				searchDesk = "";
				break;
			case "go through door":
				slowText("Are you sure? Once you go through there is no turning back.");
				slowText("(yes, no)");
				slowTextN(">");
				in = input.nextLine();
				in = in.toLowerCase();

				if (in.equals("yes")) {
					didLeave = true;
					break;
				} else if (in.equals("no")) {
					break;
				}
			case "end":
				System.exit(0);
			default:
				slowText("Not a valid input, try again.");
			}

			if (didLeave == true) {
				break;
			}
		}
		System.out.println();
		slowText("You walk through the door feeling a shiver as you walked through. Something did not seem");
		slowText("right. The door opened open into a room and you see someone, or something was there but what.");
		slowText("You approach the thing. It turns around and quickly slams you against the wall and you fall to");
		slowText("the ground. You get up and throw a broken wall bit at it. It turns around. You put your hands");
		slowText("and brace yourself for a battle of a lifetime.");
		sleep(2);
	}

	public static void bossFight(Scanner s, boolean[] items) {
		clearScreen();
		slowText("You have angered something you shouldn't have");
		if (items[1] == true) {
			slowText("You get a boost in health from wearing the Amulet of Health!");
		}
		if (items[2] == true) {
			slowText("You get a boost in attack from wearing the Amulet of Attack!");
		}

		int playerHealth;
		if (items[1] == false) {
			playerHealth = 250;
		} else {
			playerHealth = 500;
		}
		int bossHealth = 500;
		boolean bossDefend = false;
		boolean playerDefend = false;
		String bossHeal;
		String playerHeal;
		while (bossHealth > 0) {
			while (true) {
				bossHeal = Integer.toString(bossHealth);
				playerHeal = Integer.toString(playerHealth);
				System.out.println();
				slowText("Shub-Niggurath");
				slowText("He who guards the gate.");
				slowTextN(bossHeal);
				slowText("/500");

				System.out.println();
				System.out.println();
				System.out.println();

				slowText("You");
				slowText("He who is trying to survive.");
				slowTextN(playerHeal);
				if (items[1] == false) {
					slowText("/250");
				} else {
					slowText("/500");
				}
				System.out.println();
				slowText("What will you do?");
				slowText("(fight, items, defend)");
				slowTextN(">");
				String action = s.nextLine();
				action = action.toLowerCase();
				System.out.println();

				if (action.equals("fight")) {
					
					//Player Damage
					
					int damage = random(999, 999);
					if (items[2] == true) {
						damage = damage * 2;
					}
					String dam = "";

					if (bossDefend) {
						slowText("He was ready for your attack! (attack damage is cut in half)");
						damage /= 2;
						bossDefend = false;
					}
					dam = Integer.toString(damage);
					bossHealth -= damage;

					int dialogueOption = random(0, 2);
					if (dialogueOption == 0) {
						slowText("You deal damage to the enemy. You opponent seem angry.");
						System.out.println();
						slowTextN("You dealt ");
						slowTextN(dam);
						slowText(" damage!");
						System.out.println();
					} else if (dialogueOption == 1) {
						slowText("Your strike lands. Reality itself seems to stir.");
						System.out.println();
						slowTextN("You dealt ");
						slowTextN(dam);
						slowText(" damage!");
						System.out.println();
					} else if (dialogueOption == 2) {
						slowText("You fight back. You feel a chill, as if you did something you shouldn't have.");
						System.out.println();
						slowTextN("You dealt ");
						slowTextN(dam);
						slowText(" damage!");
						System.out.println();
					}
					break;
				} else if (action.equals("items")) {
					slowText("Items:");
					if (items[0] == true) {
						slowText("Key: The key is labeled with \"house 3\".");
					}
					if (items[1] == true) {
						slowText("Amulet of Heath: Increases your health by 200%.");
					}
					if (items[2] == true) {
						slowText("Amulet of Power: Increases you attack damage by 200%.");
					}
					if (items[0] == false && items[1] == false) {
						if (items[2] == false) {
							slowText("You have nothing.");
						}
					}
					break;
				} else if (action.equals("defend")) {
					if (random(1, 2) == 1) {
						slowText("You try to brace yourself but you are too weak.");
						break;
					} else {
						slowText("You brace yourself for the attack.");
						playerDefend = true;
						break;
					}
				} else if (action.equals("end")) {
					System.exit(0);
				} else if (action.equals("wake up")) {
					slowText("You twist and turn in your bed. Your eyes shoot open and you sit up in a cold sweat.");
					System.out.println();
					slowText("You go back to sleep.");
					sleep(2);
				} else {
					slowText("Not a valid input!");
					sleep(2);
				}
			}
			if (bossHealth > 0) {
				int bossAction = random(0, 2);
				int bossDam = random(1, 200);
				if (bossAction == 0 || bossAction == 1) {
					slowText("The enemy seeks to end you.");
					sleep(2);
					slowText("He lashes out against you");
					if (playerDefend == true) {
						slowText("You were ready! (damage is cut in half)");
						bossDam = bossDam / 2;
						playerDefend = false;
					}
					playerHealth = playerHealth - bossDam;
					playerHeal = Integer.toString(bossDam);

					slowText("You take " + playerHeal + " damage!");
				} else {
					slowText("He anticipates your next attack.");
					;
					bossDefend = true;
					sleep(2);
				}
				if (playerHealth <= 0) {
					sleep(2);
					System.out.println();
					slowText("You take a final hit landing on the ground, weak. You try to get up but can't.");
					slowText("You look up at the red beam one more time and die.");
					return;
				}
			}
		}
		slowText("You deliver the final blow.");
		slowText("!lufrewop erom raf gnieb era ereht tub em detaefed evah yam uoY");
		slowText("You enter the mysterious poral.");
		sleep(3);
		clearScreen();
		/*
		 * 
		 * _________          _______ 
		 \__   __/|\     /|(  ____ \
   			) (   | )   ( || (    \/
   			| |   | (___) || (__    
   			| |   |  ___  ||  __)   
   			| |   | (   ) || (      
   			| |   | )   ( || (____/\
   			)_(   |/     \|(_______/
                           
 			 _______  _        ______  
			(  ____ \( (    /|(  __  \ 
			| (    \/|  \  ( || (  \  )
			| (__    |   \ | || |   ) |
			|  __)   | (\ \) || |   | |
			| (      | | \   || |   ) |
			| (____/\| )  \  || (__/  )
			(_______/|/    )_)(______/ 
		 * 
		 */
		slowTextLine("_________          _______");
		slowTextLine("\\__   __/|\\     /|(  ____ \\");
		slowTextLine("   ) (   | )   ( || (    \\/");
		slowTextLine("   | |   | (___) || (__");
		slowTextLine("   | |   |  ___  ||  __)");
		slowTextLine("   | |   | (   ) || (");
		slowTextLine("   | |   | )   ( || (____/\\");
		slowTextLine("   )_(   |/     \\|(_______/");
		System.out.println();
		slowTextLine(" _______  _        ______");
		slowTextLine("(  ____ \\( (    /|(  __  \\");
		slowTextLine("| (    \\/|  \\  ( || (  \\  )");
		slowTextLine("| (__    |   \\ | || |   ) |");
		slowTextLine("|  __)   | (\\ \\) || |   | |");
		slowTextLine("| (      | | \\   || |   ) |");
		slowTextLine("| (____/\\| )  \\  || (__/  )");
		slowTextLine("(_______/|/    )_)(______/ ");
		sleep(2);
		System.out.println();
		slowText("Thank you for playing our demo!");
		sleep(3);
		items[3] = true;
	}

	public static void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println();
	}

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void slowText(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(45);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public static void fastText(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public static void slowTextN(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(45);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void slowTextLine(String text) {
		System.out.println(text);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}