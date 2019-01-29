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
    public void testTotalScore1() {
        String pins = "12345123451234512345";
        int total = 60;
        assertEquals(total, score.totalScore(pins));
    }

    @Test
    public void testTotalScoreStrike() {
        String pins = "XXXXXXXXXXXX";
        int total = 300;
        assertEquals(total, score.totalScore(pins));
    }
}
