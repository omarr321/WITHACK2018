package gameDemo;

import java.util.Scanner;

public class Spash {
	public static void start(Scanner in) {
		Tutorial.clearScreen();
		/*
		 *   ______  _______ _______ _______    _      ________________        ________________ _______ _______ _______ 
			(  __  \(  ____ (  ____ (  ____ )  ( (    /\__   __(  ____ \\     /\__   __(       |  ___  |  ____ |  ____ \
			| (  \  ) (    \/ (    \/ (    )|  |  \  ( |  ) (  | (    \/ )   ( |  ) (  | () () | (   ) | (    )| (    \/
			| |   ) | (__   | (__   | (____)|  |   \ | |  | |  | |     | (___) |  | |  | || || | (___) | (____)| (__    
			| |   | |  __)  |  __)  |  _____)  | (\ \) |  | |  | | ____|  ___  |  | |  | |(_)| |  ___  |     __)  __)   
			| |   ) | (     | (     | (        | | \   |  | |  | | \_  ) (   ) |  | |  | |   | | (   ) | (\ (  | (      
			| (__/  ) (____/\ (____/\ )        | )  \  |__) (__| (___) | )   ( |  | |  | )   ( | )   ( | ) \ \_| (____/\
			(______/(_______(_______//         |/    )_)_______(_______)/     \|  )_(  |/     \|/     \|/   \__(_______/
		 */
		Tutorial.slowTextLine(" ______  _______ _______ _______    _      ________________        ________________ _______ _______ _______");
		Tutorial.slowTextLine("(  __  \\(  ____ (  ____ (  ____ )  ( (    /\\__   __(  ____ \\\\     /\\__   __(       |  ___  |  ____ |  ____ \\");
		Tutorial.slowTextLine("| (  \\  ) (    \\/ (    \\/ (    )|  |  \\  ( |  ) (  | (    \\/ )   ( |  ) (  | () () | (   ) | (    )| (    \\/");
		Tutorial.slowTextLine("| |   ) | (__   | (__   | (____)|  |   \\ | |  | |  | |     | (___) |  | |  | || || | (___) | (____)| (__");
		Tutorial.slowTextLine("| |   | |  __)  |  __)  |  _____)  | (\\ \\) |  | |  | | ____|  ___  |  | |  | |(_)| |  ___  |     __)  __)");
		Tutorial.slowTextLine("| |   ) | (     | (     | (        | | \\   |  | |  | | \\_  ) (   ) |  | |  | |   | | (   ) | (\\ (  | (");
		Tutorial.slowTextLine("| (__/  ) (____/\\ (____/\\ )        | )  \\  |__) (__| (___) | )   ( |  | |  | )   ( | )   ( | ) \\ \\_| (____/\\");
		Tutorial.slowTextLine("(______/(_______(_______//         |/    )_)_______(_______)/     \\|  )_(  |/     \\|/     \\|/   \\__(_______/");
		Tutorial.slowText("By: Team Name Team Name Blue");
		System.out.println();
		Tutorial.slowText("Type anything to continue...");
		Tutorial.slowText("(You can type end any time during the program)");
		Tutorial.slowText("(to end the program.)");
		Tutorial.slowTextN(">");
		if(in.nextLine().equals("end")) {
			System.exit(0);
		}
		Tutorial.clearScreen();
	}
}