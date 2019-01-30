public class Game {

    // Attributes

    private int STRIKE = 10;
    private int SPELL = 0;
    private int SPARE = 10;

    // Constructors

    public int getSTRIKE() {
        return this.STRIKE;
    }

    public int getSPELL() {
        return this.SPELL;
    }

    public int getSPARE() {
        return this.SPARE;
    }

    // Method's

    public int computeStrike(char strike) {
        if (strike == 'X') {
            return this.STRIKE;
        } else {
            return this.SPELL;
        }
    }
    public int computeSpare(char spare) {
        if (spare == '/') {
            return this.SPARE;
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
            if (character == '/') {
                sum -= Character.getNumericValue(game.charAt(i - 1));
                sum += computeSpare(character);
                continue;
            }

            int position = Character.getNumericValue(character);
            sum += position;
        }

        return sum;
    }
}
