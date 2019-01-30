public class Game {

    // Attributes

    private int STRIKE = 10;
    private int SPELL = 0;

    // Constructors

    public int getSTRIKE() {
        return this.STRIKE;
    }

    public int getSPELL() {
        return this.SPELL;
    }

    // Method's

    public int computeStrike(char strike) {
        if (strike == 'X') {
            return this.STRIKE;
        } else {
            return this.SPELL;
        }
    }

    public int totalScore(String game) {

        int len = game.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            char character = game.charAt(i);
            if (character == 'X') {
                sum += computeStrike(character);
                int nextPosition = Character.getNumericValue(game.charAt(i + 1));
                sum += nextPosition;
                int lastPosition = Character.getNumericValue(game.charAt(i + 2));
                sum += lastPosition;
                continue;
            }
            int position = Character.getNumericValue(game.charAt(i));
            sum += position;
        }

        return sum;
    }
}
