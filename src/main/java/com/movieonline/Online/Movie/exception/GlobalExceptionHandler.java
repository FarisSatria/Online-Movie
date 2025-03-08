package com.movieonline.Online.Movie.exception;

import com.movieonline.Online.Movie.controller.TemplateController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final TemplateController templateController;

    public GlobalExceptionHandler(TemplateController templateController) {
        this.templateController = templateController;
    }
    @ExceptionHandler({FeedbackInvalidCredentials.class})
    public ResponseEntity<Object> handleFeedbackInvalidCredentials(FeedbackInvalidCredentials exception){
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
    @ExceptionHandler({MovieBookingToggle.class})
    public String handleMovieEnableConflict(MovieBookingToggle exception, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("movieBookingToggle", exception.getMessage());
        return "redirect:/dashboard/booking";
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
