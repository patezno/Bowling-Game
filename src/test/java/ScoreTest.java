import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ScoreTest {

    private Game score = null;

    @Before
    public void init() {
        score = new Game();
    }

    @Test
    public void computeStrikeTest() {
        assertEquals(score.getSTRIKE(), score.computeStrike('X'));
    }

    @Test
    public void computeStrikeFalseTest() {
        assertEquals(0, score.computeStrike('3'));
    }

    @Test
    public void totalScoreNormalTest() {
        String pins = "12345123451234512345";
        assertEquals(60, score.totalScore(pins));
    }

    @Test
    public void totalScoreStrikeTest() {
        String pins = "X123";
        assertEquals(19, score.totalScore(pins));
    }

    @Test
    public void totalScoreSpareTest() {
        String pins = "9/";
        assertEquals(10, score.totalScore(pins));
    }
}
