package Homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordList {
	

	private List<String> wordlist;
	
	public WordList(String filename) {
		List<String> wordlist = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while(line != null) {
				wordlist.add(line.toLowerCase());
				line = reader.readLine();
			}
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		this.wordlist = wordlist;
	}

	public List<String> giveWords(){
		return wordlist;
	}
	
}
