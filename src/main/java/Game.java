public class Game {

    // Attributes

    private int STRIKE = 10;
    private int ZERO = 0;
    private int SPARE = 10;
    private int sum = 0;

    // Constructors

    public int getSTRIKE() {
        return this.STRIKE;
    }

    public int getZERO() {
        return this.ZERO;
    }

    public int getSPARE() {
        return this.SPARE;
    }

    // Method's

    public int computeStrike(char strike) {

        if (strike == 'X') {
            return this.STRIKE;
        } else {
            return strike;
        }
    }

    public int computeSpare(char spare) {

        if (spare == '/') {
            return this.SPARE;
        } else {
            return spare;
        }
    }

    public int computeZero(char zero) {

        if (zero == '-') {
            return this.ZERO;
        } else {
            return zero;
        }
    }

    private void calculateStrike(char character, int i, String game) {

        sum += computeStrike(character);

        int nextPosition = Character.getNumericValue(game.charAt(i + 1));
        sum += nextPosition;

        int lastPosition = Character.getNumericValue(game.charAt(i + 2));
        sum += lastPosition;
    }

    private void calculateSpare(char character, int i, String game) {

        sum -= Character.getNumericValue(game.charAt(i - 1));
        sum += computeSpare(character);

        try {
            char spare = game.charAt(i + 1);
            sum += Character.getNumericValue(spare);
        } catch (StringIndexOutOfBoundsException spare) {
            sum += 0;
        }
    }

    public int totalScore(String game) {

        for (int i = 0; i < game.length(); i++) {

            char character = game.charAt(i);

            if (character == 'X') {

                calculateStrike(character, i, game);

            } else if (character == '/') {

                calculateSpare(character, i, game);

            } else if (character == '-'){

                sum += computeZero(character);

            } else {

                int position = Character.getNumericValue(character);
                sum += position;
            }
        }

        return sum;
    }
}
