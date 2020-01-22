package unittestdemo;

public class App {
	
	public LongestWord getLongestWord(String sentence) {
		
		LongestWord newWord = new LongestWord();
		if(sentence == null) {
			newWord.setLongestword("");
			newWord.setLongestwordLength(0);
			return newWord;
		}
		String [] wordArray = sentence.replaceAll("[^a-zA-Z0-9']", " ").trim().split(" ");
		int longest = 0;
		String longestWord = "";
		for(String word : wordArray ) {
			String tempWord = word.replaceAll("[^a-zA-Z0-9]", "");
			if(tempWord.length() > longest) {
				longest = tempWord.length();
				longestWord = word;
			}
		}
		newWord.setLongestword(longestWord);
		newWord.setLongestwordLength(longest);
		
		return newWord;
	}
	
}
