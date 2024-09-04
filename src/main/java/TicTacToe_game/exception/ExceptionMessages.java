package TicTacToe_game.exception;

public enum ExceptionMessages {
    INVALID_MOVE_NUMBER_3X3("Invalid move. Choose a number from 1 to 9.");

    private final String errorMessage;

    ExceptionMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
