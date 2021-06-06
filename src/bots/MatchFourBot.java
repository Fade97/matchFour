package bots;

public interface MatchFourBot {

    /**
     * This will be called every time, your bot has to do a turn.
     *
     * @param board is the gameBoard where your bot has to do its move.
     * @return the column where your bot wants to place it's stone.
     */
    int turn(char[][] board);

    /**
     * This will be called every time, a game ends.
     *
     * @param won is true if your bot won the round or false if he loses or plays a draw.
     */
    void won(boolean won);

    /**
     * @return the name of your Bot. This has to match with your class and file name. (Adding a space or make some letters uppercase is allowed.)
     */
    String getBotName();

}
