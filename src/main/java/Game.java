public class Game {

    // Atributos

    // Constructor

    // Metodos
    public int totalScore(String game) {

        int len = game.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (game.charAt(i) == 'X') {
                sum += 10;
            } else {
                int position = Character.getNumericValue(game.charAt(i));
                sum += position;
            }
        }

        return sum;
    }
}
