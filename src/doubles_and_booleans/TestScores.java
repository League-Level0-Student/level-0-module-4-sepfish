package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String testScore = JOptionPane.showInputDialog("Enter your test score:");
		double testScoreNumber = Double.parseDouble(testScore);
		if (testScoreNumber <= 60) {
			JOptionPane.showMessageDialog(null, "Geez, what happened?");
		} else
		if (testScoreNumber < 80) {
			JOptionPane.showMessageDialog(null, "That score's okay.");
		} else
		if (testScoreNumber <= 90) {
			JOptionPane.showMessageDialog(null, "Hey, that's pretty good.");
		} else
		if (testScoreNumber <= 100) {
			JOptionPane.showMessageDialog(null, "Good job.");
		} else {
			JOptionPane.showMessageDialog(null, "Uhh... good job, I guess... Did you really get that score?");
		}
	}
}
