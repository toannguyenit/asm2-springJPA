package vn.edu.likelion.asm2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ExceptionResponse {
    private final boolean status = false;
    private String timestamp;
    private Object message;

    public ExceptionResponse(Object message) {
        this.timestamp = LocalDate.now().toString();
        this.message = message;
    }
}