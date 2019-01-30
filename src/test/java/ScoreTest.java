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
    public void testComputeStrike() {
        assertEquals(score.getSTRIKE(), score.computeStrike('X'));
    }

    @Test
    public void testComputeStrikeFalse() {
        assertEquals(0, score.computeStrike('3'));
    }

    @Test
    public void testTotalScore1() {
        String pins = "12345123451234512345";
        assertEquals(60, score.totalScore(pins));
    }

    @Test
    public void testTotalScoreStrike() {
        String pins = "X123";
        assertEquals(19, score.totalScore(pins));
    }
}
