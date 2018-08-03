package doubles_and_booleans;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		//variables
				String yeet1 = "A Risk";
				
				//code
				String crime = JOptionPane.showInputDialog("You're a criminal being tried for something in front of the king...");
				JOptionPane.showMessageDialog(null, "The king and his guards read the captian's report of the " + crime + ". \nMeanwhile, you're a bit bored and decide to try to escape.");
				int ans = JOptionPane.showConfirmDialog(null, "A small voice asks you if you're 100% sure about this...");
			
				if (ans == 1) {
					JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
				}else {
					JOptionPane.showMessageDialog(null, "It's settled, then. \nYou look around for a means of escape.");
					JOptionPane.showMessageDialog(null, "You loosen the bindings tied around your wrists easily. They weren't tied in the proper way.");
					JOptionPane.showMessageDialog(null, "It seems like the guards to your left and right aren't paying attention. Maybe you could take one of their weapons...");
					int weap1 = JOptionPane.showOptionDialog(null, "Who do you go for?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Right", "Left", "You know what nevermind"}, null);
				
				//PATH 0
					if (weap1 == 0) {
					JOptionPane.showMessageDialog(null, "Unfortulately, he was watching you out of the corner of your eye and grabbed your hand before it reached his dagger. \nYou're in real trouble now.");
					JOptionPane.showMessageDialog(null, "END PATH 0-0");
				}
				//PATH 1
				if (weap1 == 1) {
					JOptionPane.showMessageDialog(null, "You pull on his dagger and find you're able to slip it out of his sheath without anyone noticing. \nYou've got a weapon now.");
					JOptionPane.showMessageDialog(null, "There's a door to your left where you can try and escape, but you know that there's a loose floorboard underneath you that leads to the sewers. \nThe floorboard is more risky, but the door will cause a bigger fight.");
					int door = JOptionPane.showOptionDialog(null, "Which one do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Door", "Floorboard", "You know what nevermind"}, null);
					
					if (door == 2) {
						JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
						JOptionPane.showMessageDialog(null, "END PATH 1-0");
					}
					//PATH 1-1
					if (door == 1) {
						JOptionPane.showMessageDialog(null, "You casually slip the tip of your boot under the floorboard until you can see the hole that lies beneath. \nYou see the king lean in to discuss something with his men, and you decide to take your chance.");
						JOptionPane.showMessageDialog(null, "With an expertly practiced move - you've done this many times before - you quickly slip off the floorboard and slide down the hole before the guards have a chance to react.");
						JOptionPane.showMessageDialog(null, "The sewers stink, but you suppose it's better than being chained up as you run for your life.");
						int sewerAlt = JOptionPane.showOptionDialog(null, "Soon, you've come to a fork in the sewers. Which way do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Right",  "Middle", "Left"}, null);
						
						//PATH 1-1-0
							if (sewerAlt == 2) {
								JOptionPane.showMessageDialog(null, "You hurry down the left path. Well, it wasn't a path as much as a damp, dark hallway.");
							}
						//PATH 1-1-1
							if (sewerAlt == 1) {
								JOptionPane.showMessageDialog(null, "Of course, you had to choose the most heavily-guarded path of the sewers. \nThe middle path was commonly used to sneak into the castle, so the king had stationed some guards there.");
								JOptionPane.showMessageDialog(null, "They see you approaching, and unsheath their swords...");
								JOptionPane.showMessageDialog(null, "You raise your dagger in response. You're a trained assassin. You can take them down.");
							}
						//PATH 1-1-2
							if (sewerAlt == 0) {
								JOptionPane.showMessageDialog(null, "You hurry down the right path. The ceiling slopes down farther and farther, and you become a little claustrophobic.");
								JOptionPane.showMessageDialog(null, "Suddenly, the floor drops out from underneath you and you land in the murky water with a splash. \nDisgusting.");
								JOptionPane.showMessageDialog(null, "You slowly swim through the murky sewage, trying not to think about what you're touching.");
								JOptionPane.showMessageDialog(null, "The shouts of the guards fade as you head farther and farther away from them...");
								JOptionPane.showMessageDialog(null, "You reach the end of the tunnel and find yourself at a gate. Peeking through it, you check for any guards and find none.");
								JOptionPane.showMessageDialog(null, "You use your dagger to pry open the gate, finally climbing out of the disgusting sewer.");
								JOptionPane.showMessageDialog(null, "The sewer had deposited you on a path you knew well - it took you straight out of the castle.");
								JOptionPane.showMessageDialog(null, "You made it. You escaped.");
								JOptionPane.showMessageDialog(null, "Now time for a bath.");
								JOptionPane.showMessageDialog(null, "SUCCESS - END PATH 1-1-2");
							}
					
					}
					//PATH 1-2
					if (door == 0) {
						JOptionPane.showMessageDialog(null, "The king leans in to discuss something with his men, and you decide to take your chance.");
						JOptionPane.showMessageDialog(null, "You run as fast as you can towards the door with the dagger to shield you. The shouts of the guard follow you as you race through the (unlocked) door.");
						JOptionPane.showMessageDialog(null, "A guard lunges towards you and you hold out the dagger to stop him.");
						JOptionPane.showMessageDialog(null, "The dagger cuts him down and you're able to run out the door and jam it behind you. \nThat'll buy you some time.");
					}
					
				}
					
				//PATH 2
				if (weap1 == 2) {
					JOptionPane.showMessageDialog(null, "You suppose... you can make it without a weapon.");
					JOptionPane.showMessageDialog(null, "There's a door to your left where you can try and escape, but you know that there's a loose floorboard underneath you that leads to the sewers. \nThe floorboard is more risky, but the door will cause a bigger fight.");
					int doorAlt = JOptionPane.showOptionDialog(null, "Which one do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Door", "Floorboard", "You know what nevermind"}, null);
						
					if (doorAlt == 2) {
						JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
						JOptionPane.showMessageDialog(null, "END PATH 2-0");
					}
					//PATH 2-1
					if (doorAlt == 1) {
						JOptionPane.showMessageDialog(null, "You casually slip the tip of your boot under the floorboard until you can see the hole that lies beneath. \nYou see the king lean in to discuss something with his men, and you decide to take your chance.");
						JOptionPane.showMessageDialog(null, "With an expertly practiced move - you've done this many times before - you quickly slip off the floorboard and slide down the hole before the guards have a chance to react.");
						JOptionPane.showMessageDialog(null, "The sewers stink, but you suppose it's better than being chained up as you run for your life.");
						int sewerAlt = JOptionPane.showOptionDialog(null, "Soon, you've come to a fork in the sewers. Which way do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Right",  "Middle", "Left"}, null);
					
					//PATH 2-1-0
						if (sewerAlt == 2) {
							JOptionPane.showMessageDialog(null, "You hurry down the left path. Well, it wasn't a path as much as a damp, dark hallway.");
						}
					//PATH 2-1-1
						if (sewerAlt == 1) {
							JOptionPane.showMessageDialog(null, "Of course, you had to choose the most heavily-guarded path of the sewers. \nThe middle path was commonly used to sneak into the castle, so the king had stationed some guards there.");
							JOptionPane.showMessageDialog(null, "They see you approaching, and unsheath their swords...");
							JOptionPane.showMessageDialog(null, "If only you'd nabbed that dagger.");
							JOptionPane.showMessageDialog(null, "END PATH 2-1-1");
						}
					//PATH 2-1-2
						if (sewerAlt == 0) {
							JOptionPane.showMessageDialog(null, "You hurry down the right path. The ceiling slopes down farther and farther, and you become a little claustrophobic.");
							JOptionPane.showMessageDialog(null, "Suddenly, the floor drops out from underneath you and you land in the murky water with a splash. \nDisgusting.");
							JOptionPane.showMessageDialog(null, "You slowly swim through the murky sewage, trying not to think about what you're touching.");
							JOptionPane.showMessageDialog(null, "The shouts of the guards fade as you head farther and farther away from them...");
							JOptionPane.showMessageDialog(null, "You reach the end of the tunnel and find yourself at a gate. Peeking through it, you check for any guards and find none.");
							JOptionPane.showMessageDialog(null, "You unsuccessfully try to pry the gate off and sigh. How are you going to get out now?");
							JOptionPane.showConfirmDialog(null, "Will you go back?");
							
						//PATH 2-1-2-2
							if (ans == 0) {
								JOptionPane.showMessageDialog(null, "You decide not to go back and to keep brainstorming ways to escape.");
							}
							if (ans == 1) {
								JOptionPane.showMessageDialog(null, "You decide to quietly head back through the murky water. Thankfully, you don't hear the guards as you climb back onto the path.");
							}
						}
					
					
				}	
					//PATH 2-2
					if (doorAlt == 0) {
						JOptionPane.showMessageDialog(null, "The king leans in to discuss something with his men, and you decide to take your chance.");
						JOptionPane.showMessageDialog(null, "You run as fast as you can towards the door. The shouts of the guard follow you as you race through the (unlocked) door.");
						JOptionPane.showMessageDialog(null, "A guard lunges towards you and, on instinct, you reach out a hand to stop him.");
						JOptionPane.showMessageDialog(null, "He grabs your wrist and yanks you back into the room. 'Trying to escape?' he hisses into your ear. 'Not a chance.'");
						JOptionPane.showMessageDialog(null, "You're in real trouble now.");
						JOptionPane.showMessageDialog(null, "END PATH 2-2");
					}
					
				}
					
				}
			}


}

