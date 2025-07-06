package cat.itacademy.s04.t02.n02.exception.exceptions;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(Long id) {
        super("The fruit that mentions does not exist");
    }
}
