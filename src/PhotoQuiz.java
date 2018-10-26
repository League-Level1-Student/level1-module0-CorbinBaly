
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String Meme = "https://i.kym-cdn.com/entries/icons/original/000/027/072/thanos_car_2.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component thanoscar;
		// 3. use the "createImage()" method below to initialize your Component
		thanoscar = createImage(Meme);
		// 4. add the image to the quiz window
		quizWindow.add(thanoscar);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String Quest = JOptionPane.showInputDialog("What trilogy of movies is thanos from?");
		// 7. print "CORRECT" if the user gave the right answer
		if (Quest.equals("Avengers")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(thanoscar);
		// 10. find another image and create it (might take more than one line of code)
		String link = "http://images.pushsquare.com/5930d8cd25871/fortnite-skins-list-all-battle-pass-seasonal-and-special-outfits.900x.jpg";
		Component orangeJustice;
		// 11. add the second image to the quiz window
		orangeJustice = createImage(link);
		quizWindow.add(orangeJustice);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
String bopIt=JOptionPane.showInputDialog("What game is this from?");
		// 14+ check answer, say if correct or incorrect, etc.
	if(bopIt.equalsIgnoreCase("Fortnite")) {
		System.out.println("CORRECT");
	}
	else {
		System.out.println("INCORRECT");
	}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
