import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		

	}

	/**
	 * Method that inputs all the txt data into an ArrayList of Strings signifying
	 * each word in the file
	 * 
	 * 
	 * @param file
	 * 			Gives method a txt file
	 * @return 
	 * 			ArrayList of Strings that represent the words in the text file
	 * @throws IOException 
	 */
	public static ArrayList<String> load(String file) throws IOException {
		BufferedReader start = new BufferedReader(new FileReader(file));
		File startFile = new File(file);
		Scanner fileScanner = new Scanner(startFile);
		ArrayList<String> words = new ArrayList<>();
		
		//Runs through the text file adding each word to the ArrayList
		while(fileScanner.hasNext()) {
			String word = fileScanner.next();
			//******Make sure there are no extraneous characters******
			if(wordAuthenticator(word) == false) {	
				word = wordCorrection(word);
			}
			words.add(word);	
		}
				
		
		fileScanner.close();
		start.close();
		return words;
	}
	
	//To-Do
	public static boolean wordAuthenticator(String str) {
		
		return true;
	}
	
	//To-Do
	public static String wordCorrection(String str) {
		
		return str;
	}
}
