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
        assertEquals(-1, score.computeStrike('3'));
    }

    @Test
    public void computeSpareTest() {
        assertEquals(score.getSPARE(), score.computeSpare('/'));
    }

    @Test
    public void computeSpareTestFalse() {
        assertEquals(-1, score.computeSpare('2'));
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

    @Test
    public void totalScoreStrikeDoubleTest() {
        String pins = "XX9-9-9-9-9-9-9-9-";
        assertEquals(120, score.totalScore(pins));
    }

    @Test
    public void totalScoreStrikeTripleTest() {
        String pins = "XXX9-9-9-9-9-9-9-";
        assertEquals(141, score.totalScore(pins));
    }

    @Test
    public void totalScoreSpareRoundTest() {
        String pins = "5/5/5/5/5/5/5/5/5/5/5";
        assertEquals(150, score.totalScore(pins));
    }

    @Test
    public void totalScoreAllStrikesTest() {
        String pins = "XXXXXXXXXXXX";
        assertEquals(300, score.totalScore(pins));
    }

    @Test
    public void totalScoreTestNormal() {
        String pins = "9-9-9-9-9-9-9-9-9-X9-";
        assertEquals(100, score.totalScore(pins));
    }

    @Test
    public void totalScoreTestRolls() {
        String pins = "X5/X5/XX5/--5/X5/";
        assertEquals(175, score.totalScore(pins));
    }
}
