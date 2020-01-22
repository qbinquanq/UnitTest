package unittestdemo;

import static org.testng.Assert.assertEquals;
import org.junit.Test;

public class AppUnitTest {

	/*
	 * assume if the parameter is empty, the output of length should be 0, and word should be empty
	 */
	@Test
	public void getLongestWord_EmptyParametter() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("");
		assertEquals(0, longestWord.getLongestwordLength(), "The longest word should be in 0 length");
		assertEquals("", longestWord.getLongestword(), "The longest word should be empty");
	}

	/*
	 * assume if the parameter is null, the output of length should be 0, and word
	 * should be empty
	 */
	@Test
	public void getLongestWord_NullParameter() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord(null);
		assertEquals(0, longestWord.getLongestwordLength(), "The longest word should be 0 length if parameter is null");
		assertEquals("", longestWord.getLongestword(), "The longest word should be empty if parameter is null");
	}
	
	/* assume the number can be treated as valid word */ 
	@Test
	public void getLongestWord_OneNumber() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("5");
		assertEquals(1, longestWord.getLongestwordLength(), "The longest word should be length 1");
		assertEquals("5", longestWord.getLongestword(), "The longest word should be '5'");
	}
	
	@Test
	public void getLongestWord_SpaceInput() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord(" ");
		assertEquals(0, longestWord.getLongestwordLength(), "The longest word should be length 0");
		assertEquals("", longestWord.getLongestword(), "The longest word should be empty");
	}
	
	@Test
	public void getLongestWord_OneWordInSentence() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("UnitTest");
		assertEquals(8, longestWord.getLongestwordLength(), "The longest word should be length 8");
		assertEquals("UnitTest", longestWord.getLongestword(), "The longest word should be 'UnitTest'");
	}
	
	@Test
	public void getLongestWord_TwoWordsInSentence() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("UnitTest new");
		assertEquals(8, longestWord.getLongestwordLength(), "The longest word should be length 8");
		assertEquals("UnitTest", longestWord.getLongestword(), "The longest word should be 'UnitTest'");
	}
	
	/* assume the input has the empty space in the beginning of the sentence */
	@Test
	public void getLongestWord_EmptySpaceInBegin_TwoWordsInSentence() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord(" UnitTest new");
		assertEquals(8, longestWord.getLongestwordLength(), "The longest word should be length 8");
		assertEquals("UnitTest", longestWord.getLongestword(), "The longest word should be 'UnitTest'");
	}
	
	/* assume the input has the empty space in the end of the sentence */
	@Test
	public void getLongestWord_EmptySpaceInEnd_TwoWordsInSentence() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("UnitTest new ");
		assertEquals(8, longestWord.getLongestwordLength(), "The longest word should be length 8");
		assertEquals("UnitTest", longestWord.getLongestword(), "The longest word should be 'UnitTest'");
	}
	
	@Test
	public void getLongestWord_LongestWordInTheMiddle() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("UnitTest new Application Class");
		assertEquals(11, longestWord.getLongestwordLength(), "The longest word should be length 11");
		assertEquals("Application", longestWord.getLongestword(), "The longest word should be 'Application'");
	}
	
	@Test
	public void getLongestWord_LongestWordInTheEnd() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("UnitTest new App Class for new generation");
		assertEquals(10, longestWord.getLongestwordLength(), "The longest word should be length 10");
		assertEquals("generation", longestWord.getLongestword(), "The longest word should be 'generation'");
	}
	
	/*
	 * assume there are two characters with same length, always return the first
	 * caught word.
	 */
	@Test
	public void getLongestWord_2SameLongestWord() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("Unit Test new App Class with Junit tag");
		assertEquals(5, longestWord.getLongestwordLength(), "The longest word should be length 5");
		assertEquals("Class", longestWord.getLongestword(), "The longest word should be 'Class'");
	}
	
	/* assume the input has special character not in the range [A-Z][a-z] */
	@Test
	public void getLongestWord_OneSpecialCharacter() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord(">");
		assertEquals(0, longestWord.getLongestwordLength(), "The longest word should be length 0");
		assertEquals("", longestWord.getLongestword(), "The longest word should be empty");
	}
	
	/*
	 * assume the special character is between the two words, these two words can't
	 * be treated as one word after eliminate the special character
	 */	
	@Test
	public void getLongestWord_SpecialBetweenWords() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("cow>jumped^over*Origination");
		assertEquals(11, longestWord.getLongestwordLength(), "The longest word should be length 11");
		assertEquals("Origination", longestWord.getLongestword(), "The longest word should be 'Origination'");
	}
	
	@Test
	public void getLongestWord_SpecialCharacter_LeadingAndTrailingEmptySpace_Numbers() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord(" “The cow>jumped^over_the%moon> 8976. ");
		assertEquals(6, longestWord.getLongestwordLength(), "The longest word should be length 6");
		assertEquals("jumped", longestWord.getLongestword(), "The longest word should be 'jumped'");
	}
	
	@Test
	public void getLongestWord_RegularSentence() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("The cow jumped over the moon.");
		assertEquals(6, longestWord.getLongestwordLength(), "The longest word should be length 6");
		assertEquals("jumped", longestWord.getLongestword(), "The longest word should be 'jumped'");
	}
	
	@Test
	public void getLongestWord_WordsWithPunctuation() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("They've done the work at the office");
		assertEquals(6, longestWord.getLongestwordLength(), "The longest word should be length 6");
		assertEquals("They've", longestWord.getLongestword(), "The longest word should be 'They've'");
	}
	
	@Test
	public void getLongestWord_WordsWithPunctuation_LongestHasNoPunctuation() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("They've done the work at the offices");
		assertEquals(7, longestWord.getLongestwordLength(), "The longest word should be length 7");
		assertEquals("offices", longestWord.getLongestword(), "The longest word should be 'offices'");
	}
	
	@Test
	public void getLongestWord_WordsWithMorePunctuation() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("They'''''''ve done the work at the offices");
		assertEquals(7, longestWord.getLongestwordLength(), "The longest word should be length 7");
		assertEquals("offices", longestWord.getLongestword(), "The longest word should be 'offices'");
	}
	
	@Test
	public void getLongestWord_WordsWithSemicolon() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("This is my words: I get it.");
		assertEquals(5, longestWord.getLongestwordLength(), "The longest word should be length 5");
		assertEquals("words", longestWord.getLongestword(), "The longest word should be 'words'");
	}
	
	@Test
	public void getLongestWord_WordsWithMoreDots() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("This is my words: I get it......");
		assertEquals(5, longestWord.getLongestwordLength(), "The longest word should be length 5");
		assertEquals("words", longestWord.getLongestword(), "The longest word should be 'words'");
	}
	
	@Test
	public void getLongestWord_OnlyQuote() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("''''''");
		assertEquals(0, longestWord.getLongestwordLength(), "The longest word should be length 0");
		assertEquals("", longestWord.getLongestword(), "The longest word should be empty");
	}
	
	@Test
	public void getLongestWord_TheWordsWithHyphen() {
		App appClass = new App();
		LongestWord longestWord = new LongestWord();
		longestWord = appClass.getLongestWord("There was a build-up of traffic on the ring road.");
		assertEquals(7, longestWord.getLongestwordLength(), "The longest word should be length 7");
		assertEquals("traffic", longestWord.getLongestword(), "The longest word should be 'traffic'");
	}
}
