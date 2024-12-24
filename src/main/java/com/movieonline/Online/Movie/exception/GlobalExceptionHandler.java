package com.movieonline.Online.Movie.exception;

import com.movieonline.Online.Movie.controller.TemplateController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final TemplateController templateController;

    public GlobalExceptionHandler(TemplateController templateController) {
        this.templateController = templateController;
    }

    @ExceptionHandler({UserRegistrationConflictException.class})
    public String handleUserRegistrationConflictException(UserRegistrationConflictException exception, Model model) {
        model.addAttribute("userAlreadyExist", exception.getMessage());
        templateController.pageDetails(model);
        return "login";
    }
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<Map<String, String>> handleRuntimeException(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap();

        exception.getBindingResult().getAllErrors().forEach((error) -> {
            errors.put(((FieldError) error).getField(), error.getDefaultMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}
