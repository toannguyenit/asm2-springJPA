package vn.edu.likelion.asm2.model;

public class ErrorHandler extends RuntimeException {
    public ErrorHandler(String msg) {
        super(msg);
    }
}
