package wordle;

import java.util.List;
import static wordle.Match.*;

enum Match {
	EXACT, NO
}

public class Wordle {

	private static final int WORD_SIZE = 5;

	public static List<Match> tally(String target, String guess) {
		if(target.length() != WORD_SIZE) {
			throw new RuntimeException("Target size must be "  + WORD_SIZE);
		}
		
		if(guess.equals(target)) {
			return List.of(EXACT,EXACT,EXACT,EXACT,EXACT);
		}
		
		return List.of(NO,NO,NO,NO,NO);		
	}
}