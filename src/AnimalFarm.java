import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */

		for (int i = 0; i < 100; i++) {
			String animal = JOptionPane.showInputDialog("What animal do you want");
			if (animal.equals("cow")) {
				playMoo();
			} else if (animal.equals("duck")) {
				playQuack();

			} else if (animal.equals("dog")) {
				playWoof();
			}
		}
	}
	
//	BONUS add logic and methods for playing sounds for other animals (e.g., cat and llama)

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "/Users/awasicek/Desktop/League/league-sounds/quack.wav";
	String mooFile = "/Users/awasicek/Desktop/League/league-sounds/moo.wav";
	String woofFile = "/Users/awasicek/Desktop/League/league-sounds/woof.wav";
	String meowFile = "/Users/awasicek/Desktop/League/league-sounds/meow.wav";
	String llamaFile = "/Users/awasicek/Desktop/League/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
