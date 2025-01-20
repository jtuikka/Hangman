package Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman{


	private String word;
	
	private int guesses;
	
	private List<Character> guessedLetters = new ArrayList<Character>();
	
	public void setWord(List<String> wordlist) {
		Random random = new Random();
		int size = wordlist.size();
		int wordNum = random.nextInt(size);
		word = wordlist.get(wordNum);
		
	}
	
	public boolean guess(Character c) {
		guessedLetters.add(c);
		return false;
	}

	public List<Character> guesses(){
		
		return null;
	}
	
	public int guessesLeft() {
		return guesses;
	}
	
	public String word() {
		return word;
	}
	
	public boolean theEnd() {
		return false;
	}
	
}
