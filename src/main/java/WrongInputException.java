public class WrongInputException extends DukeException {
    public WrongInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Input not in the correct format.";
    }
}
