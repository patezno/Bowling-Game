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
    public void computeSpareTest() {
        assertEquals(10, score.computeSpare('/'));
    }

    @Test
    public void computeSpareTestFalse() {
        assertEquals(0, score.computeSpare('2'));
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
        String pins = "95/";
        assertEquals(19, score.totalScore(pins));
    }

    @Test
    public void totalScorePinTest() {
        String pins = "34-";
        assertEquals(7, score.totalScore(pins));
    }
}
