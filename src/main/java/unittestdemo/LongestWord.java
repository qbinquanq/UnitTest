package unittestdemo;

public class LongestWord {
	private int longestwordLength;
	private String longestword;
	
	public LongestWord(int longestwordLength, String longestword) {
		super();
		this.longestwordLength = longestwordLength;
		this.longestword = longestword;
	}
	public LongestWord() {
	}
	public int getLongestwordLength() {
		return longestwordLength;
	}
	public void setLongestwordLength(int longestwordLength) {
		this.longestwordLength = longestwordLength;
	}
	public String getLongestword() {
		return longestword;
	}
	public void setLongestword(String longestword) {
		this.longestword = longestword;
	}
}
