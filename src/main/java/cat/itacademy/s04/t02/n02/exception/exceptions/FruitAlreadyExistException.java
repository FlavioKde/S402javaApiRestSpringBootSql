package cat.itacademy.s04.t02.n02.exception.exceptions;

public class FruitAlreadyExistException extends RuntimeException {
    public FruitAlreadyExistException(String name) {
        super("The proportionate ID is not correct");
    }
}
