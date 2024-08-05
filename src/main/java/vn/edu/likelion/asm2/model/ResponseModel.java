package vn.edu.likelion.asm2.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ResponseModel {
    private final boolean status = true;
    private String timestamp;
    private Object data;

    public ResponseModel(Object data) {
        this.timestamp = LocalDate.now().toString();
        this.data = data;
    }
}