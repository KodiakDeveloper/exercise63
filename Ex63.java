package bookExercises;

import javax.swing.JOptionPane;

public class Ex63 {

	public static void main(String[] args) {

		int lines = 5, column = 5;

		int[][] numbers = new int[lines][column];

		int userInput;

		String userAnswer;

		do {

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					userInput = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Input data" + "\nLine: " + i + "\nColumn: " + i));

					numbers[i][j] = userInput;

				}

			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					System.out.print(numbers[i][j] + "|");

				}

				System.out.println();

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");
	}

}
