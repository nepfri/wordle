package wordle;

import static org.junit.Assert.*;
import static wordle.Wordle.tally;
import static wordle.Match.*;
import java.util.List;
import org.junit.Test;

public class WordleTest {
	
	@Test
	public void canary() {		
		assertTrue(true);
	}
	
	@Test
	public void tallyForTargetFAVORAndGuessFAVOR() {		
		List<Match> response =tally("FAVOR", "FAVOR");
		
		assertEquals(List.of(EXACT,EXACT,EXACT, EXACT, EXACT), response);
	}
	
	@Test
	public void tallyForTargetFAVORAndGuessTESTS() {		
		List<Match> response =tally("FAVOR", "TESTS");
		
		assertEquals(List.of(NO,NO,NO,NO,NO), response);
	}
}
