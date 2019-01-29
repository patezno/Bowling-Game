import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {

    @Test
    void testTotalScore1() {
        String pins = "12345123451234512345";
        Game score = new Game();
        int total =  60;
        assertEquals(total, score.totalScore(pins));
    }

    @Test
    void testTotalScoreStrike() {
        String pins = "XXXXXXXXXXXX";
        Game score = new Game();
        int total = 300;
        assertEquals(total, score.totalScore(pins));
    }
}
