package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			for (int i = 0; i < 20; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "ignore this lol", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"feed	", "water", "sunshine"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				feedPet();
			} else
			if (task == 1) {
				waterPet();
			} else
			if (task == 2) {
				sunshine();
			}
			JOptionPane.showMessageDialog(null, "Your " + pet + "'s happiness is now " + happinessLevel + ". (good job)");
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 20) {
				JOptionPane.showMessageDialog(null, "You must love your pet a lot because its happiness is now " + happinessLevel + ". (good job)");
				break;
			}
			}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void feedPet() {
		JOptionPane.showMessageDialog(null, "You sprinkle food on your pet. It seems to like it.");
		happinessLevel = happinessLevel + 2;
	}
	public static void waterPet() {
		JOptionPane.showMessageDialog(null, "You find a watering can and shake water on your pet. It seems to like it...?");
		happinessLevel = happinessLevel + 1;
	}
	public static void sunshine() {
		JOptionPane.showMessageDialog(null, "You put on some plastic gloves and carefully pick up your pet. You set it down outside and watch it... do whatever it does. It seems happy.");
		happinessLevel = happinessLevel + 3;
	}
}