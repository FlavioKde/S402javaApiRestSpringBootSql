package cat.itacademy.s04.t02.n02.exception.exceptions;

import cat.itacademy.s04.t02.n02.model.entity.Fruit;

public class InvalidFruitDataException extends RuntimeException {
    public InvalidFruitDataException(Fruit fruit) {
        super("A name is needed to be able to validate");
    }
}
