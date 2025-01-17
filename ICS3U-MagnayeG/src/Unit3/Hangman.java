package Unit3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import hsa_new.Console;

public class Hangman {
	//Initializing the console
	static Console c;

	private static final String[] words = {
			"absurd", "abyss", "affix", "askew", "avenue", "awkward", "axiom", "azure", "bagpipes", "bandwagon",
			"banjo", "bayou", "beekeeper", "bikini", "blitz", "blizzard", "boggle", "bookworm", "boxcar", "boxful",
			"buckaroo", "buffalo", "buffoon", "buxom", "buzzard", "buzzing", "buzzwords", "caliph", "cobweb", "cockiness",
			"croquet", "crypt", "curacao", "cycle", "daiquiri", "dirndl", "disavow", "dizzying", "duplex", "dwarves",
			"embezzle", "equip", "espionage", "euouae", "exodus", "faking", "fishhook", "fixable", "fjord", "flapjack",
			"flopping", "fluffiness", "flyby", "foxglove", "frazzled", "frizzled", "fuchsia", "funny", "gabby", "galaxy",
			"galvanize", "gazebo", "giaour", "gizmo", "glowworm", "glyph", "gnarly", "gnostic", "gossip", "grogginess",
			"haiku", "haphazard", "hyphen", "iatrogenic", "icebox", "injury", "ivory", "ivy", "jackpot", "jaundice",
			"jawbreaker", "jaywalk", "jazziest", "jazzy", "jelly", "jigsaw", "jinx", "jiujitsu", "jockey", "jogging",
			"joking", "jovial", "joyful", "juicy", "jukebox", "jumbo", "kayak", "kazoo", "keyhole", "khaki", "kilobyte",
			"kiosk", "kitsch", "kiwifruit", "klutz", "knapsack", "larynx", "lengths", "lucky", "luxury", "lymph",
			"marquis", "matrix", "megahertz", "microwave", "mnemonic", "mystify", "naphtha", "nightclub", "nowadays",
			"numbskull", "nymph", "onyx", "ovary", "oxidize", "oxygen", "pajama", "peekaboo", "phlegm", "pixel",
			"pizazz", "pneumonia", "polka", "pshaw", "psyche", "puppy", "puzzling", "quartz", "queue", "quips",
			"quixotic", "quiz", "quizzes", "quorum", "razzmatazz", "rhubarb", "rhythm", "rickshaw", "schnapps",
			"scratch", "shiv", "snazzy", "sphinx", "spritz", "squawk", "staff", "strength", "strengths", "stretch",
			"stronghold", "stymied", "subway", "swivel", "syndrome", "thriftless", "thumbscrew", "topaz", "transcript",
			"transgress", "transplant", "triphthong", "twelfth", "twelfths", "unknown", "unworthy", "unzip", "uptown",
			"vaporize", "vixen", "vodka", "voodoo", "vortex", "voyeurism", "walkway", "waltz", "wave", "wavy",
			"waxy", "wellspring", "wheezy", "whiskey", "whizzing", "whomever", "wimpy", "witchcraft", "wizard",
			"woozy", "wristwatch", "wyvern", "xylophone", "yachtsman", "yippee", "yoked", "youthful", "yummy",
			"zephyr", "zigzag", "zigzagging", "zilch", "zipper", "zodiac", "zombie"};
	//Main method
	public static void main(String[] args) throws InterruptedException {
		c = new Console();

		//Introduction to game

		c.println("Welcome to......");
		Thread.sleep(2000);
		c.println("!!!HANGMAN-EXTREME!!!");
		Thread.sleep(1000);
		c.println("Developped by Gabriel Magnaye");
		Thread.sleep(2000);

		startGame();
	}
	//Main game method
	public static void startGame() {

		// Initialize images
		BufferedImage noGuess = loadImage("No Guesses.png");
		BufferedImage oneWrongGuess = loadImage("1 Wrong Guess.png");
		BufferedImage twoWrongGuess = loadImage("2 Wrong Guesses.png");
		BufferedImage threeWrongGuess = loadImage("3 Wrong Guesses.png");
		BufferedImage fourWrongGuess = loadImage("4 Wrong Guesses.png");
		BufferedImage fiveWrongGuess = loadImage("5 Wrong Guesses.png");
		BufferedImage sixWrongGuess = loadImage("6 Wrong Guesses.png");
		BufferedImage gameIsOver = loadImage("Game Over.png");

		playGame(noGuess, oneWrongGuess, twoWrongGuess, threeWrongGuess, fourWrongGuess, fiveWrongGuess, sixWrongGuess, gameIsOver);
	}
	//Method to store images
	public static BufferedImage loadImage(String imageName) {
		try {
			return ImageIO.read(new File("src/Unit3/Hangman Pics/" + imageName));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	//Get user guess
	public static void playGame(BufferedImage noGuess, BufferedImage oneWrongGuess, BufferedImage twoWrongGuess, BufferedImage threeWrongGuess, BufferedImage fourWrongGuess, BufferedImage fiveWrongGuess, BufferedImage sixWrongGuess, BufferedImage gameIsOver) {
		String wordToGuess = words[(int) (Math.random() * words.length)];
		char[] wordProgress = new char[wordToGuess.length()];
		for (int i = 0; i < wordToGuess.length(); i++) {
			wordProgress[i] = '_';
		}

		int incorrectGuesses = 0;
		String guessedLetters = "";
		boolean gameOver = false;

		while (!gameOver) {
			// Display current game status
			displayGameStatus(wordProgress, guessedLetters, incorrectGuesses, noGuess, oneWrongGuess, twoWrongGuess, threeWrongGuess, fourWrongGuess, fiveWrongGuess, sixWrongGuess, gameIsOver);

			c.print("Enter a letter to guess: ");
			char guess = c.readChar();
			c.readLine();

			// Check if the user has already guessed this letter
			if (guessedLetters.indexOf(guess) != -1) {
				c.println("You already guessed '" + guess + "'. Try a different letter.");
				continue;
			}

			guessedLetters += guess + " ";
			boolean correctGuess = false;

			// Check if the guess is correct
			for (int i = 0; i < wordToGuess.length(); i++) {
				if (wordToGuess.charAt(i) == guess) {
					wordProgress[i] = guess;
					correctGuess = true;
				}
			}

			if (!correctGuess) {
				incorrectGuesses++;
				if (incorrectGuesses == 6) {
					// Game Over: Display the game over image
					displayGameStatus(wordProgress, guessedLetters, incorrectGuesses, noGuess, oneWrongGuess, twoWrongGuess, threeWrongGuess, fourWrongGuess, fiveWrongGuess, sixWrongGuess, gameIsOver);
					c.println("Game Over! The word was: " + wordToGuess);
					gameOver = true;
				}
			} else if (isWordGuessed(wordProgress)) {
				// If the word is guessed, display success message
				displayGameStatus(wordProgress, guessedLetters, incorrectGuesses, noGuess, oneWrongGuess, twoWrongGuess, threeWrongGuess, fourWrongGuess, fiveWrongGuess, sixWrongGuess, gameIsOver);
				c.println("Congratulations! You guessed the word: " + wordToGuess);
				gameOver = true;
			}
		}

		// Replay the game
		c.print("Do you want to play again? (yes/no): ");
		if (c.readLine().equalsIgnoreCase("yes")) {
			startGame(); // Restart the game by calling startGame()
		} else {
			c.println("Thanks for playing! Goodbye.");
		}
	}

	public static void displayGameStatus(char[] wordProgress, String guessedLetters, int incorrectGuesses, BufferedImage noGuess, BufferedImage oneWrongGuess, BufferedImage twoWrongGuess,BufferedImage threeWrongGuess, BufferedImage fourWrongGuess, BufferedImage fiveWrongGuess,BufferedImage sixWrongGuess, BufferedImage gameIsOver) {

		// Clear the console before displaying the next game state
		c.clear();

		// Display word progress
		c.println("========== HANGMAN ==========");
		c.print("Word: ");
		for (char letter : wordProgress) {
			c.print(letter + " ");
		}
		c.println();
		c.println("Guessed Letters: " + (guessedLetters.isEmpty() ? "None" : guessedLetters));
		c.println("Attempts Remaining: " + (6 - incorrectGuesses));

		// Display the appropriate hangman image
		BufferedImage currentImage = switch (incorrectGuesses) {
		case 0 -> noGuess;
		case 1 -> oneWrongGuess;
		case 2 -> twoWrongGuess;
		case 3 -> threeWrongGuess;
		case 4 -> fourWrongGuess;
		case 5 -> fiveWrongGuess;
		case 6 -> sixWrongGuess;
		default -> null;
		};

		// Display the hangman image
		if (currentImage != null) {
			c.drawImage(currentImage, 0, 150, 120, 120, null);  
		}

		// Displays the "gameIsOver" Image
		if (incorrectGuesses == 6) {
			c.drawImage(gameIsOver, 200, 150, 120, 120, null);
		}

		c.println("=============================");
	}
	//Method to check the progress of the word
	public static boolean isWordGuessed(char[] wordProgress) {
		for (char letter : wordProgress) {
			if (letter == '_') {
				return false;
			}
		}
		return true;
	}
}