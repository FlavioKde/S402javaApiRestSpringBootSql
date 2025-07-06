package cat.itacademy.s04.t02.n02.exception.handlers;


import cat.itacademy.s04.t02.n02.exception.exceptions.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n02.exception.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.exception.exceptions.InvalidFruitDataException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //error 409
    @ExceptionHandler(FruitAlreadyExistException.class)
    public ResponseEntity<Map<String, String>> handleFruitAlreadyExist(FruitAlreadyExistException e) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("error", e.getMessage()));
    }


    //error 404
    @ExceptionHandler(FruitNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleFruitNotFound(FruitNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", e.getMessage()));
    }

    //error 400
    @ExceptionHandler(InvalidFruitDataException.class)
    public ResponseEntity<Map<String, String>> handleInvalidFruitData(InvalidFruitDataException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("error", e.getMessage()));
    }




}
